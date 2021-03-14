package ru.geekbrains.javaLevel1.homework6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 150, 50);

        cat1.run(100);
        cat1.swim(20);

        Dog dog1 = new Dog("Bob", 400, 50);

        dog1.run(300);
        dog1.swim(30);

    }
}
