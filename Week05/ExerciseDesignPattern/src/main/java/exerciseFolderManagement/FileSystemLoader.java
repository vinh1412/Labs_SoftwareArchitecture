/*
 * @ {#} FileSystemLoader.java   1.0     22/03/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package exerciseFolderManagement;

import java.io.File;

/*
 * @description:
 * @author: Tran Hien Vinh
 * @date:   22/03/2025
 * @version:    1.0
 */
class FileSystemLoader {
    public static FileSystemComponent loadFileSystem(String path) {
        File file = new File(path);
        if (!file.exists()) {
            throw new IllegalArgumentException("Path does not exist: " + path);
        }
        return load(file);
    }

    private static FileSystemComponent load(File file) {
        if (file.isFile()) {
            return new FileComponent(file.getName(), file.length());
        } else {
            Directory directory = new Directory(file.getName());
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    directory.add(load(f));
                }
            }
            return directory;
        }
    }
}
