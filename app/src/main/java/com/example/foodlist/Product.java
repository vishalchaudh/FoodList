package com.example.foodlist;

public class Product {
    private String name;
    private double description;
    private String images_path;
    private String price;

    public Product(String name, double description, String images_path, String price){
        this.name=name;
        this.description=description;
        this.images_path=images_path;
        this.price=price;
    }
    public String getName(){ return name;}
    public double getDescription(){return description;}
    public String  getImages_path(){return images_path;}
    public String getPrice(){return price;}
}
