/*
 * @ {#} Test.java   1.0     13/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package observer;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   13/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();

        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);


        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        topic.unregister(obj2);


        obj1.update();
        obj2.update();
        obj3.update();
        topic.postMessage("New Message");
    }
}
