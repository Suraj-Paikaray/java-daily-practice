package javaPrograms;
import java.util.Scanner;

public class functionOddEven {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int number = n.nextInt();   // ✅ read input

        if (OddEven(number)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        n.close();
    }

    static boolean OddEven(int number) {
        return number % 2 == 0;
    }
}
