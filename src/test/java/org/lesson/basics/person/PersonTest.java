package org.lesson.basics.person;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

 @Test
    public void shouldIntroducYourself(){
        //given
        Person person = new Person("Konrad",31);
        String expctedIntroduction = "Siema Daniel, My name is Konrad and I am 31 year old.";

        //when
      String introduc = person.introducing("Daniel");

      //then
        Assert.assertEquals(expctedIntroduction,introduc );
    }


}