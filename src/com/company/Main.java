package com.company;

public class Main {

    public static void main(String[] args) {
        new Fish();
        Fish fish = new Fish("Lamprey",2, "gray", 3.55);
        System.out.println("Name: " + fish.getName());
        System.out.println("Color: " + fish.getColor());
        System.out.println("Weight: " + fish.getWeight());

        new Cat();
        Cat cat = new Cat("Luna",4, "black");
        System.out.println("Name: " + cat.getName());
        System.out.println("Color: " + cat.getColor());
        System.out.println("Age: " + cat.getAge());

        new Dog();
        Dog dog = new Dog("Arlo",5, "black");
        System.out.println("Name: " + dog.getName());
        System.out.println("Color: " + dog.getColor());
        System.out.println("Age: " + dog.getAge());
    }
}
