/*
 * @ {#} CoPhieuObserver.java   1.0     15/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseStockManagement;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   15/03/2025
 * @version:    1.0
 */
public interface Observer {
    void update();
    void setSubject(Subject sub);
}
