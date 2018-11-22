package org.lesson.basics.fish;

import org.junit.Assert;
import org.junit.Test;

public class FishFarmTest {

    @Test
    public void shouldFeedThemAll() {
        // given
        double foodAmountPerFarm = 15;

        Fish[] fishs = new Fish[5];
        fishs[0] = new Fish(1, 1, "carp");
        fishs[1] = new Fish(2, 2, "carp");
        fishs[2] = new Fish(3, 3, "grass carp");
        fishs[3] = new Fish(4, 4, "carp");
        fishs[4] = new Fish(5, 5, "carp");

        FishFarm farm = new FishFarm(fishs);

        // when
        farm.feedThemAll(foodAmountPerFarm);

        // then
        Assert.assertEquals(2.0, fishs[0].getWeight(), 0.01);
        Assert.assertEquals(2.0, farm.getFishs()[0].getWeight(), 0.01);
        Assert.assertEquals(3.0, farm.getFishs()[1].getWeight(), 0.01);
        Assert.assertEquals(4.0, farm.getFishs()[2].getWeight(), 0.01);
        Assert.assertEquals(5.0, farm.getFishs()[3].getWeight(), 0.01);
        Assert.assertEquals(6.0, farm.getFishs()[4].getWeight(), 0.01);

        System.out.println(" F: " + fishs);
        System.out.println(" G: " + farm.getFishs());
        // gdzie sa assercje pobierz wszystkie ryby i dla kazdej sprawdz mase po karmieniu
// zdebagowac dlaczego jest bład i dlaczego jest 3 a ma byc 4
    }

    @Test
    public void shouldThrowsExceptionWhenGivenAmountOfFoodIsNegative() {
        // given
        double foodAmountPerFarm = - 15;

        Fish[] fishs = new Fish[5];
        fishs[0] = new Fish(1, 1, "carp");
    
        FishFarm farm = new FishFarm(fishs);
        
        // when
        try {
            farm.feedThemAll(foodAmountPerFarm);
        } catch (IllegalArgumentException exception) {   

        // then
            Assert.assertEquals(1.0, fishs[0].getWeight(), 0.01);
            Assert.assertEquals("Amount of food has to be positive", exception.getMessage());
        }

    }
}
