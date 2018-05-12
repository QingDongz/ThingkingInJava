package cn.summerwaves.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class NIO {
//    public static void main(String[] args) throws IOException {
//        FileInputStream fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\自我介绍.txt");
//        FileChannel fileChannel = fin.getChannel();
//        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
//        while (true) {
////            byteBuffer.clear();
//            System.out.print(new String(byteBuffer.array(),"utf-8"));
//            int r = fileChannel.read(byteBuffer);
//
//            if (r == -1) {
//                break;
//            }
//
//            byteBuffer.flip();
//
//        }
//
//    }


    public static void main(String args[]){
        Charset charset = Charset.forName("UTF-8");//Java.nio.charset.Charset处理了字符转换问题。它通过构造CharsetEncoder和CharsetDecoder将字符序列转换成字节和逆转换。
        CharsetDecoder decoder = charset.newDecoder();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\自我介绍.txt");
            FileChannel fileChannel = fis.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(24);
            CharBuffer charBuffer = CharBuffer.allocate(24);
            int bytes = fileChannel.read(byteBuffer);
            while(bytes!=-1){
                byteBuffer.flip();
                decoder.decode(byteBuffer, charBuffer, false);
                charBuffer.flip();
                System.out.print(charBuffer);
                charBuffer.clear();
                byteBuffer.clear();
                bytes = fileChannel.read(byteBuffer);
            }
            if(fis!=null){
                fis.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
