package org.example;

public class Caesar {
    public static String bake() {
        System.out.println("Caesar: I am preparing a sandwich...");
        String rawSandwich = "sandwich";
        String bakedSandwich = "baked "+rawSandwich;
        String salamiSandwich = bakedSandwich + " with Salami";
        System.out.println("Caesar: I am returning the sandwich...");
        return salamiSandwich;
    }
}
