package ru.geekbrains.javaLevel1;

public class Dog extends Animal{

    public Dog(String name, String color, int age) {
        super(name, color, age);
//        System.out.println(toString());
    }

    public String toString() {

        return super.toString().replace("name", "nickname").replace("Animal", "Doggy");
    }

}
