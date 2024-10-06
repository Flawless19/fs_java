package ru.diasoft.eduMelnichenko.domain;

public class Person {
   private String firstName;
   private String secondName;
   private int age;
   private String phone;

   public Person(String firstName, String secondName, int age, String phone) {
       this.firstName = firstName;
       this.secondName = secondName;
       this.age = age;
       this.phone = phone;
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
}
