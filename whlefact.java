import java.util.Scanner;
public class whlefact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 1;
        int i = 1;
        while(i <= n) {
            sum *= i;
            i++;
        }
        System.out.println("Sum of Natural Number is: " + sum);
    }
}
