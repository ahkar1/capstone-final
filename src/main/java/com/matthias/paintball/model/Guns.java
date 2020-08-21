package com.matthias.paintball.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guns {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int gun_id;
    private String name;
    private String image;
    private boolean featured;
    private String date;

    public int getGun_id() {
        return gun_id;
    }

    public void setGun_id(int gun_id) {
        this.gun_id = gun_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}