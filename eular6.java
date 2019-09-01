public class Main{
    public static void main(String[]args){
        int  sum=0,sum1=0,d=0;
        
        for(int i=1;i<=100;i++){
            sum+=i;
            sum1+=(int)Math.pow(i,2);
            }
        d=(int)Math.pow(sum,2)-sum1;
        System.out.println(d);
    }
}