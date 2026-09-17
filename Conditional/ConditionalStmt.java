package Conditional;

// import java.util.*;

public class ConditionalStmt {
    public static void main(String[] args) {
        int age = 26; 

        // check first codition and if they are not satisfied then check 2nd condition
        
        // if(age >= 18){
        //     System.out.println("adult: drive, vote");
        // } 

        // if( age > 13 && age < 18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("not adult");
        // }

        if(age >= 18){
            System.out.println("Adult");
        }
        else if(age > 13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }
    }
}
