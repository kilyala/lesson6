package ru.geekbrains.javaLevel1.homework6;

public class Cat extends Animal {

    public Cat(String name, int runResult, int swimResult) {
        super(name, runResult, swimResult);
    }

    public void run(int length) {
        if (runResult > length) {
            System.out.println("Cat " + name + " run the distance of (" + length + ")");
        } else {
            System.out.println("Cat " + name + " failed!");
        }
    }

    public void swim(int length) {
        System.out.println("Cats can't swim");
    }
}
