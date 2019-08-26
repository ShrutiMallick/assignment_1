public class greatestnumber{

   	public static void main(String[]args){
	int a=5,b=9,c=10,d=8;
	int result;
	result=(a>b?a:b);
	result=(c>d?(c> result?c:result):(d>result?d:result));
	System.out.println(result);}
}
