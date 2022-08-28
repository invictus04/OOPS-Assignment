import java.util.Scanner;
public class recursiveDigit {

    static int sumOfDigits(int n) {
        if(n == 0) 
        return 0;
        return (n%10 + sumOfDigits(n/10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        sc.close();
        int res = sumOfDigits(n);
        System.out.println("Sum of Digits: " + res);
    }
}
