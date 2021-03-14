package ru.geekbrains.javaLevel1.homework6;

public class Dog extends Animal{
    public Dog(String name, int runResult, int swimResult) {
        super(name, runResult, swimResult);
    }

    @Override
    public void run(int length) {
        if (runResult > length) {
            System.out.println("Dog " + name + " run the distance of (" + length + ")");
        } else {
            System.out.println("Dog " + name + " can't pass this distance");
        }
    }

    @Override
    public void swim(int length) {
        if (swimResult > length) {
            System.out.println("Dog " + name + " swam the distance of (" + length + ")");
        } else {
            System.out.println("Dog " + name + " can't pass this distance");
        }
    }

}
