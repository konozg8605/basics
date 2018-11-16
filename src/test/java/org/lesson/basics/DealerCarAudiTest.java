package org.lesson.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class DealerCarAudiTest {

    @Test

    public void shouldGenerateSelsRaport() {

        //given

        DealerCarAudi dealerCarAudi = new DealerCarAudi(10, "OZGA", 10, new String[]{"A3", "A4", "A5", "A6", "A8"}, 500000.00);
        String expectedSelsRaport = "Raport sprzedaży za miesiąc 6 2018!!!! Podatek do zapłaty wynosi:115000.0 Stan netto konta wynosi:385000.0Stan konta wynosi:500000.0Ilość samochodów w magazynie wynosi:40.0 Nazwy modeli do sprzedaniaA4Raport został przygotowany przezOZGA";

        // then
        String selsRaport = dealerCarAudi.generateSelesRaport(6, 2018);

        //when
        assertEquals(expectedSelsRaport, selsRaport);

    }

    @Test
    public void shouldGenerateSelsRaport1() {

        //given

        DealerCarAudi dealerCarAudi = new DealerCarAudi(8, "Bysiak", 30, new String[]{"A3", "A4", "A6"}, 400000.00);
        String expctedSelsRaport1 = "Raport sprzedaży za miesiąc 6 2018!!!! Podatek do zapłaty wynosi:92000.0 Stan netto konta wynosi:308000.0Stan konta wynosi:400000.0Ilość samochodów w magazynie wynosi:40.0 Nazwy modeli do sprzedaniaA3Raport został przygotowany przezBysiak";

        //then

        String selsRaport1 = dealerCarAudi.generateSelesRaport(6, 2018);

        //when
        assertEquals(expctedSelsRaport1, selsRaport1);
    }
}