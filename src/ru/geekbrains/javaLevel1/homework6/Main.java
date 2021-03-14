package ru.geekbrains.javaLevel1.homework6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 400, 0);
        Dog dog1 = new Dog("Bob", 500, 10);

        cat1.run(150);
        cat1.swim(20);
        dog1.run(300);
        dog1.swim(30);

    }
}
