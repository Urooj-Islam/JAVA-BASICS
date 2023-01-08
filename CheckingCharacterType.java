import java.util.Scanner;

public class CheckingCharacterType
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        while(true){
            System.out.println("Enter an character");
             ch = sc.nextLine().charAt(0);

            if (ch >= 65 && ch <= 90)
            {System.out.println(ch + " is an alphabet");}
            else if (ch >= 48 && ch <= 57)
            {System.out.println(ch + " is a number");}
            else
            {System.out.println(ch + "is a symbol");}
        }}}



