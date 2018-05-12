package cn.summerwaves;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    private static final Logger log = LoggerFactory.getLogger(CreateFile.class);
    public static void main(String[] args) {
        new CreateFile().createFile();
    }


    public void createFile() {
        File file = new File("C:\\Users\\Administrator\\Desktop\\创建文件.txt");

        try {
            Boolean createFileSuccess = file.createNewFile();
            log.info("创建文件成功:{}", createFileSuccess);
            log.info("该分区大小:"+file.getTotalSpace()/(1024*1024*1024)+"G");
            Boolean createDirSuccess = file.mkdir();
            log.info("创建目录成功:{}", createDirSuccess);
            log.info("此文件文件名为:{}", file.getName());
            log.info("此文件父路径:{}", file.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
