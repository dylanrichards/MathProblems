package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        MathRunnable collatzConjecture = new CollatzConjecture(new Scanner(System.in));
//        collatzConjecture.compute();

        MathRunnable factorial = new Factorial(new Scanner(System.in));
        factorial.compute();
    }

}
