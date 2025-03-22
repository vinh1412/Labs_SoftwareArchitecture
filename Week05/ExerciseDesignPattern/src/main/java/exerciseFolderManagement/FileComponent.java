/*
 * @ {#} FileComponent.java   1.0     22/03/2025
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
class FileComponent implements FileSystemComponent {
    private String name;
    private long size;

    public FileComponent(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (" + size + " bytes)");
    }

    @Override
    public long getSize() {
        return size;
    }
}
