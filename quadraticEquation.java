/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author ROBERT
 */
 import java.util.Scanner;
public class quadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter value for x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter value for y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter value for z: ");
        double z = scanner.nextDouble();
        double exp = y * y - 4 * x * z;
        if (exp > 0) {
            double root1 = (-y + Math.sqrt(exp)) / (2 * x);
            double root2 = (-y - Math.sqrt(exp)) / (2 * x);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (exp == 0) {
             double root = -y / (2 * x);
            System.out.println("Root: " + root);
        } else {
           double realRoot = -y / (2 * x);
            double imaginaryRoot = Math.sqrt(-exp) / (2 * x);
            System.out.println("Root 1: " + realRoot + " + " + imaginaryRoot + "i");
            System.out.println("Root 2: " + realRoot + " - " + imaginaryRoot + "i");
        }

        scanner.close();
    }
   }

