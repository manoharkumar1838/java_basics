public class ReverseOfNumber {
    public static void main(String[] args) {
          int n = 10899;

          // for lastDigit = num%10
          // for removal of last digit = num/10

          while(n > 0){
           int lastDigit = n % 10;
           System.out.print(lastDigit);
           n = n/10;
          }
          System.out.println();
    }
    
}
 