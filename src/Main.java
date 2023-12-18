package src;

import src.classes.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(18);
        person.setName("D Regis");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}