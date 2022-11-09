package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Caesar {
    public static String bake() {
        System.out.println("Caesar: I am preparing a sandwich...");
        String rawSandwich = "sandwich";
        String bakedSandwich = "baked " + rawSandwich;
        List<String> ingredients;
        try {
            ingredients = Files.readAllLines(Paths.get("ingredients.txt"));
            System.out.println("Caesar: I got my ingredients (from file system)");
        } catch (IOException issue) {
            ingredients = List.of("ham");
        }
        String salamiSandwich = bakedSandwich + " with " + ingredients.get(0);
        System.out.println("Caesar: I am returning the sandwich...");
        return salamiSandwich;
    }
}
