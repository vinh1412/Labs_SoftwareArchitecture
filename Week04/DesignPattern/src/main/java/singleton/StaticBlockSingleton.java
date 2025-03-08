/*
 * @ {#} StaticBlockSingleton.java   1.0     08/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package singleton;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   08/03/2025
 * @version:    1.0
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }

}
