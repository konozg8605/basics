package org.lesson.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void shouldCalculateSurface() {
        //given
        Square square = new Square(5);

        //when
        double surface = square.calculateSurface();

        //then
        assertEquals(25.0, surface, 0.1);
    }


    @Test
    public void shouldCalculateCircuit() {
        //giwen
        Square mySquare;
        mySquare = new Square(3);

        //when
        double circuit = mySquare.calculateCircumference();

        //then
        assertEquals(12.0, circuit, 0.1);
    }
}