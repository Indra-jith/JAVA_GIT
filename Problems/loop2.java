// a ->b armsttrong number
import java.util.Scanner;
public class loop2{
    public static boolean IsArmstrong(int a)
    {
        String num = String.valueOf(a);
        int length = num.length();
        int temp = a;
        int sum = 0;
        while(a!=0)
        {
            int rem = a%10;
            sum += Math.pow(rem,length);
            a = a/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(IsArmstrong(i))
            {
                System.out.println(i);
            }
        }
    }
}