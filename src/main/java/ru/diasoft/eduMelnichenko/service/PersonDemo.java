package ru.diasoft.eduMelnichenko.service;

import ru.diasoft.eduMelnichenko.domain.Person;

public class PersonDemo {

    public static void demo() {
        Person person1 = new Person("Иван", "Иванов", 30);

        person1.setPhone("123456789");
        System.out.println("Working static method printFI:\n");
        PersonPrinter.printFI(person1);
        System.out.println("Working static method printInfo:\n");
        PersonPrinter.printInfo(person1);
    }
}
