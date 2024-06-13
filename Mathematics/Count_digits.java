import java.util.Scanner;
class gfg{
    public static void main(String args[]){
        int res=0;
        //int x=7648;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.: ");
        int x=sc.nextInt();

        while(x>0){
            x=x/10;
            res++;

        }


        System.out.println("No. of digits: "+res);
    }
}