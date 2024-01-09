import java.util.Scanner;

public class Main {
    // Method prompts to enter a list of values
    public static double computeAverage(Scanner scnr, int numCount) {
        double valuesSum = 0;
        int currValue = 0;

        for (int i = 0; i < numCount; ++i) {
            System.out.print("Enter number: ");
            currValue = scnr.nextInt();
            valuesSum += currValue;
        }

        return valuesSum / numCount;
    }

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int numValues;
        double averageVal;

        System.out.println("Enter number of values: ");
        numValues = scnr.nextInt();
        averageVal = computeAverage(scnr, numValues);

        System.out.print("Average: ");
        System.out.printf("%.2f", averageVal);
        System.out.println("");
    }
}
