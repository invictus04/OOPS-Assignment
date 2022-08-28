import java.util.Scanner;
public class shapes {

    static void areaCricle(double r) {
        double result = 4 * Math.PI * r * r;
        System.out.print("The Area of circle is: " + result);
    }

    static void areaRectangle(int length, int breadth) {
        int result = length * breadth;
        System.out.print("The Area of rectangle is: " + result);
    }

    static void areaTriangle(int base, int height) {
        double result = 0.5 * base * height;
        System.out.print("The Area of triangle is: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select the Shape: ");
        String ch = sc.nextLine();
        if(ch.equals("cricle") || ch.equals("Circle")) {
            System.out.print("Enter the Radius of Cricle: ");
            double r = sc.nextDouble();
            sc.close();
            areaCricle(r);
        } else if(ch.equals("rectangle") || ch.equals("Rectangle")) {
            System.out.print("Enter the Length of the Rectangle: ");
            int length = sc.nextInt();
            System.out.print("Enter the Breadth of the Rectangle: ");
            int breadth = sc.nextInt();
            sc.close();
            areaRectangle(length, breadth);
        } else if(ch.equals("triangle") || ch.equals("Triangle")) {
            System.out.print("Enter the Base of the Triangle: ");
            int base = sc.nextInt();
            System.out.print("Enter the Height of the Triangle: ");
            int height = sc.nextInt();
            sc.close();
            areaTriangle(base, height);
        }
        else {
            System.out.println("Invaild choice");
        }
    }
}
