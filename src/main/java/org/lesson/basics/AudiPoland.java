package org.lesson.basics;

public class AudiPoland {

    public static void main(String[] args) {
        int month = 6;
        int year = 2018;
        DealerCarAudi salonKrakow = new DealerCarAudi(10, "OZGA", 10, new String[]{"A3", "A4", "A5", "A6", "A8"}, 500000.00);
        DealerCarAudi salonKielce = new DealerCarAudi(8, "BYSIAK", 15, new String[]{"A3", "A4", "A6"}, 400000.00);
        System.out.println(salonKrakow.generateSelesRaport(6, 2018));
        System.out.println(salonKielce.generateSelesRaport(6, 2018));
    }
}

