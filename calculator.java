import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\tHere's a calculator ");
        System.out.println("Enter  two numbers and arithmetic operator (+ - x ÷) ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op  = sc.nextLine().charAt(0);

        switch (op)
        {
            case '+':
                System.out.println(a + "+" + b + "=" + a+b);
                break;
            case '-':
                System.out.println(a + "-" + b + "=" );
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + a*b);
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + a/b);
                break;

            default:
                System.out.println("not a suggested operator");
                break;
        }
    }
}