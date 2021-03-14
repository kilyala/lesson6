package ru.geekbrains.javaLevel1.homework6;

public class Animal {
    protected String name;
    protected int runResult;
    protected int swimResult;

    public Animal(String name, int runResult, int swimResult) {
        this.name = name;
        this.runResult = runResult;
        this.swimResult = swimResult;
    }

    public String getName() {
        return name;
    }

    public int getRunResult() {
        return runResult;
    }

    public int getSwimResult() {
        return swimResult;
    }

    public void run(int length) {

    }

    public void swim(int length) {

    }

}
