import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
