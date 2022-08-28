import java.util.Scanner;
public class calc {

    static void add(int a, int b) {
        int result = a + b;
        System.out.println("Your Output is:" + result);
    }


    static void sub(int a, int b) {
        int result = a - b;
        System.out.println("Your Output is:" + result);
    }


    static void divide(int a, int b) {
        if(b == 0) {
            System.out.println("Maths error!");
        } else {
            int result = a / b;
        System.out.println("Your Output is:" + result);
        }
    }


    static void mult(int a, int b) {
        int result = a * b;
        System.out.println("Your Output is:" + result);
    }


    static void modulo(int a, int b) {
        if(b == 0) {
            System.out.println("Maths error!");
        } else {
            int result = a % b;
        System.out.println( "Your Output is:" + result);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        System.out.print("Enter your choice: ");
        char ch =sc.next().charAt(0);
        sc.close();
        switch(ch) {
            case '+' :
            add(a,b);
            break;
            case '-' :
            sub(a,b);
            break;
            case '/' :
            divide(a,b);
            break; 
            case '*' :
            mult(a,b);
            break;
            case '%' :
            modulo(a,b);
            break;
            default:
            System.out.println("Invalid choice:");
        }
    }
}
