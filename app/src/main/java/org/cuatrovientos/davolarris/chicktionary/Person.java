package org.cuatrovientos.davolarris.chicktionary;

import java.io.Serializable;

/**
 * Created by David on 06/10/2016.
 */

public class Person implements Serializable {
    private String name;
    private String email;
    private Integer phone;
    private Integer rating;
    private String picture;

    public Person (String name, String email, int phone, int rating, String picture) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.picture = picture;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", rating=" + rating +
                ", picture='" + picture + '\'' +
                '}';
    }
}
