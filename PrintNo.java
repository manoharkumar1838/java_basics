import java.util.*;

public class PrintNo {
    public static void main(String[] args) {
        // int counter = 1;

        // //print no 1 to 10
        // while(counter <=10){
        //     System.out.println(counter);
        //     counter++;
        // }


        //print no 1 to n
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range){
          System.out.print(counter +" ");
          counter++;
        }
        System.out.println();
    }
}
