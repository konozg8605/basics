package org.lesson.basics.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircuitTest {


    @Test
    public void shouldCalculateSurface() {
        //given
        Circuit circuit = new Circuit(5);// new pozwala stworzyc nowy obiekt przy pomocy konstruktora

        //when
        double surface = circuit.calculateSurface(); // zmiena odwołuje do metody

        //then
        assertEquals(78.5, surface, 0.1);
    }


    @Test
    public void shouldCalculateCircuit() {
        //giwen
        Circuit myCircuit;
        myCircuit = new Circuit( 5);

        //when
        double circuit = myCircuit.calculateCircumference();

        //then
        assertEquals(31.4, circuit, 0.1);
    }
}