package LogicalPrograms;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int num;
        int firstTerm = 0;
        int secondTerm = 1;

        Scanner user = new Scanner(System.in);
        System.out.println("Enter as much Fibonnaci numbers to print");
        num = user.nextInt();

        System.out.println("Fibonacci Series upto " + num + " terms:");

        for (int i = 1; i < num; i++) {
            System.out.print( firstTerm + ", " );

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
