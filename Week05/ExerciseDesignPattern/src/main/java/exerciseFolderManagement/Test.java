/*
 * @ {#} Test.java   1.0     22/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseFolderManagement;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   22/03/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        String path = "D:\\HK2-NAM4\\KienTrucPhanMem\\Labs\\Week05\\ExerciseDesignPattern\\src\\main\\java\\exerciseFolderManagement\\folderTestDesignPattern";
        try {
            FileSystemComponent root = FileSystemLoader.loadFileSystem(path);
            root.showDetails();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
