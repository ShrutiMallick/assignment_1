public class calculator{
 	public static void main(string[]args){
	int a=5,b=9;

	char operator;
	
	 operator='/';
	 
	int result;
	int result;
	switch(operator)
		{
		    case '+': result=a+b;
		 break;
		    case'-': result=a-b;
       		break;
		    case'*':result=a*b;
		break;
		   case'/':result=a/b;
		break;
		   case'^':result=Math.pow(a,b);
		break;
		  default:System.out.println("invalid operation");
                               }
	}
 }