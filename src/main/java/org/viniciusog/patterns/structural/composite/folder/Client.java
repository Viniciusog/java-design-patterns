package org.viniciusog.patterns.structural.composite.folder;

import org.viniciusog.patterns.structural.composite.folder.model.File;
import org.viniciusog.patterns.structural.composite.folder.model.FileSystemItem;
import org.viniciusog.patterns.structural.composite.folder.model.Folder;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static FileSystemItem createCompositeFromFile(java.io.File file) {
        if (!file.isDirectory()) return new File(file.getName());
        List<FileSystemItem> childs = new ArrayList<>();
        java.io.File[] files = file.listFiles();
        assert files != null;
        for (java.io.File javaFile : files) {
            childs.add(createCompositeFromFile(javaFile));
        }
        return new Folder(file.getName(), childs);
    }

    public static void main(String[] args) {

        FileSystemItem file1 = new File("file1");
        FileSystemItem file2 = new File("file2");
        FileSystemItem file3 = new File("file3");
        FileSystemItem file4 = new File("file4");
        FileSystemItem sf1 = new Folder("sf1", List.of(file1));
        FileSystemItem sf2 = new Folder("sf2", List.of(file2, sf1));
        FileSystemItem folder = new Folder("folder", List.of(sf2, file3, file4));

        folder.print("");

        System.out.println(" -------------------- ");
        // current work directory
        String dir = System.getProperty("user.dir");
        java.io.File file = new java.io.File(dir);
        FileSystemItem fileSystemItem =
                createCompositeFromFile(new java.io.File(file + java.io.File.separator + "src"));
        fileSystemItem.print("");
    }
}
