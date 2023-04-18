import java.util.Scanner;

public class DayFourZero {
    static String string_username,string_password;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        registeruser();
        validDetails(string_username,string_password);
    }

    private static void validDetails(String stringUsername, String stringPassword) {
        if ((stringUsername.trim().length()!=0))
        {
            System.out.println("Username is Valid");
        }else
        {
            System.out.println("Username is Invalid");
        }

        if (stringPassword.trim().length()!=0)
        {
            System.out.println("Password is Valid");
        }else
        {
            System.out.println("Password is Invalid");
        }
    }


    private static void registeruser() {
        System.out.println("Enter the username ::");
        string_username = scanner.nextLine();
        System.out.println("Username = " + string_username);
        System.out.println("Enter the Password ::");
        string_password = scanner.nextLine();
        System.out.println("Password = " + string_password);

    }


}
