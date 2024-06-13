class gfg{
    public static void main(String[] args) {
        int x=5479;
        int sum=0;
        while(x!=0){
            int ld=x%10;
            x=x/10;
            sum=sum+ld;
            System.out.print(ld+" ");//separate
        }
        System.out.println();


        //sum of digits
        System.out.println("sum of digits: "+sum);
    }
}