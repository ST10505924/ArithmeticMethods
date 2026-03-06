/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticmethods;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class ArithmeticMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Integer: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter Second Integer: ");
        int num2 = sc.nextInt();
        
        System.out.println("The sum : " + Operators.sum(num1, num2));
        
        System.out.println("The difference :" + Operators.subtract(num1, num2));
        
        System.out.println("The product : " + Operators.mutilpy(num1, num2));
        
        System.out.println("The quotient :" + Operators.divide(num1, num2));
        
        System.out.println("The remainder : " + Operators.remainder(num1, num2));
        
        printMessage();
    }
    
    public static void printMessage( ) {
        
        System.out.println("All operators were tested , thank you!!!");
    }
}
