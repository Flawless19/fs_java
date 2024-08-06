package ru.diasoft.eduMelnichenko.service;

import ru.diasoft.eduMelnichenko.domain.Person;

public class PersonPrinter {
    public static void printFI(Person person) {
        System.out.println(person.getFirstName() + " " + person.getSecondName());
    }

    public static void printInfo(Person person) {
        System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getAge() + " " + person.getPhone());
    }
}
