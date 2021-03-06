package cn.summerwaves;

import cn.summerwaves.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ObjectStream {
    private static final Logger log = LoggerFactory.getLogger(CreateFile.class);
    public static void main(String[] args) {
        new ObjectStream().objectStream();
    }

    public void objectStream() {
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\创建文件.txt"));
            objectOutputStream.writeObject(new User("test", "test", 12));
            objectOutputStream.writeObject(new User("username", "password", 12));
            objectOutputStream.writeObject(new User("fuck", "fuck", 12));
            objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\创建文件.txt"));
            for (int i = 0; i < 3; i++) {
//                log.info(objectInputStream.readObject()+"");
                System.out.println(objectInputStream.readObject());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

            try {
                objectInputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        // TODO自动生成的方法存根
//        ObjectOutputStream objectwriter = null;
//        ObjectInputStream objectreader = null;
//
//        try {
//            objectwriter = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\创建文件.txt"));
//            objectwriter.writeObject(new Student("gg", 22));
//            objectwriter.writeObject(new Student("tt", 18));
//            objectwriter.writeObject(new Student("rr", 17));
//            objectreader = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\创建文件.txt"));
//            for (int i = 0; i < 3; i++) {
//                System.out.println(objectreader.readObject());
//            }
//        } catch (IOException | ClassNotFoundException e) {
//            // TODO自动生成的 catch 块
//            e.printStackTrace();
//        } finally {
//            try {
//                objectreader.close();
//                objectwriter.close();
//            } catch (IOException e) {
//                // TODO自动生成的 catch 块
//                e.printStackTrace();
//            }
//
//        }
//
//    }
//
//}
//
//class Student implements Serializable {
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        super();
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student [name=" + name + ", age=" + age + "]";
//    }


}
