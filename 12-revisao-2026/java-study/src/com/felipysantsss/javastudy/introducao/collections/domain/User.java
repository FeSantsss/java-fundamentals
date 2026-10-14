package com.felipysantsss.javastudy.introducao.collections.domain;

import java.util.Objects;

public class User {
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // equals study
    @Override
    public boolean equals(Object otherUser){
        if (otherUser == null) return false;
        if (this == otherUser) return true;
        if (this.getClass() != otherUser.getClass()) return false;
        User usr = (User) otherUser;
        if (name == null) return false;
        return name.equals(usr.getName());
    }
}
