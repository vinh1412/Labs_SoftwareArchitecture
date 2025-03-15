/*
 * @ {#} PC.java   1.0     12/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */
      
package abstractFactory;
/*
 * @description: 
 * @author: Tran Hien Vinh
 * @date:   12/03/2025
 * @version:    1.0
 */
public class PC extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
