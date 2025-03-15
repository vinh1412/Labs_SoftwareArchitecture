/*
 * @ {#} SocketClassAdapterImpl.java   1.0     14/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package adapter;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   14/03/2025
 * @version:    1.0
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    // Using inheritance for adapter pattern
    @Override
    public Volt get120Volt() {
        return getVolt(); // Lấy trực tiếp 120V từ Socket
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10); // Chuyển đổi thành 12V
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40); // Chuyển đổi thành 3V
    }

    // Hàm chuyển đổi điện áp
    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
