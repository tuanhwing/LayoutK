package com.mto.cpu10414_local.layoutk.Entities;

/**
 * Created by CPU10414-local on 3/14/2018.
 */

public class Person {
    private String name;
    private String age;
    private int image;

    public Person() {
    }

    public Person(String name, String age, int image) {
        this.name = name;
        this.age = age;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
