package org.lesson.basics;

public class TaxOffice {
    public static void main(String[] args) {
        int year = 2018;
        WelthyMen carington = new WelthyMen(5, "Carington", 1000000, new String[]{"Audi", "BMW"});
        WelthyMen colby = new WelthyMen(2, "Colby", 2000000.0, new String[]{"BMW"});
        System.out.println(carington.generateFinancialRaport(year));
        System.out.println((colby.generateFinancialRaport(year)));
    }
}
