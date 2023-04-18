import java.util.Scanner;

public class DayFourZeroZero {
    static String string_username,string_password,string_gender;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        registeruser();
        validDetails(string_username,string_password,string_gender);
    }
    private static void validDetails(String stringUsername, String stringPassword, String stringGender) {
        if ((stringUsername.trim().length()!=0)&&(stringGender.trim().length()!=0)&&(stringPassword.trim().length()>=8))
        {
                System.out.println("Username & Password is Valid");

        }else
        {
            System.out.println("Details are Invalid");
        }
    }
    private static void registeruser() {
        System.out.println("Enter the username ::");
        string_username = scanner.nextLine();
        System.out.println("Username = " + string_username);
        System.out.println("Enter the Password ::");
        string_password = scanner.nextLine();
        System.out.println("Password = " + string_password);
        System.out.println("Enter the Gender ::");
        string_password = scanner.nextLine();
        System.out.println("Gender = " + string_gender);
    }
}
