public class calculator{
 	public static void main(String[]args){
	float a=5,b=9;

	char operator;
	
	 operator='/';
	 
	float result;
	
	switch(operator)
		{
		    case '+': result=a+b;
    			System.out.println(result);
		 break;
		    case'-': result=a-b;
			System.out.println(result);
       		break;
		    case'*':result=a*b;
			System.out.println(result);
		break;
		   case'/':result=a/b;
			System.out.println(result);
		break;
	         	  default:System.out.println("invalid operation");
                               }
	}
 }
