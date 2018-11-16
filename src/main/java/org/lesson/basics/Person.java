package org.lesson.basics;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introducing(String nameOfFriend) {
     return "Siema" +" " + nameOfFriend + ", My name is " + name + " and I am " + age + " year old.";}
}


