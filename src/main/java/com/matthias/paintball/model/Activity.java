package com.matthias.paintball.model;

import java.util.List;

public class Activity {
    private int id;
    private int gun_id;
    private List<Images> images;
    private String title;
    private String notes;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGun_id() {
        return gun_id;
    }

    public void setGun_id(int gun_id) {
        this.gun_id = gun_id;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}