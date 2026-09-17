package String;

import java.util.*;

public class basicString {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("abcd");

        // Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String str3 = "Manohar kumar";
        // System.out.println(str3.length());

//--------------------------------------------------------------------
        // Concatination (two string Addition)

        // String firstName = "Manohar";
        // String lastName = "Kumar";
        // String FullName = firstName + " " + lastName;
        // System.out.println(FullName);
        // System.out.println(firstName + " " + lastName);

        //-----------------------------------------------------------------

        // for printing individual character

         String firstName = "Manohar";
        String lastName = "Kumar";
        String FullName = firstName + " " + lastName;
        System.out.println(FullName.charAt(6));
    }
}
