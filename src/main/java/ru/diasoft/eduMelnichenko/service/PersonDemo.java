package ru.diasoft.eduMelnichenko.service;

public class PersonDemo {

    public static void demo() {
        Printer[] printersArray = {new PersonPrinter(), new StudentPrinter()};

        for (Printer printer : printersArray) {
            printer.printInfo();
        }
    }
}
