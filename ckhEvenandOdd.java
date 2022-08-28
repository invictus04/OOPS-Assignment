import java.util.Scanner;
public class ckhEvenandOdd {
    static void check(int n) {
        if(n% 2 == 0) {
            System.out.println("The number you entered is Even: " + n);
        } else { 
            System.out.println("The number you entered is Odd: " + n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        check(n);

    }
}
