package org.lesson.basics.greeting;

import org.junit.Assert;
import org.junit.Test;

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