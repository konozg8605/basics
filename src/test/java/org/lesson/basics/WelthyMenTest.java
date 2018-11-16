package org.lesson.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class WelthyMenTest {


    @Test

    public void shouldGenerateFinancialRaport(){

        //given
        WelthyMen welthyMen = new WelthyMen(5, "Carington", 1000000,new String[]{"AUDI", "BMW"});
        String expectedFinancialRaport = "Raport finasowy za rok 2018\n Podatek do zapłaty wynosi: 0.19 Stan konta netto: 810000.0 Stan konta 1000000.0 Posiadane auta: AUDI Raport został przygotowany przez Carington";

        //when
        String finacialRaport = welthyMen.generateFinancialRaport(2018);

        //then
        assertEquals(expectedFinancialRaport, finacialRaport);

    }

    @Test

    public void shouldGenerateFinancialRaport2(){

        //given
        WelthyMen welthyMen = new WelthyMen(2, "Colby", 2000000.0,new String[]{"BMW"});
        String expectedFinancialRaport = "Raport finasowy za rok2018 Podatek do zapłaty wynosi: 0.19 Stan konta netto: 1620000.0 Stan konta 2000000.0 Posiadane auta: BMW Raport został przygotowany przez Colby";

        //when
        String financialRaport = welthyMen.generateFinancialRaport(2018);

        //then
        assertEquals(expectedFinancialRaport, financialRaport);

    }
}