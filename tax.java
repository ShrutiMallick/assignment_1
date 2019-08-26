
public class Main{

   	public static void main(String[]args){
	double income;
	income=34000.00;
double taxdue;
  	if(income>=0.00&&income<=14999.99)
  	{
  taxdue=0.00+(income-0.00)*0.15;
   System.out.println(taxdue);
  	}
	else if(income>=15000.00&&income<=29999.99){
taxdue=2250.00+(income-15000.00)*0.18;
System.out.println(taxdue);}
	else if(income>=30000.00&&income<=49999.99){
	taxdue=5400.00+(income-30000.00)*0.22;
	System.out.println(taxdue);}
	else if(income>=50000.00&&income<=79999.99){
	taxdue=11000.00+(income-50000.00)*0.27;
	System.out.println(taxdue);}
	else if(income>=80000.00&&income<=150000.00){
	taxdue=21600.00+(income-80000.00)*0.33;
	System.out.println(taxdue);
	}
	else
	{ System.out.println("-1.0");}	
	}	
    }


