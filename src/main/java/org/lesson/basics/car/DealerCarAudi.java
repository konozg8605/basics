package org.lesson.basics.car;

public class DealerCarAudi {

    private int numberOfEmployees;
    private String surname;
    private double numberOfCars;
    private String [] models;
    private double aqoundBalance;

    public DealerCarAudi( int numberOfEmployees, String surname, double numberOfCars, String[] models, double aqoundBalance){
        this.numberOfEmployees = numberOfEmployees;
        this.surname = surname;
        this.numberOfCars = numberOfCars;
        this.models = models;
        this.aqoundBalance = aqoundBalance;
    }

    public String generateSelesRaport(int month, int year){
        String title = "Raport sprzedaży za miesiąc" + " " + month + " " + year + "!!!!";
        String sumery = "Raport został przygotowany przez" + this.surname;
        double tax = 0.23;
        double taxToPay= this.aqoundBalance * tax;
        double aqoundBalanceNet = this.aqoundBalance - taxToPay;
        String taxToPayLine = " Podatek do zapłaty wynosi:" + taxToPay;
        String aqoundBalanceNetLine = " Stan netto konta wynosi:" + aqoundBalanceNet;
        String aqoundBalacedLine = "Stan konta wynosi:" + this.aqoundBalance;
        double numberOfCarInStorge = 50;
        double numberOfCarsSold = numberOfCarInStorge - 10;
        String numberOfRemainingCars = "Ilość samochodów w magazynie wynosi:" + numberOfCarsSold;
        String nameOFModels = " Nazwy modeli do sprzedania" + models[0];

        return title + taxToPayLine + aqoundBalanceNetLine + aqoundBalacedLine + numberOfRemainingCars + nameOFModels + sumery;
    }
}
