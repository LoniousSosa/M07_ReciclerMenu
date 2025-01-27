package com.example.damasaplicacionm9;
public class Amigo {
    private String name;
    private String status;
    private int imageResource;

    public Amigo(String name, String status, int imageResource) {
        this.name = name;
        this.status = status;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getImageResource() {
        return imageResource;
    }
}

