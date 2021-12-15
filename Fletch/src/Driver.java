import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MobileHomeMaker mobileHomeMaker = new MobileHomeMaker();

        Registration registration = new Registration();
        Login login = new Login();
        boolean test;
        System.out.println("Do you have an account type y to login or type n to register an account");
        String accountCheck = scanner.nextLine();
        int i = 0;
        if (accountCheck.contains("n")) {
            registration.registration(scanner);
        } else if (accountCheck.contains("y")) {
            while(i < 1) {
                test = login.login(scanner);
                if (test == true) {
                    i++;
                }
            }
        }

        System.out.println("Would you like to: \n 1. Make a booking \n 2. View booking \n 3. View account \n 4. Logout \n 5. Add mobile home");
        int input = scanner.nextInt();
        scanner.nextLine();
        if (input == 1){

        } else if(input == 2){

        } else if(input == 3){

        } else if(input == 4){

        } else if(input == 5){
            mobileHomeMaker.mobileHomeMaker();
        }
    }
}
