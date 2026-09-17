package Array;

public class LargestArray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    public static void main(String arg[]) {
        int numbers[] = { 1, 2, 4, 6, 5 };
        
        System.out.println("largest number is : " + getLargest(numbers));
    }
}
