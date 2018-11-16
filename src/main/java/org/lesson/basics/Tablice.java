package org.lesson.basics;

public class Tablice {

    public static void main(String[] args) {


//        int[] liczba = {10, 20,30,40,50,60,70,80,90,100};

//       for (int i = 0; i < liczba.length;i++)// (inicjalizacja zmiennych;warunek pętli; co ma sie stać po wykonaniu instrukcji wszystkich w pętli
//        System.out.println(liczba[i]);

//        for(int dupa: liczba)
//        {
//            System.out.println(dupa);
//         }
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();

        }
    }
}