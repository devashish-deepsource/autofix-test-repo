package org.example;

public class Main implements Comparable<Main> {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    public int compareTo(Main o) {
        double d1 = Math.random();
        double d2 = Math.random();

        // if (d1 == d2) {
        if (d1 == d2) {
            // Vibe here.
            return 0;
        }
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
