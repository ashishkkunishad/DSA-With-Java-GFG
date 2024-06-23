import java.util.ArrayList;
import java.util.Scanner;
class gfg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        // System.out.print("Enter numbers: ");

        // int m=sc.nextInt();


        ArrayList<Integer> al= new ArrayList<>(n);

        for(int i=0;i<=n;i++){
            al[i]=sc.nextInt();
        }
        System.out.println(al);
    }
}