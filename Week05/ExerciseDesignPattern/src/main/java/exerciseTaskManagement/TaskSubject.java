/*
 * @ {#} TaskSubject.java   1.0     22/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseTaskManagement;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   22/03/2025
 * @version:    1.0
 */
public interface  TaskSubject {
    void register(TaskObserver observer);
    void unregister(TaskObserver observer);
    void notifyObservers();
    String getUpdate(TaskObserver observer);
}
