package ru.geekbrains.javaLevel1;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String  name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    protected String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
