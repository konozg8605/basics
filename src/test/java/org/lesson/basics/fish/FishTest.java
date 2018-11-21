package org.lesson.basics.fish;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FishTest {

    @Test

    public void shouldFeedingFish() {
        //given
        Fish fish = new Fish(2, 5);
        double amoundOfFeeding = 5;
        //when
        fish.feeding(amoundOfFeeding);

        // then

        assertEquals(3, fish.getWeight(), 0.1);


    }

    @Test
    public void shouldDoubleFeedingFish() {
        //given
        Fish fish = new Fish(5, 1.5);
        double amoundOfFeeding = 5;
        //when
        fish.feeding(amoundOfFeeding);
        fish.feeding(amoundOfFeeding);

        // then

        assertEquals(11.66, fish.getWeight(), 0.01);


    }

    @Test

    public void shouldThrowIIlegalArgumentException() {
        //given
        Fish fish = new Fish(2, 5);// po słowie new jest zawsze konstruktor!!!!!!!
        double amoundOfFeeding = 6;

        try {
            //when
            fish.feeding(amoundOfFeeding);//. zmienna  skazuje na obiekt przez który możemy wywołać   metode
            fail("Should never happened");
        } catch (IllegalArgumentException exception) {


            // then

            assertEquals("Za dużo paszy", exception.getMessage());
        }

    }

    @Test
    public void shouldFeedThemAll() {
        // given
        FishFarm rzd = new FishFarm;
        double foodAmountPerFarm = 5;

        Fish[] fishs = new Fish[5];
        fishs[0] = new Fish(1, 1, "carp");
        fishs[1] = new Fish(2, 2, "carp");
        fishs[2] = new Fish(3, 3, "grass carp");
        fishs[3] = new Fish(4, 4, "carp");
        fishs[4] = new Fish(5, 5, "carp");

        // when
        rzd.feedThemAll2(foodAmountPerFarm);
        // then


    }
}
