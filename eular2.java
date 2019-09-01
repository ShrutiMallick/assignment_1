public class Main{
    public static void main(String[]args){
        int  a=0,b=1,c=0;
        
        for(int i=2;i<400000;i+=2){
            c=a+b;
            a=b;
            b=c;
            
        }
        System.out.print(c);
    }
}