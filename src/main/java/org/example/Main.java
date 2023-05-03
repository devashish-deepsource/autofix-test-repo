package org.example;

// これはコメントです。
public class Main implements Comparable<Main> {

    @interface Inject {}
    public static void newAutofixableIssues() {
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

    abstract class Abs {
        @Inject
        public abstract int myAbstractMethod();

        @Override
        public boolean equals(Object o) {
            double d1 = Math.random();
            double d2 = Math.random();
            return d1 == d2;
        }
    }

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
        var string = String.format("%d\n", 20);
        System.out.println(str);
        System.out.println(string);
        newAutofixableIssues();
    }

    static abstract class AbstractDefaultMethodNotInjectable {

        @Inject
        public abstract int absMethod();
    }

    @Override
    public boolean equals(Object obj) {
        formatStrNewline();
        return super.equals(obj);
    }
}
