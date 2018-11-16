package org.lesson.basics;

public class Greeting {
    private String text;

    public Greeting(String text) {
        this.text = text;
    }

    public String say(String name) {
        String personalGreeting = text + " " + name;
        return personalGreeting;
    }

}
