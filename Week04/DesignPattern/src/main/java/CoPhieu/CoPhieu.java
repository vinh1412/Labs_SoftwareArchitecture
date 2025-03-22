/*
 * @ {#} CoPhieu.java   1.0     15/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package CoPhieu;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   15/03/2025
 * @version:    1.0
 */
public class CoPhieu implements Subject {
    private double giaCoPhieu;
    private boolean thayDoi;
    private List<Observer> observers;

    public CoPhieu() {
        observers = new ArrayList<>();
        giaCoPhieu = 0;
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("Null Observer");
        }
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        if (!thayDoi) {
            return;
        }
        observersLocal = new ArrayList<>(this.observers);
        this.thayDoi = false;
        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.giaCoPhieu;
    }

    public void thayDoiGia(double giaMoi) {
        System.out.println("Thay đổi giá cổ phiếu thành: " + giaMoi);
        this.giaCoPhieu = giaMoi;
        this.thayDoi = true;
        notifyObservers();
    }
}
