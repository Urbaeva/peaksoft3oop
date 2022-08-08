package com.company;

public class Fish {
    private String name;
    private int age;
    private String color;
    private double weight;

    public Fish(){
        System.out.println("About Fish: ");
    }

    public Fish(String name, int age, String color, double weight){
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

//    void setName(String name) {
//        this.name = name;
//    }
//
//    void setColor(String color) {
//        this.color = color;
//    }
//
//    void setWeight(double weight) {
//        this.weight = weight;
//    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    double getWeight() {
        return weight;
    }
}
