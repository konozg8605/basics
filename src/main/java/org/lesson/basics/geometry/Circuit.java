package org.lesson.basics.geometry;

public class Circuit implements Shape{
    private double ray;

    public Circuit(double ray){ // w konstruktorze przypisuje polą parametry
        this.ray = ray;
    }

public double calculateSurface(){
        double surface;
        surface = 3.14 * ray * ray;
        return surface;

}
public double calculateCircumference(){
        double circumference = 2 * 3.14 *ray;
        return circumference;
}
}
