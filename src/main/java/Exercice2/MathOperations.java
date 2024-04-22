/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

/**
 *
 * @author ABDOU
 */

public class MathOperations {

    public long calculateFactorial(long n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial cannot be calculated for negative numbers");
        }

        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
     public double calculateSquareRoot(double n) throws ArithmeticException {
        if (n < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }

        return Math.sqrt(n) ;
    }
}