import java.util.Scanner;
public class missingvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many inputs are there?");
        int n = scanner.nextInt();
        scanner.nextLine(); //we should use nextLine after nextInt because int donot read \n character and stops before
        float arrx[] = new float[n];
        float arry[] = new float[n];
        System.out.println("Enter the inputs(x)");
        for(int i=0;i<n;i++)
        {
            arrx[i]=scanner.nextFloat();
        }
        System.out.println("Enter the inputs(y)");
        for(int i=0;i<n;i++)
        {
            arry[i]=scanner.nextFloat();
        }
        float sumx=0;
        float sumy=0;
        float sumxy=0;
        float sumx2=0;
        for(int i=0;i<n;i++)
        {
            sumx+=arrx[i];
            sumy+=arry[i];
            sumxy+=(arrx[i]*arry[i]);
            sumx2+=(arrx[i]*arrx[i]);
        }
        float a,b;
        b=((n*sumxy)-(sumx*sumy))/((n*sumx2)-(sumx*sumx));
        a=(sumy/n)-(b*(sumx/n));
        System.out.println("The coefficients are=> a:"+a+" and b:"+b);
        scanner.nextLine(); //same here
        System.out.println("Which one is the missing value? X or Y?");
        String choice = scanner.nextLine();
        if(choice.equals("Y") || choice.equals("y"))
        {
            System.out.println("Enter the value of x: ");
            float x = scanner.nextFloat();
            float y = a+(b*x);
            System.out.println("Missing value y is equal to:"+y);
        }
        else
        {
            System.out.println("Enter the value of y: ");
            float y = scanner.nextFloat();
            float x = (y-a)/b;
            System.out.println("Missing value x is equal to:"+x);
        }
    }
}
