package org.example;

public class Main implements Comparable<Main> {
    public static void main(String[] args) {
        int value = (int)(Math.random() * 3);
        switch (value) {
            default:
                System.out.println("default");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }
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
