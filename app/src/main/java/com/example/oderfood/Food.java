package com.example.oderfood;

public class Food {
    private String nameFood;
    private String price;
    private int numberAFood;

    public int getNumberAFood() {
        return numberAFood;
    }

    public void setNumberAFood(int numberAFood) {
        this.numberAFood = numberAFood;
    }


    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Food(String nameFood, String price, int numberAFood) {
        this.nameFood = nameFood;
        this.price = price;
        this.numberAFood = numberAFood;
    }
}
