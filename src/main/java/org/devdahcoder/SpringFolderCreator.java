package org.devdahcoder;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class SpringFolderCreator {

    private List<String> folders = Arrays.asList("controller", "mapper", "extractor", "service", "repository");
    private String path;

    public SpringFolderCreator(String path) { this.path = path; }

    public void createFolders() {

        File file = new File(this.path);

        if (file.exists()) {

            System.out.println("Path directory does not exist.");

            return;

        }

        for (String folder: this.folders) {

            File newFolder = new File(this.path, folder);

            if (newFolder.mkdir()) {

                System.out.println("Created " + folder + " folder");

            } else {

                System.out.println("Could not create " + folder + " folder");

            }

        }

    }

}
