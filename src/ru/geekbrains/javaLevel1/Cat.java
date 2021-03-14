package ru.geekbrains.javaLevel1;

public class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
        System.out.println(toString());
    }
}
