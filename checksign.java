import java.util.Scanner;
public class checksign {
    static void checkSign(int a, int b) {
        if(a>0 && b>0) {
            System.out.println("Both the numbers are positive");
        } else if(a<0 && b<0) {
            System.out.println("Both the numbers are negative");
        } else if(a>0 && b<0) {
            System.out.println("a is positive and b is negative");
        } else if(a<0 && b>0) {
            System.out.println("a is negative and b is positive");
        } else {
            System.out.println("Both the numbers are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number a: " );
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        sc.close();
        checkSign(a,b);
    }
}
