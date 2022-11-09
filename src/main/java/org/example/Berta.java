package org.example;

public class Berta {
    public static String order() {
        System.out.println("Berta: I am getting a sandwich from Caesar...");
        String meal = Caesar.bake();
        System.out.println("Berta: I am returning a sandwich...");
        return meal;
    }
}
