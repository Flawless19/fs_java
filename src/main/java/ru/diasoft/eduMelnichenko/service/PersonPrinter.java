package ru.diasoft.eduMelnichenko.service;

import ru.diasoft.eduMelnichenko.domain.Person;

public class PersonPrinter implements Printer{

    private Person person;

    public PersonPrinter() {
        this.person = new Person("Иванов", "Иван", 23, "8 999 888 77 66");
    }
    @Override
    public void printInfo() {
        System.out.println("Work PersonPrinter\n");
        System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getAge() + " " + person.getPhone() + "\n");
    }
}
