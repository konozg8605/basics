package org.lesson.basics.fish;

import org.junit.Test;

public class FishFarmTest {

    @Test
    public void shouldFeedThemAll() {
        // given
        double foodAmountPerFarm = 5;

        Fish[] fishs = new Fish[5];
        fishs[0] = new Fish(1, 1, "carp");
        fishs[1] = new Fish(2, 2, "carp");
        fishs[2] = new Fish(3, 3, "grass carp");
        fishs[3] = new Fish(4, 4, "carp");
        fishs[4] = new Fish(5, 5, "carp");

        FishFarm farm = new FishFarm; //nie kompiluje sie!!!!!!!!!!

        // when
        farm.feedThemAll2(foodAmountPerFarm);

        // then
        // gdzie sa assercje pobierz wszystkie ryby i dla kazdej sprawdz mase po karmieniu

    }

}