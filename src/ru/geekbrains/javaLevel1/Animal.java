package ru.geekbrains.javaLevel1;

public class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String  name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
