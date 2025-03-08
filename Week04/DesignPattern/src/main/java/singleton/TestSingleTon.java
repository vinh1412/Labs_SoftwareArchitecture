/*
 * @ {#} TestSingleTon.java   1.0     08/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package singleton;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   08/03/2025
 * @version:    1.0
 */
public class TestSingleTon {
    public static void main(String[] args) {
//         Test EagerInitializedSingleton
//        EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
//        System.out.println(instance.hashCode());

//        Test ThreadSafeSingleton
//        Thread t1 = new Thread(new Thread1());
//        Thread t2 = new Thread(new Thread2());
//        Thread t3 = new Thread(new Thread3());
//        Thread t4 = new Thread(new Thread4());
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        // Test StaticBlockSingleton
//        StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
//        System.out.println(instance.hashCode());

        // Test LazyInitializedSingleton
//        LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
//        System.out.println(instance.hashCode());

        // Test BillPughSingleton
        BillPughSingleton instance = BillPughSingleton.getInstance();
        System.out.println(instance.hashCode());
    }
    static class Thread1 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("11111");
            System.out.println(instance.hashCode() + "----"+ instance.value);
        }
    }
    static class Thread2 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("22222");
            System.out.println(instance.hashCode() + "----"+ instance.value);
        }
    }
    static class Thread3 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("33333");
            System.out.println(instance.hashCode() + "----"+ instance.value);
        }
    }
    static class Thread4 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("44444");
            System.out.println(instance.hashCode() + "----"+ instance.value);
        }
    }
}
