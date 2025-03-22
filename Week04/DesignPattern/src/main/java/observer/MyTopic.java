/*
 * @ {#} MyTopic.java   1.0     13/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package observer;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   13/03/2025
 * @version:    1.0
 */
public class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object(); // mutex lock, used to synchronize threads

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        // Khi một thread đang thực hiện lệnh trong khối synchronized,
        // các thread khác phải chờ đến khi thread hiện tại hoàn thành.
//        synchronized (MUTEX) {
        if (!observers.contains(obj)) observers.add(obj);
//        }
    }

    @Override
    public void unregister(Observer obj) {
//        synchronized (MUTEX) {
        observers.remove(obj);
//        }
    }

    // Notify all observers that the subject has changed
    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null; // contains observers that will be notified
        // Synchronize to make sure any observer registered after message is received is not notified
//        synchronized (MUTEX) {
        if (!changed) return;
        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;
//        }
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // Post message to the topic
    public void postMessage(String msg) {
        System.out.println("Message posted to topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
