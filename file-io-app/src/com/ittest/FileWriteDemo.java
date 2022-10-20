package com.ittest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteDemo {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("C:\\Users\\123\\Downloads\\999.txt", true))
        {
            fw.write("今天天气真好呀！！！");
            fw.write("\r\n");
            fw.write("我上班差点迟到了！");
            fw.write("\r\n");
            fw.write("今天工作比较多");
            fw.write("\r\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
