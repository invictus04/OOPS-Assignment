import java.util.*;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("The Fibonaaci series is: ");
        int a = 0, b = 1;
        System.out.print(a + " ");
        if(n > 1) {
              for(int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp = b + a; 
                a = b; 
                b = temp;
                 
              }
              System.out.println();
        }
    }
}
