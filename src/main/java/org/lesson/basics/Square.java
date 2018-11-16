package org.lesson.basics;

public class Square implements Shape{
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;

    }

    public double calculateSurface() {
        return lenght * lenght;
    }

    public double calculateCircumference(){
        return lenght * 4;
    }
}


