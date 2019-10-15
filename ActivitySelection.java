import java.util.*;

public class ActivitySelection {

	public  static void Activity_Selection(String m[],int s[],int f[]){ 
System.out.println("following activities are selected");
int i,j;
i=0;

System.out.println(m[i]+"  "+s[i]+"  "+f[i]);
for(j=1;j<5;j++)
{
	if(s[j]>=f[i])
		System.out.println(m[j]+"  "+s[j]+"  "+f[j]);
	i=j;
}
	}
public static void main(String args[])	{
	Scanner sc=new Scanner(System.in);
	int k;
	String m[];
	int s[];
	int f[];
	m=new String[5];
	s=new int[5];
  	f=new int[5];
  	for(k=0;k<5;k++)
  	{
  		System.out.println("Enter job title,start time,end time");
  		m[k]=sc.next();
		s[k]=sc.nextInt();
		f[k]=sc.nextInt();
		
  		
  	}
  	Activity_Selection(m,s,f);
	


	
	
}
}


