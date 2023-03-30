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

        int ret = switch (value) {
            default -> 0;
            case 1 -> 1;
            case 2 -> 2;
        };

        int moreRet = switch (value) {
            default -> {
                System.out.println("default");
                yield 0;
            }
            case 1 -> {
                System.out.println("1");
                yield 1;
            }
            case 2 -> {
                System.out.println("2");
                yield 2;
            }
        };
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

    public void formatStrNewline() {
        var str = String.format("this bad %d\n", 10);
        System.out.println(str);
    }

    static abstract class AbstractDefaultMethodNotInjectable {
        @interface Inject {}

        @Inject
        public abstract int absMethod();
    }

    @Override
    public boolean equals(Object obj) {
        formatStrNewline();
        return super.equals(obj);
    }
}
