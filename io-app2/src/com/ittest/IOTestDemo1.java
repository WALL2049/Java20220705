package com.ittest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.List;

public class IOTestDemo1 {
    public static void main(String[] args) throws IOException {
        IOUtils.copy(new FileInputStream("C:\\Users\\34390\\Downloads\\222.txt"),
                new FileOutputStream("C:\\Users\\34390\\Downloads\\333.txt"));
        String s = FileUtils.readFileToString(new File("C:\\Users\\34390\\Downloads\\222.txt"), "utf-8");
        System.out.println(s);
        List<String> strings = FileUtils.readLines(new File("C:\\Users\\34390\\Downloads\\222.txt"), "utf-8");
        System.out.println(strings);
    }
}
