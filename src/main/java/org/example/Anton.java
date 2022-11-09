package org.example;

public class Anton {
    public static void work() {
        System.out.println("Anton: I am hungry");
        String sandwich = Berta.order();
        System.out.println("Anton: I eat my "+sandwich);
    }
}
