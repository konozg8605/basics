package org.lesson.basics.geometry;

public class ShapePresenter {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape circuit = new Circuit(5);
        show(square);
        show(circuit);
    }

    private static void show(Shape shape) {
        System.out.println("pole: " + shape.calculateCircumference());
        System.out.println("obwód: " + shape.calculateCircumference());
    }
}
