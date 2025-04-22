public class LargestOf3 {
    public static void main(String[] args) {
        int A = 6, B = 10, C = 8;

        if((A >= B) && (A >= C)){
         System.out.println("Largest is A");
        }
        else if(B >= C){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest is C");
        }
    }
}
