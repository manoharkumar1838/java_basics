package Array;

// linear search
public class LinearSearch {

    // for string array
    // public static int LinearSearch (String menu[], String key){

    public static int LinearSearch (int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

        // for string

        // for (int i = 0; i < menu.length; i++) {
        //     if(menu[i].equals(key)){
        //         return i;
        //     }
        // }
        // return -1;

    }
    
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 16 };
        int key = 10;
        int index = LinearSearch(numbers, key);
        if (index == -1) {
            System.out.println("key is not found");
        } else {
            System.out.println("key is at index : " + index);
        }

        // for string

        // String menu[] = { "Dosa", "Sandwitch", "Samosa", "Coke", "Sprite" };
        // String key = "Samosa";

        // int index = LinearSearch(menu, key);
        // if (index == -1) {
        //     System.out.println("key is not found");
        // } else {
        //     System.out.println("key is at index :" + index);
        // }
    }
}
