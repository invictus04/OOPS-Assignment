import java.util.Scanner;
public class sumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number: ");
            int n = sc.nextInt();
            sc.close();
            int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of Natural Number is: " + sum);
    }
}
