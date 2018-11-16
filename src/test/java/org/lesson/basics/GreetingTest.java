package org.lesson.basics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {

    @Test
    public void shouldReturnSiemaPiotrek() {
        //given
        Greeting hello = new Greeting("Hello");

        //when
        String halloPiotrek = hello.say("Piotrek");

        //then
        Assert.assertEquals("Hello Piotrek", halloPiotrek);
    }

}