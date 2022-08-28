import java.util.Scanner;
public class chkVowel {
    static void checkVowel(char ch) {
        switch (ch) {
        case 'a' :
        System.out.println("You entered a vowel");
        break;
        case 'u' :
        System.out.println("You entered a vowel");
        break;
        case 'e' :
        System.out.println("You entered a vowel");
        break;
        case 'i' :
        System.out.println("You entered a vowel");
        break;
        case 'o' :
        System.out.println("You entered a vowel");
        break;
        default:
        System.out.println("You entered a constants");
        }


    }
 public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter the character: ");
    char ch = sc.next().charAt(0);
    sc.close();
    checkVowel(ch);

 }   
}
