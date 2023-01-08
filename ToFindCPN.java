import java.util.Scanner;

public class ToFindCPN
{
    public static void main(String[] aar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("To Find Your CPN ");
        System.out.println("Enter you Matric percentage ");
        float matric_percentage = sc.nextFloat();
        System.out.println("Enter you Inter percentage ");
        float inter_percentage = sc.nextFloat();
        System.out.println("Enter you Enter test marks ");
        float test_marks = sc.nextFloat();
        float cpn = (((matric_percentage/100)*10)  + ((inter_percentage/100)*30)  + ((test_marks/100)*60));
        System.out.println("YOUR CPN IS : " + cpn);
    }
}
