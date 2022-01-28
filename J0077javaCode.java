import java.util.Scanner;
import java.lang.Math.*;
public class J0077javaCode {
        public static void main(String[] args) {
            int x,y;
            String s1,s2;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number:- ");
            x = input.nextInt();
            System.out.println("Enter the second number:- ");
            y = input.nextInt();
            int sum = x+y;
            input.nextLine();
            System.out.println("Enter your name:- ");
            s1 = input.nextLine();
            System.out.println("Enter your father's name:- ");
            s2 = input.nextLine();
            System.out.println("Sum of two number are:-"+sum);
            System.out.println("Names are:-"+s1+s2);

        }
    }


