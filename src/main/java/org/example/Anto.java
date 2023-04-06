package org.example;

public class Anto {
    public Anto() {
        int value = (int)(Math.random() * 10);
        int ret = switch (value) {
            default -> 0;
            case 1 -> 1;
            case 2 -> 2;
        };

        String message = String.format("The value is %d\n", value);
        System.out.println(message);
        System.out.println(ret);
    }
}
