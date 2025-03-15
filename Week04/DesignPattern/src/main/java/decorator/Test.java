/*
 * @ {#} Test.java   1.0     13/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package decorator;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   13/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        Car car = new BasicCar();
        car.assemble();
        System.out.println("\n*****");

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
        System.out.println("\n*****");

        Car sportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        sportsCar.assemble();
    }
}
