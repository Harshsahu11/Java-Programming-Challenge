public class loops {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        for(i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        System.out.println("Done");
    }
}
