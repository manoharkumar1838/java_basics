package Function;

import java.util.*;

public class SyntaxWithparameters {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // public static void calculateSum(int a, int b) {
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a + b;
    //     System.out.println("sum is : " + sum);
    // }

    public static int calculateSum(int a, int b) {  //parameters or formal parameters
        int sum = a + b;
       return sum;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // calculateSum(a, b); 
        int sum = calculateSum(a, b); // Arguments or actual parameters
        System.out.println("sum is : " + sum);
        
    }
    
    
}
