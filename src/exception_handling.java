import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.print("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        }
        scan.close();
    }
}
