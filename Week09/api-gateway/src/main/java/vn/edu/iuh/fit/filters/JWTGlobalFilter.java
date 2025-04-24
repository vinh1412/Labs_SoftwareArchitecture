package vn.edu.iuh.fit.filters;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.stream.Collectors;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class JWTGlobalFilter implements WebFilter {

    private static final String SECRET_KEY = "6d7f6e6f4f3a9f97f2616c740213adf6a3acfb9f5b7178ab8f12f5d531e98d3a";

    private String extractJwtFromRequest(ServerWebExchange exchange) {
        String bearerToken = exchange.getRequest().getHeaders().getFirst("Authorization");
        if (bearerToken == null || !bearerToken.startsWith("Bearer ")) {
            throw new JwtException("Missing JWT token");
        }
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }

    private Claims extractClaims(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
        }
        catch (JwtException e) {
            return null;
        }
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {

        System.out.println(exchange.getRequest().getURI());
        if (exchange.getRequest().getURI().toString().contains("/auth/login") ||
                exchange.getRequest().getURI().toString().contains("/auth/register")) {

            return chain.filter(exchange);
        }

        // Extract token from request
        String token = extractJwtFromRequest(exchange);

        if (token == null || token.isEmpty()) {
            return Mono.error(new JwtException("Missing JWT token"));
        }

        // Extract claims from the token
        Claims claims = extractClaims(token);
        System.out.println(claims);

        // Validate token
        if (token == null || claims == null) {
            return Mono.error(new JwtException("Invalid or missing JWT token"));
        }

        // Create authorities list from claims
        List<SimpleGrantedAuthority> authorities = extractAuthoritiesFromClaims(claims);

        // Create an Authentication object
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                claims.getSubject(), null, authorities
        );

        System.out.println(authentication);

        // Create an empty SecurityContext and set the authentication object
        SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
        securityContext.setAuthentication(authentication);
        SecurityContextHolder.setContext(securityContext);

        // Set token to header
        exchange.getRequest().mutate().header("Authorization", "Bearer " + token);

        // Save the SecurityContext in the session using SecurityContextRepository
        return exchange.getSession()
                .flatMap(session -> {
                    session.getAttributes().put("SPRING_SECURITY_CONTEXT", securityContext);
                    return chain.filter(exchange);
                });
   }

    private List<SimpleGrantedAuthority> extractAuthoritiesFromClaims(Claims claims) {
        Object rolesObject = claims.get("roles");

        if (rolesObject instanceof List) {
            List<String> roles = ((List<?>) rolesObject).stream()
                    .filter(item -> item instanceof Map)
                    .map(item -> ((Map<?, ?>) item).get("authority"))
                    .filter(Objects::nonNull)
                    .map(Object::toString)
                    .collect(Collectors.toList());

            System.out.println(roles);

            return roles.stream()
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
        } else {
            System.out.println("Roles are not in the expected format");
            return Collections.emptyList();
        }
    }
}
