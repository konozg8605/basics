package org.lesson.basics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTestKonrad {
    @Test
    public void shouldReturnSiemaKonrad() {
        // given
        Greeting siema = new Greeting("Siema");

        // when
        String siemaKonrad = siema.say("Konrad");

        // then

        Assert.assertEquals("Siema Konrad", siemaKonrad);
    }


}