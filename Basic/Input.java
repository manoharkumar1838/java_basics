package Basic;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        // these sc.nextLine() used to print full name even with space

        String name = sc.nextLine();
        System.out.println(name);

    //    for integer

        int number = sc.nextInt();
        System.out.println(number);

        // for float value

        float price = sc.nextFloat();
        System.out.println(price);
    }
    
}
