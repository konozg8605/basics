package org.lesson.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    @Test

    public void shouldFeedingFish(){
        //given
        Fish fish = new Fish(2,5 );
        double amoundOfFeeding = 5;
        //when
        fish.feeding(amoundOfFeeding);

        // then

        assertEquals(3,fish.getWeight(),0.1 );


    }

    @Test
    public void shouldDoubleFeedingFish(){
        //given
        Fish fish = new Fish(5,1.5 );
        double amoundOfFeeding = 5;
        //when
        fish.feeding(amoundOfFeeding);
        fish.feeding(amoundOfFeeding);

        // then

        assertEquals(11.66,fish.getWeight(),0.01 );


    }
    @Test

    public void shouldThrowIIlegalArgumentException(){
        //given
        Fish fish = new Fish(2,5 );// po słowie new jest zawsze konstruktor!!!!!!!
        double amoundOfFeeding = 6;

        try {
            //when
            fish.feeding(amoundOfFeeding);//. zmienna  skazuje na obiekt przez który możemy wywołać   metode
            fail("Should never happened");
        } catch (IllegalArgumentException exception) {


            // then

            assertEquals("Za dużo paszy" , exception.getMessage());
        }

    }
}