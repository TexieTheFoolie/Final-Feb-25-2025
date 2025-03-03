import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Using one Scanner object for both inputs
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input name
        System.out.println("INPUT YOUR NAME");

        String userName = scanner.nextLine().toUpperCase(); 

        //prompt for clarification
        System.out.println("\nYOUR NAME IS - " + userName + " \nCORRECT? Y/N");
        
        String userClarification = scanner.nextLine().toUpperCase(); 

        // Prompt for passcode
        System.out.println("\nINPUT PASSCODE");
        String userPasswordStr = scanner.nextLine(); 

        // Convert the password string to an Integer object
        Integer userPasswordInteger = Integer.valueOf(userPasswordStr);

        // Authorizing user
        if (userName.equals("KAIDEN LOZA") && userPasswordInteger.equals(2517)) {
            System.out.println("\nWELCOME BACK KAIDEN LOZA");
            System.out.println("YOUR CLEARANCE LEVEL IS 5");
            System.out.println("THERE ARE TWO FILES AVAILABLE");
        } else if (userName.equals("TEX BERNIER") && userPasswordInteger.equals(6491)) {
            System.out.println("\nWELCOME BACK TEX BERNIER");
            System.out.println("YOUR CLEARANCE LEVEL IS 5");
            System.out.println("THERE ARE TWO FILES AVAILABLE");
        } else {
            System.out.println("\nUNAUTHORIZED USER");
            System.out.println("DISPATCHING SECURITY TEAM");
        }
    
    }
}

