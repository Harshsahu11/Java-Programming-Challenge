import java.util.Scanner;

public class Prime_Factorization {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        for(int div=2;div *div<=n;div++)
        {
            while(n%div==0){
                n=n/div;
                System.out.print(div+" ");
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}