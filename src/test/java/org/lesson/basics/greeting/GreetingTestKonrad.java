package org.lesson.basics.greeting;

import org.junit.Assert;
import org.junit.Test;

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