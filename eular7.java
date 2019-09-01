public class Main{
    public static void main(String[]args){
        int  x=0,c=0,i=2;
        
        while(x!=6){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                  c=c+1;
                }
            }
                if(c==1)
                {
                x=x+1;
                }
                if(x==6)
                {
                System.out.println("Prime number at 1001st position is "+i);
                
                }
                c=0;
                i++;
            }
            
            }