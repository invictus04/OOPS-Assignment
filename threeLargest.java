import java.util.Scanner;
public class threeLargest {
  static void findLargest(int a, int b, int c) {
    
        if(a == b && a==c) {
            System.out.println("Numbers are equal");
        }
          else if(a>b && a>c) {
            System.out.println(a + " is larger");
        } else if( b>a && b>c ) {
            System.out.println(b + " is larger");
        } else {
            System.out.println(c + " is larger");
        }
    }

   
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number a: ");
            int a = sc.nextInt();
            System.out.print("Enter the number b: ");
            int b = sc.nextInt();
            System.out.print("Enter the number c: ");
            int c = sc.nextInt();
            sc.close();
            findLargest(a, b, c);

    }
}
