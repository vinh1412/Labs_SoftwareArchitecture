/*
 * @ {#} Observer.java   1.0     13/03/2025
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
public interface Observer {
    void update(); // update observer, used by subject
    void setSubject(Subject sub); // set subject to observer
}
