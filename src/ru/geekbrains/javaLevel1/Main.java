package ru.geekbrains.javaLevel1;

public class Main {
//    статическое поле может быть вызвано в статическом или нестатическом методе
//    статический метод может быть вызван в статическом методе или нестатическом методе
//    нестатический метод может быть вызван только в нестатическом методе либо с явной передачей объекта


    private static String name;
    private String type;

    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();

    }

    public String getType() {
        return type;
    }

    public static String getName() {
        return name;
    }

    public String print() {
        System.out.println(name + type);
    }

}
