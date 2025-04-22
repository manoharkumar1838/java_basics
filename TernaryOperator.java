public class TernaryOperator {
    public static void main(String[] args) {
        int number = 9;

        //ternary operator syntax
        // ((condition)? "statment 1" : "statment 2");
       
        String type = (((number%2) == 0) ? "Even" : "Odd");
        System.out.println(type);
    }
}
