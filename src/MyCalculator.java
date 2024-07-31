import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
int n = scan.nextInt();
int p = scan.nextInt();
if( n < 0 || p < 0){
    throw new ArithmeticException("n or p should not be negative.");
} if ( n == 0 && p == 0){
    throw new ArithmeticException("n and p should not be zero.");
}
scan.close();
System.out.print(longPower(n,p));
    }
    static int longPower(int n, int p){
        double sum = Math.pow(n,p);
        int Sum = (int) sum;

        return Sum;
    }
}
