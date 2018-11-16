package org.lesson.basics.person;

public class WelthyMen {
    private int numberOfGolgBar;// pole ( widoczność, typ, nazwa)
    private String familyName;
    private double aqountBalce;
    private String[] cars; // []-tablica
    // konstruktor : nie ma nazwy ale ma typ i parametry w nawiasach okrągłych
    public WelthyMen(int numberOfGolgBar, String familyName,double aqountBalce, String[] cars) {
        this.numberOfGolgBar = numberOfGolgBar; // odwołuje ( this.) sie do pola number of gold bar i przypisuje (=) parametr
        this.familyName = familyName;
        this.aqountBalce = aqountBalce;
        this.cars = cars;

    }
    public String generateFinancialRaport(int year){ // to jest metoda, zawiera: widocznosc, typ, nazwa, parametry, ciało metody,
       String title = "Raport finasowy za rok " + year +"\n"; // zmienna typu string o nazwie "title przypisałem wartoś
        String sumary = " Raport został przygotowany przez " + this.familyName;
        double tax = 0.19;
        double taxToPay = this.aqountBalce * tax;
        double aqoundBalanceNet = this.aqountBalce - taxToPay;
        String taxToPayLine = " Podatek do zapłaty wynosi: " + tax;
        String aqoundBalanceNetLine = " Stan konta netto: " + aqoundBalanceNet;
        String aqoundBalaceLine = " Stan konta " + this.aqountBalce;
        String listOfCars = " Posiadane auta: " + cars[0];
        return title + taxToPayLine + aqoundBalanceNetLine + aqoundBalaceLine + listOfCars + sumary;
    }

}

// zrobic test  do tego, expekted: zmiena przechowująca dany raport, w given zrobić ten ciąg nazws


