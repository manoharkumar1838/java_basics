public class SwitchStatment {
    public static void main(String[] args) {
        int number = 2;

        // "break" use it after the statment
        switch(number){
          case 1 : System.out.println("Samosa");
                    break;
          case 2 : System.out.println("Burger");
                     break;
          case 3 : System.out.println("Mango");
                     break;
          default : System.out.println("no idea");          
        }
    }
    
}
