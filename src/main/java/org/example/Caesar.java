package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Caesar {
    public static String bake() throws IOException {
        System.out.println("Caesar: I am preparing a sandwich...");
        String rawSandwich = "sandwich";
        String bakedSandwich = "baked " + rawSandwich;
        System.out.println("Caesar: I got my ingredients (from file system)");
        String salamiSandwich = bakedSandwich + " with " + Files.readAllLines(Paths.get("ingredients.txt")).get(0);
        System.out.println("Caesar: I am returning the sandwich...");
        return salamiSandwich;
    }
}
