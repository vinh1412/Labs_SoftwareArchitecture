/*
 * @ {#} Test.java   1.0     15/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package CoPhieu;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   15/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        CoPhieu topic1 = new CoPhieu();
        CoPhieu topic2 = new CoPhieu();
        Observer obj1 = new NhaThau("Nha thau 1", "20");
        Observer obj2 = new NhaThau("Nha thau 2", "30");
        Observer obj3 = new NhaThau("Nha thau 3", "40");

        topic1.register(obj1);
        topic1.register(obj2);
        topic1.register(obj3);

        topic2.register(obj1);
        topic2.register(obj2);

        obj1.setSubject(topic1);
        obj2.setSubject(topic1);
        obj3.setSubject(topic1);

        obj1.setSubject(topic2);
        obj2.setSubject(topic2);

        obj1.update();
        obj2.update();

        topic1.thayDoiGia(100);
        topic2.thayDoiGia(200);

    }
}
