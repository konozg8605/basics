package org.lesson.basics.fish;

import java.util.Arrays;

public class FishFarm {
    private Fish[] fishs;

    public FishFarm(Fish[] fishs) {
        this.fishs = fishs;
    }

    public void feedThemAll(double foodAmoundPerFarm) {
        double sumeWeightOfFishs = this.sumeWeightOfFishs();

        for (int i = 0; i < fishs.length; i = i + 1) {// pętla ma 3 składowe: licznik- najczęściej zmienna typu int i nazywa się i, warunek,indykator przesuniecia
            Fish fish = fishs[i];
            double foodAmoundPerFish = fish.getWeight() / sumeWeightOfFishs * foodAmoundPerFarm;
            fish.feeding(foodAmoundPerFish);
            System.out.println(" i: " + i + " masa ryby: " + fish.getWeight() + " " + foodAmoundPerFarm);
        }
    }

    private double sumeWeightOfFishs() {
        double sumeWeight = 0;
        for (Fish fish : fishs) {
            sumeWeight = sumeWeight + fish.getWeight();
        }
        return sumeWeight;
    }

    public void feedThemAll2(double foodAmoundPerFish) {// zmieninić metody w taki sposób jak pierwszą metode

        for (Fish fish : fishs) {// : for each pętla  ; dla każdego elemntu z tabicy fish przypisz element
            fish.feeding(foodAmoundPerFish);
            System.out.println("Masa ryby: " + fish.getWeight());
        }
    }

    public void feedThemAll3(double foodAmoundPerFish) {

        Arrays.stream(fishs)
                .forEach((fish) -> {
                    fish.feeding(foodAmoundPerFish);
                    System.out.println("Masa ryby: " + fish.getWeight());
                });
    }
    public Fish fishing(double weight){ // zmienna typu for each!!!!!!
        for (Fish fish : fishs){
            if (fish.getWeight() >= weight){
                return fish;// sygnatura metody musi się zgadzac ze wzracana zmienną bądz obiektem ( zmiena wskazuje obiekt)
            }
        }
        return null;//  jeśli nic nie znajdziemy to zwracamy null
    }

    public Fish[] getFishs() {
        return fishs;
    }

    public static void main(String[] args) {
        Fish[] fishs = new Fish[5];
        fishs[0] = new Fish(1, 1, "carp");
        fishs[1] = new Fish(2, 2, "carp");
        fishs[2] = new Fish(3, 3, "grass carp");
        fishs[3] = new Fish(4, 4, "carp");
        fishs[4] = new Fish(5, 5, "carp");

        FishFarm farm = new FishFarm(fishs);
        System.out.println(farm.fishing(6));
        farm.feedThemAll(15);
        System.out.println(farm.fishing(5));
        farm.feedThemAll2(1);
        farm.feedThemAll3(2);
        System.out.println(farm.fishing(10));
    }

}
// napisać test do tego

// w giwen ma być
//Fish[] fishs = new Fish[5];
//        fishs[0] = new Fish(1, 1, "carp");
//                fishs[1] = new Fish(2, 2, "carp");
//                fishs[2] = new Fish(3, 3, "grass carp");
//                fishs[3] = new Fish(4, 4, "carp");
//                fishs[4] = new Fish(5, 5, "carp");
//
//                FishFarm farm = new FishFarm(fishs);
//                System.out.println(farm.fishing(6));
//                farm.feedThemAll(15);
//                System.out.println(farm.fishing(5));
//                farm.feedThemAll2(1);
//                farm.feedThemAll3(2);
//                System.out.println(farm.fishing(10));