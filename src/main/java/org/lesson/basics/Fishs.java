package org.lesson.basics;

public class Fishs {
    public static void main(String[] args) {
        Fish carp = new Fish(2, 5);
        Fish grassCarp = new Fish(5,1.5 );
        Fish tench = new Fish(10,4);
        double amountOFFeed = 3;

        carp.feeding(amountOFFeed);
        System.out.println(carp.getWeight());

        grassCarp.feeding(amountOFFeed);
        grassCarp.feeding(amountOFFeed);
        Fish tmp = grassCarp;

        grassCarp = new Fish(1,1 );
        grassCarp.feeding(amountOFFeed);
        System.out.println(grassCarp.getWeight());

        tmp.feeding(amountOFFeed);
        System.out.println(tmp.getWeight());

        tench.feeding(amountOFFeed);
        System.out.println(tench.getWeight());

    }
}
