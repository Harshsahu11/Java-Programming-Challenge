import java.util.*;
public class Grading_System {
    public static void main(String[] args) {
        System.out.println("Enter Mark of Student");
        Scanner Sc=new Scanner(System.in);
        int marks=Sc.nextInt();
        if(marks>=90)
        {
            System.out.println("Excellent");
        }
        else if(marks>=80)
        {
            System.out.println("Good");
        }
        else if(marks>=70)
        {
            System.out.println("Fair");
        }
        else if(marks>=60)
        {
            System.out.println("Meets Expectations");
        }
        else {
            System.out.println("Par");
        }

    }
}
