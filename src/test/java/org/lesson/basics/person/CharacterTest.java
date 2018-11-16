package org.lesson.basics.person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    @Test

    public void shouldGenerateCharacterRaport(){

        //given

        Character character = new Character("Konrad", "Ozga", 32,118 ,880489237 );
        String expectedCharacterRaport = " Dane osobowe: Konrad Ozga 32 118.0 880489237Akta przedstawił: Harnas";

        //when

        String characterRaport = character.charakterRaport(15);

        //then
        assertEquals(expectedCharacterRaport,characterRaport );

    }

}