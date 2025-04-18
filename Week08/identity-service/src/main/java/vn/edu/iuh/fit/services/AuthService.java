/*
 * @ {#} AuthService.java   1.0     18/04/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.services;

import org.springframework.http.ResponseEntity;
import vn.edu.iuh.fit.dtos.SignInRequest;
import vn.edu.iuh.fit.dtos.SignUpRequest;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   18/04/2025
 * @version:    1.0
 */
public interface AuthService {
    ResponseEntity<?> signIn(SignInRequest signInRequest);
    ResponseEntity<?> signUp(SignUpRequest signUpRequest);
}
