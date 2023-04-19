import java.util.Scanner;

public class DayFourZeroOneThree {
    static DayFourZeroOne student = new DayFourZeroOne();
    static int demand;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Enter the number of student you want to register");
                demand=scanner.nextInt();
                while (demand>0)
                {
                    registerStudent();
                    demand--;
                }


            }while (demand!=0);
        } catch (Exception e) {
            System.out.println("Warning");
        }
    }
    private static void registerStudent()
    {
        String firstname,lastname,email,user,pass;
        long mob;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name :: ");
        firstname=scanner.nextLine();
        student.setFirstname(firstname);
        System.out.println("Enter Your Last Name :: ");
        lastname=scanner.nextLine();
        student.setLastname(lastname);
        System.out.println("Enter Your User Name :: ");
        user=scanner.nextLine();
        student.setUserName(user);
        System.out.println("Enter Your Password :: ");
        pass=scanner.nextLine();
        student.setPassword(pass);
        System.out.println("Enter Your Email ID :: ");
        email=scanner.nextLine();
        student.setEmailId(email);
        System.out.println("Enter Your Mobile No :: ");
        mob=scanner.nextLong();
        student.setMobileno(mob);
        System.out.println("Data of Student \n"+student.toString());
    }
}
