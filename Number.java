import java.util.*;

public class Number {
    public static void main(String args[]) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
               System.out.print("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.print("Fizz");
            }
            else if(i%5==0)
            {
                System.out.print("Buzz");
            }
            else
            {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
