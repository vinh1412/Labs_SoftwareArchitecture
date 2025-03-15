/*
 * @ {#} TaxContext.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exercise02.statePattern;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class Product {
    private String name;
    private double price;
    private TaxState taxContext;

    public Product(String name, double price, TaxState taxContext) {
        this.name = name;
        this.price = price;
        this.taxContext = taxContext;
    }

    public double calculateTax() {
        return taxContext.calculateTax(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TaxState getTaxContext() {
        return taxContext;
    }

    public void setTaxContext(TaxState taxContext) {
        this.taxContext = taxContext;
    }

    public void printTax() {
        System.out.println(name + " có thuế: " + calculateTax());
    }
}
