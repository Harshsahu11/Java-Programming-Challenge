import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int N=Sc.nextInt();
        int i;
        double f=1;
        for(i=1;i<=N;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial = "+f);
    }
}
