package com.example.megflix.models;


import org.parceler.Parcel;

@Parcel
public class Popular {
    String name;
    String image_thumbnail_path;
    String start_date;
    String status;
    String network;
    public Popular(){}

    public Popular (String name, String image_thumbnail_path,String start_date, String status, String network){
        this.name = name;
        this.image_thumbnail_path = image_thumbnail_path;
        this.start_date = start_date;
        this.status = status;
        this.network = network;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_thumbnail_path() {
        return image_thumbnail_path;
    }

    public void setImage_thumbnail_path(String image_thumbnail_path) {
        this.image_thumbnail_path = image_thumbnail_path;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
}
