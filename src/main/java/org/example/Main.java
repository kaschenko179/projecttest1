package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value a:");
        int a = scanner.nextInt();

        System.out.println("Enter value b:");
        int b = scanner.nextInt();

        if (a < -20 || a > 20 || b < -20 || b > 20) {
            System.out.println("Error: values must be in range -20 to 20");
            return;
        }

        EquationSolver solver = new EquationSolver();
        double result = solver.solveEquation(a, b);

        System.out.println("Result: " + result);
    }
}
