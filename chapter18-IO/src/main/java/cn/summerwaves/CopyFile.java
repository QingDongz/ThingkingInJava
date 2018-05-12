package cn.summerwaves;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        new CopyFile().copyFile();
    }


    public void copyFile() {
        byte[] buffer = new byte[512];
        int numberRead = 0;
        FileInputStream inputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\自我介绍.txt");
            fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\自我介绍-副本.txt");

            while ((numberRead=inputStream.read(buffer,0,buffer.length))!=-1) {
                System.out.println(new String(buffer));
                fileOutputStream.write(buffer, 0, numberRead);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        // TODO自动生成的方法存根
//        byte[] buffer=new byte[512];   //一次取出的字节数大小,缓冲区大小
//        int numberRead=0;
//        FileInputStream input=null;
//        FileOutputStream out =null;
//        try {
//            input=new FileInputStream("C:\\Users\\Administrator\\Desktop\\自我介绍.txt");
//            out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\自我介绍-副本.txt"); //如果文件不存在会自动创建
//
//            while ((numberRead=input.read(buffer))!=-1) {  //numberRead的目的在于防止最后一次读取的字节小于buffer长度，
//                out.write(buffer, 0, numberRead);       //否则会自动被填充0
//            }
//        } catch (final IOException e) {
//            // TODO自动生成的 catch 块
//            e.printStackTrace();
//        }finally{
//            try {
//                input.close();
//                out.close();
//            } catch (IOException e) {
//                // TODO自动生成的 catch 块
//                e.printStackTrace();
//            }
//
//        }
    }

}
