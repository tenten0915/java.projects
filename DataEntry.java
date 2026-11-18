import java.util.Scanner;

public class DataEntry{

    public static void main(String[] args){

        Scanner objScanner = new Scanner(System.in);

        Float[][] objData = new Float[5][4];

        for (int intRow = 0; intRow < objData.length; intRow++){

            System.out.println("\nRecord " + (intRow + 1) + ":");

            System.out.print("Product code: ");
            objData[intRow][0] = objScanner.nextFloat();

            System.out.print("Price: ");
            objData[intRow][1] = objScanner.nextFloat();

            System.out.print("Quantity: ");
            objData[intRow][2] = objScanner.nextFloat();

            objData[intRow][3] = objData[intRow][1] * objData[intRow][2];

        }

        System.out.printf("%n%-15s%-10s%-12s%-10s%n", "Product Code", "Price", "Quantity", "Amount");

        for (int intRow = 0; intRow < objData.length; intRow++) {

            for (int intColumn = 0; intColumn < objData[0].length; intColumn++){

                System.out.printf("%-15.2f", objData[intRow][intColumn]);

            }

            System.out.println();

        }

        objScanner.close();

    }

}