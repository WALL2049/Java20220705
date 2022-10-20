package com.ittest;

import java.io.*;

public class FileInputDemo {
    public static void main(String[] args) {
        try (
                // 这里只能放置资源流对象，用完会自动关闭，自动调用资源流的close方法
                // 创建字节输入流对象与文件接通
                InputStream is = new FileInputStream("D:\\Users\\10276683\\Download\\2352342354235423523.jpg");
                // 把原始的字节输入流包装成高级的缓冲字节输入流，后面用bis代替is
                InputStream bis = new BufferedInputStream(is);
                // 创建字节输出流对象与文件接通
                OutputStream os = new FileOutputStream("D:\\Users\\10276683\\Download\\8888.jpg");
                // 把原始的字节输出流包装成高级的缓冲字节输出流，后面用bos代替os
                OutputStream bos = new BufferedOutputStream(os);
        ){


            // 1.大文件（非字符文件），循环，效率会更高
//            byte[] buffer = new byte[1024];
//            int len;
//            while((len = is.read(buffer)) != -1){
//                os.write(buffer, 0, len);
//            }

            // 2.小文件，文件大了效率会低
            byte[] buffer = is.readAllBytes();
            os.write(buffer);

//            os.close();    // try()释放了

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
