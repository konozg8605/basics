package org.lesson.basics.fish;

public class Fish {// 2 pola masa i współczynnik wzostu, metoda karmienie parametry ilość paszy
    private double weight;
    private double growthFactor;
    private String name;

    public Fish(double weight, double growthFactor) {
        this.weight = weight;
        this.growthFactor = growthFactor;
    }
    public Fish(double weight, double growthFactor, String name) {
        this.weight = weight;
        this.growthFactor = growthFactor;
        this.name = name;
    }

    public void feeding(double amountOFFood) {
        if(amountOFFood >= 3 * weight){
            throw new IllegalArgumentException("Za dużo paszy " + this.toString() + " Dostał " + amountOFFood);// wyjątek nowy wyjątki śą obiektami
        }
        weight = weight + (amountOFFood / growthFactor);
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Ryba " + name + " o masie " + weight;
    }
}
