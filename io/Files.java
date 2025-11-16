package io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public class Files {
    public static void main(String[] args) throws URISyntaxException {
        String relativeREADMEPath = "/home/hien-giang/Learning/java/core/README.md";
        Path readmePath = Path.of(relativeREADMEPath);
        boolean isREADMEExisted = java.nio.file.Files.exists(readmePath);

        System.out.println(readmePath);
        System.out.println("isREADMEExisted: " + isREADMEExisted);

        try {
            FileTime lastModifiedTime = java.nio.file.Files.getLastModifiedTime(readmePath);
            System.out.println("lastModifiedTime: " + lastModifiedTime);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
