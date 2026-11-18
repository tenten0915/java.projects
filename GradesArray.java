import java.util.Scanner;

public class GradesArray{

    public static void main(String[] args){

        Scanner objScanner = new Scanner(System.in);

        Float[] objGrades = new Float[10];

        System.out.println("Enter up to 10 grades (enter 0 to skip a slot):");

        for (int intIndex = 0; intIndex < objGrades.length; intIndex++){
            System.out.print("Grade " + (intIndex + 1) + ": ");
            objGrades[intIndex] = objScanner.nextFloat();
        }

        int intCount = 0;
        for (int intIndex = 0; intIndex < objGrades.length; intIndex++){
            if (objGrades[intIndex] != 0) {
                intCount++;
            }
        }

        Float[] objResizedGrades = new Float[intCount];
        int intResizedIndex = 0;

        for (int intIndex = 0; intIndex < objGrades.length; intIndex++){
            if (objGrades[intIndex] != 0) {
                objResizedGrades[intResizedIndex] = objGrades[intIndex];
                intResizedIndex++;
            }
        }

        System.out.println("\nOriginal array size: " + objGrades.length);
        System.out.println("Resized array size: " + objResizedGrades.length);

        System.out.print("Grades entered: ");
        for (float fltGrade : objResizedGrades){
            System.out.print(fltGrade + " ");
        }

        objScanner.close();

    }

}