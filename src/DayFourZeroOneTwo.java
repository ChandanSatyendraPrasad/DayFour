import java.util.Scanner;

public class DayFourZeroOneTwo {
    public static void main(String[] args) {
        String firstname,lastname,email,user,pass;
        long mob;
        DayFourZeroOne dayFourZeroOne = new DayFourZeroOne();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name :: ");
        firstname=scanner.nextLine();
        dayFourZeroOne.setFirstname(firstname);
        System.out.println("Enter Your Last Name :: ");
        lastname=scanner.nextLine();
        dayFourZeroOne.setLastname(lastname);
        System.out.println("Enter Your User Name :: ");
        user=scanner.nextLine();
        dayFourZeroOne.setUserName(user);
        System.out.println("Enter Your Password :: ");
        pass=scanner.nextLine();
        dayFourZeroOne.setPassword(pass);
        System.out.println("Enter Your Email ID :: ");
        email=scanner.nextLine();
        dayFourZeroOne.setEmailId(email);
        System.out.println("Enter Your Mobile No :: ");
        mob=scanner.nextLong();
        dayFourZeroOne.setMobileno(mob);
        System.out.println("Data of Student \n"+dayFourZeroOne.toString());
    }
}
