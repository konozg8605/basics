package org.lesson.basics.person;

public class PersonalFiles {
    public static void main(String[] args) {
        int day = 15;
       Character konrad = new Character("Konrad", "Ozga", 32, 118,880489237 );
       Character sabina = new Character("Sabina", "Dziewińska",33 ,78 ,787150159);
        System.out.println(konrad.charakterRaport(day));
        System.out.println(sabina.charakterRaport(day));
    }
}
