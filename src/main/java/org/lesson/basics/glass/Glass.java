package org.lesson.basics.glass;

public class Glass {

    private final double voliumLimit;// wartośc finalan czyli w tym wypadku nie zmieniająca objęytości
    private double currenVolium = 0;


    public Glass(final double voliumLimit) {// w konstruktorze nie muszą być wszystkie pola, wartość domyślana jest 0
        if (voliumLimit <= 0) {
            throw new IllegalArgumentException("Volium has to be positiv");
        }
        this.voliumLimit = voliumLimit;
    }

    public void fillIn(double amount) {
        if (amount < 0 ){
            throw new IllegalArgumentException("Amound Is Negative");
        }
        double newVolium = currenVolium + amount;
        if (newVolium > voliumLimit) {
            throw new IllegalArgumentException("To Much Liquide");
        }
        currenVolium = newVolium;

    }
    public double getCurrenVolium() {
        return currenVolium;
    }
    public void fillOut(double amount) {
        double newVolium = currenVolium - amount;
        if (newVolium < 0){
            throw new IllegalArgumentException("You can't do that");
        }
        currenVolium = newVolium;
    }
}
