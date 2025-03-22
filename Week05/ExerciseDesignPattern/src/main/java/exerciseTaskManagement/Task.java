/*
 * @ {#} Task.java   1.0     22/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseTaskManagement;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   22/03/2025
 * @version:    1.0
 */
class Task implements TaskSubject {
    private List<TaskObserver> observers;
    private String status;
    private boolean changed;

    public Task() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(TaskObserver observer) {
        observers.add(observer);
        observer.setTaskSubject(this);
    }

    @Override
    public void unregister(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<TaskObserver> observersLocal;
        if (!changed) return;
        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;
        for (TaskObserver observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public String getUpdate(TaskObserver observer) {
        return this.status;
    }

    public void updateStatus(String status) {
        System.out.println("Công việc cập nhật: " + status);
        this.status = status;
        this.changed = true;
        notifyObservers();
    }
}
