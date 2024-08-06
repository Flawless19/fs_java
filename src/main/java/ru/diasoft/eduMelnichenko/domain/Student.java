package ru.diasoft.eduMelnichenko.domain;

public class Student extends Person {

    String group;
    String course;

    public Student(String firstName, String secondName, int age, String group, String course) {
        super(firstName, secondName, age);
        this.group = group;
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public String getCourse() {
        return course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static void printInfo(Student student) {
        System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getGroup() + " " + student.getCourse());
    }
}
