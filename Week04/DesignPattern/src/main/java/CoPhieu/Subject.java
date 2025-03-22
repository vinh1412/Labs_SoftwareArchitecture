/*
 * @ {#} CoPhieuObject.java   1.0     15/03/2025
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
public interface Subject {
    void register(Observer obj); // register an observer
    void unregister(Observer obj); // unregister an observer
    void notifyObservers(); // notify all observers
    Object getUpdate(Observer obj); // get update from observer
}
