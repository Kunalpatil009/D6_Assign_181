package LogicalPrograms;
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] kunal) {
        int A;
        int num;
        int sum = 0;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter The Number To Check a Perfect Number: ");
        num = user.nextInt();

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                num = sum + i;
            }
        }
            if (sum == num) {
                System.out.print("Entered Number " + num);
                System.out.print(" is Perfect Number");
            } else {
                System.out.print("Entered Number " + num);
                System.out.print(" is not Perfect Number");
            }
    }
}