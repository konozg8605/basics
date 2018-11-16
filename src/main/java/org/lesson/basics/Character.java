package org.lesson.basics;

public class Character {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private int mobilePhons;

    public Character(String name, String surname, int age, double weight, int mobilePhons){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.mobilePhons = mobilePhons;
    }

    public String charakterRaport(int day){
        String title = " Dane osobowe: ";
        String raportMade = "Harnas";
        String summery = "Akta przedstawił: " + raportMade;
        return title + name + " " + surname + " " + age + " " + weight + " " + mobilePhons + summery;
    }
}
