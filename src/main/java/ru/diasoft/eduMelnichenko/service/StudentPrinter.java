package ru.diasoft.eduMelnichenko.service;

import ru.diasoft.eduMelnichenko.domain.Student;

public class StudentPrinter implements Printer{

    private Student student;

    public StudentPrinter() {
        this.student = new Student("Иванов", "Иван", 23, "8 999 888 77 66", "M911", "1");
    }

    public void printInfo() {
        System.out.println("Work StudentPrinter\n");
        System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getAge() + " " + student.getPhone() + " " + student.getGroup() + " " + student.getCourse()+ "\n");
    }
}
