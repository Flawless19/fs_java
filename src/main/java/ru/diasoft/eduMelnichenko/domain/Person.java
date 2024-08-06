package ru.diasoft.eduMelnichenko.domain;

public class Person {
   String firstName;
   String secondName;
   int age;
   String phone;

   public Person(String firstName, String secondName, int age) {
       this.firstName = firstName;
       this.secondName = secondName;
       this.age = age;
   }

   public String getFirstName() {
       return firstName;
   }

   public String getSecondName() {
       return secondName;
   }

   public int getAge() {
       return age;
   }

   public String getPhone() {
       return phone;
   }

   public void setAge(int Age) {
       this.age = age;
   }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void printFI(Person person) {
        // Concatenate the first and second name of the person and print it.
        System.out.println(person.getFirstName() + " " + person.getSecondName());
    }

    public static void printInfo(Person person) {
        // Concatenate the first and second name of the person and print it.
        System.out.println(person.getFirstName() + " " + person.getSecondName() + " " + person.getAge() + " " + person.getPhone());
    }

}
