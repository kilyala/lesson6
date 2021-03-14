package ru.geekbrains.javaLevel1;

public class Main {
//    статическое поле может быть вызвано в статическом или нестатическом методе
//    статический метод может быть вызван в статическом методе или нестатическом методе
//    нестатический метод может быть вызван только в нестатическом методе либо с явной передачей объекта


    public static void main(String[] args) {
        Cat cat = new Cat("Barsick", "Black", 5);
        Dog dog = new Dog("Bobik", "Red", 3);

        System.out.println(cat.toString());
        System.out.println(dog.toString());

    }


}
