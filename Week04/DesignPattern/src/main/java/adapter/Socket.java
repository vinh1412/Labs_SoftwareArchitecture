/*
 * @ {#} Socket.java   1.0     14/03/2025
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
public class Socket {
    public Volt getVolt() {
        return new Volt(120); // Cung cấp nguồn điện mặc định là 120V
    }
}
