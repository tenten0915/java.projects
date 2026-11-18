import java.util.Scanner;

public class Control1 {

    public static void main(String[] args) {
    
        int intAge;

        Scanner objInputNum = new Scanner(System.in);

        System.out.print("Enter your age: ");
        intAge = objInputNum.nextInt();

        if (intAge < 18) {
            System.out.println("You're still a minor..");
        }  // if (intAge < 18)

    }  // public static void main(String[] args)

}  // public class Control1