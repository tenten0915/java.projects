import java.util.Scanner;

public class Control2 {

    public static void main(String[] args) {
    
        String strPrompt;
        int intAge;

        Scanner objInputNum = new Scanner(System.in);

        System.out.print("Enter your age: ");
        intAge = objInputNum.nextInt();

        /*
        if (intAge < 18) {
            System.out.println("You're still a minor..");
        } else {
            System.out.println("You're already an adult..");
        }  // if (intAge < 18)
        */
  
        /* Use the ternary operator as an alternative */
        strPrompt = intAge < 18 ? "You're still a minor bawal pdfile dto" : "You're already a slayable ADULT..";

        System.out.println(strPrompt);      //this would make the prompt run  
 
    }  
}  