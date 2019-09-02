public class Main
{
	public static void main(String[] args) {
		int s=0,m,x,z=0;
		for(int a=100;a<=999;a++){
		    for(int b=100;b<=999;b++){
		        x=a*b;
		        m=x;
		        s=0;
		        while(x>=10){
		            s*=10;
		            s+=x%10;
		            x/=10;}
		            s*=10;
		            s+=x;
		            if(s==m)
		            {if(m>z)
		            z=m;}
		        }
		}
		        System.out.println(z);
		
		
	}
}