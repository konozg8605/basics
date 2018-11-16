package org.lesson.basics;

import org.junit.Assert;
import org.junit.Test;

public class GlassTest {

    @Test
    public void shouldfellGlasWhifAmontOfWeatherSmolerThenGlassVoliumLimit() {
        // given
        Glass glass = new Glass(1.00);

        // when
        glass.fillIn(0.50);

        // then
        Assert.assertEquals(0.50, glass.getCurrenVolium(), 0.01);
    }

    @Test
    public void shouldThrowIllegalArgumentExeptuionWhenAmoundIsNegative() {
        // given
        Glass glass = new Glass(1.00);

        // when
        try {
            glass.fillIn(-2);
            Assert.fail("exepected was not thrown");
        } catch (IllegalArgumentException exception) {
            // then
            Assert.assertEquals("Amound Is Negative", exception.getMessage());
        }
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenCreativGlassWhifnegativolim() {
        //given
        int negativVolium = -1;

        // when
        try {
            new Glass(negativVolium);
            Assert.fail("exepected was not thrown");// assert fail wymuszamy czerwonego testu kiedy nie poleci wyjątek
        } catch (IllegalArgumentException exception) {
            // then
            Assert.assertEquals("Volium has to be positiv", exception.getMessage());// metoda statyczna
        }
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenCreativGlassWhifZeroVolim() {
        //given
        int zeroVolium = 0;

        // when
        try {
            new Glass(zeroVolium);
            Assert.fail("exepected was not thrown");// assert fail wymuszamy czerwonego testu kiedy nie poleci wyjątek
        } catch (IllegalArgumentException exception) {
            // then
            Assert.assertEquals("Volium has to be positiv", exception.getMessage());// metoda statyczna
        }
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenamountOFWeatherIsBeegerThenGlassVoliumLimit() {
        // given
        Glass glass = new Glass(1.00);

        // when
        try {
            glass.fillIn(1.5);
            Assert.fail("exepected was not thrown");// assert fail wymuszamy czerwonego testu kiedy nie poleci wyjątek
        } catch (IllegalArgumentException exception) {
            // then
            Assert.assertEquals("To Much Liquide", exception.getMessage());// metoda statyczna
            Assert.assertEquals(0, glass.getCurrenVolium(), 0.01);
        }

    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenSecondFillInExitVoliumlimit() {

        // given
        Glass glass = new Glass(1.00);
        double currenVolium = glass.getCurrenVolium();//wszystko przypisujemy do zmiennej//wyniki metod przypisujemy do zmiennej; zmienne przechowują wyniki metod


        // when
        try {
            glass.fillIn(0.50);
            currenVolium = glass.getCurrenVolium();
            glass.fillIn(0.60);
            Assert.fail("exepected was not thrown");// assert fail wymuszamy czerwonego testu kiedy nie poleci wyjątek
        } catch (IllegalArgumentException exception) {
            // then
            Assert.assertEquals("To Much Liquide", exception.getMessage());// metoda statyczna
            Assert.assertEquals(currenVolium, glass.getCurrenVolium(), 0.01);

        }
    }

    @Test// przypadek wilewam mniej niż jest
    public void shouldDecreasCurrentVolimWhenAmountOfLiquideIsSmalerThanCarentVolium() {
        // given
        Glass glass = new Glass(2);
        glass.fillIn(2);
        double amound = 1;

        //when
        glass.fillOut(amound);

        //then
        Assert.assertEquals(1, glass.getCurrenVolium(), 0.01);
    }

    @Test// przypadek wylewamy więcej niż jest
    public void shouldDecreasCurrentVolimWhenAmountOfLiquideIsBiggerThanCarentVolium() {
        // given
        Glass glass = new Glass(2);
        glass.fillIn(2);

        //when
        try {
            glass.fillOut(3);
            Assert.fail("exepected was not thrown");
        } catch (IllegalArgumentException exceptoin) {
            //then
            Assert.assertEquals("You can't do that", exceptoin.getMessage());
            Assert.assertEquals(2, glass.getCurrenVolium(), 0.01);
        }
    }

    @Test //wlylewam tyle ile jast wlane
    public void shouldDecreasCurrentVolimWhenAmountOfLiquideIsEqualToCarentVolium() {
        // given
        Glass glass = new Glass(2);
        double amound = 2;
        glass.fillIn(amound);

        //when
        glass.fillOut(amound);

        //then
        Assert.assertEquals(0, glass.getCurrenVolium(), 0.01);

    }

    @Test// wylewamy dwia razy
    public void shouldThrowIllegalArgumentExceptionWhenSecondFillOutExitVoliumlimit() {
        // given
        Glass glass = new Glass(2);
        glass.fillIn(2);
        double amound = 1;
        double carentVolium = glass.getCurrenVolium();

        //when
        try {
            glass.fillOut(1);
            carentVolium = glass.getCurrenVolium();// zmiennej mogę zrobić zmiennej mogę przypisać wartość = new, albo ze zmiennej moge wywołąć metodę
            glass.fillOut(1.5);
            Assert.fail("exepected was not thrown");// na obiekty wskazuję zmienne
        } catch (IllegalArgumentException exception) {
            //then
            Assert.assertEquals(carentVolium , glass.getCurrenVolium(), 0.01);
            Assert.assertEquals("You can't do that",exception.getMessage() );

        }
    }
}


//przypadek 4 - podwójnej wylewki