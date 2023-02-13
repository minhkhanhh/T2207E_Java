/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithi;

/**
 *
 * @author ADMIN
 */
public class ComplexDemo {
  public static void main(String[] args) {
    Complex complex1 = new Complex(1, 3);
    Complex complex2 = new Complex
        (5, 7);
    
    System.out.println("Complex number 1: " + complex1);
    System.out.println("Complex number 2: " + complex2);
    
    Complex sum = complex1.add(complex2);
    System.out.println("Sum of complex numbers: " + sum);
    
    Complex difference = complex1.subtract(complex2);
    System.out.println("Difference of complex numbers: " + difference);
    
    Complex product = complex1.multiply(complex2);
    System.out.println("Product of complex numbers: " + product);
    
    Complex quotient = complex1.divide(complex2);
    System.out.println("Quotient of complex numbers: " + quotient);
    
    complex1.setRealPart(10);
    complex1.setImaginaryPart(20);
    System.out.println("Complex number 1 after modification: " + complex1);
  }
}
