package cn.summerwaves.model;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 2525511L;

    private String username;
    private String password;
    private Integer age;

    public User(String username, String password, Integer age) {
        super();
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
