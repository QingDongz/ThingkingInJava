package cn.summerwaves;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class FileCount {
    private static final Logger log = LoggerFactory.getLogger(FileCount.class);

    public static void main(String[] args) {
        int count = 0;

        InputStream streamReader = null;
        try {
            streamReader = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\自我介绍.txt"));

            while (streamReader.read() != -1) {
                count++;
            }
            log.info("文件长度为{}字节", count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
