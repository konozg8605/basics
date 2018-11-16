package org.lesson.basics;

public class Application {
    public static void main(String[]args){
        Greeting hello = new Greeting("Hello");
        String halloPiotrek = hello.say("Piotrek");
        System.out.println(halloPiotrek);
        Greeting siema = new Greeting("Siema");
        String siemaKonrad = siema.say("Konrad");
        System.out.println(siemaKonrad);

    }
}
