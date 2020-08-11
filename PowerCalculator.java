import java.util.Scanner;

public class PowerCalculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please type in your number: ");
            int n = input.nextInt();
            System.out.print("Please type in your Power: ");
            int p =input.nextInt();
            expMath(p,n);
        }
        public static void expMath(int exp, int num) {
            int result = 1;
            for (int i = 1; i <= exp ;i++) {
                result *= num;
            }
            System.out.println("The number " + num +" to the power " + exp + " = " + result);
        }
}


