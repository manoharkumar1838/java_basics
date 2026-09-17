package Array;

public class BinarySearch {
     
    public static int BinarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) { 
            int mid = ((start + end) / 2);

            if (numbers[mid] == key) {
                return mid; // found

            } else if (key > numbers[mid]) {
                start = mid + 1; // right side

            } else {
                end = mid - 1; // left side
            }
        }
          return -1;

    } 
    
     
    
    
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("index: " + BinarySearch(numbers, key));
    }
}
