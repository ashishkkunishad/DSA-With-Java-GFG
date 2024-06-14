class gfg{
    public static void main(String[] args) {
        int n=10;
        long res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
            System.out.println(res);
            int zeros=0;
        while(res%10==0){
            zeros++;
            res=res/10;

            }
            System.out.println(zeros);

        }
    }
