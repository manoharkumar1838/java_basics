public class HalfPyramidPattern {
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++){
            //number print
            for(int number=1; number<=i; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
