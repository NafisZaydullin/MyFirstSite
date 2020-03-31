package com.nafis.lite;

import java.util.Date;

public class Person {
    private String name;
    private String birthday;
    private String imgLink;

    public Person(String name, String birthday, String imgLink) {
        this.name = name;
        this.birthday = birthday;
        this.imgLink = imgLink;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getImgLink() {
        return imgLink;
    }
}
