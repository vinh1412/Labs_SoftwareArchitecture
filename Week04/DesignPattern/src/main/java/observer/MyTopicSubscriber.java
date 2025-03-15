/*
 * @ {#} MyTopicSubscriber.java   1.0     13/03/2025
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
public class MyTopicSubscriber implements Observer{

    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else{
            System.out.println(name+":: Consuming message::"+msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}
