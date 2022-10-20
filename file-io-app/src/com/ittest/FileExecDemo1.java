package com.ittest;

import java.io.IOException;

public class FileExecDemo1 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("D:\\develop\\Notepad++\\notepad++.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
