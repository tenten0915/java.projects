import java.util.Scanner;

public class Control3 {

    public static void main(String[] args) {
    
        int intAge, intGender;

        Scanner objInputNum = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        intAge = objInputNum.nextInt();

        System.out.print("Please enter your gender (1-Female/2-Male): ");
        intGender = objInputNum.nextInt();

        if (intAge >= 18) {
            if (intGender == 1) {
                System.out.println("Loading female profile form..");
            } else if (intGender == 2) {
                System.out.println("Loading male profile form..");
            } else {
                System.out.println("Please enter 1 for female or 2 for male..");
            }  // if (intGender == 1)
        } else {
            System.out.println("You're still a minor and cannot use this form..");
        }  // if (intAge >= 18)
  
 
    }  
}  