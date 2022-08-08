package com.company;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(){
        System.out.println("About Dog: ");
    }

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

//    void setName(String name) {
//        this.name = name;
//    }
//
//    void setColor(String color) {
//        this.color = color;
//    }
//
//    void setAge(int age) {
//        this.age = age;
//    }

    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    int getAge() {
        return age;
    }
}
