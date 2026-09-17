package Array;

public class SmallestArray {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 5, 7, 6 };
        
        System.out.println("smallest numbers is : " + getSmallest(numbers));
    }
    
}
