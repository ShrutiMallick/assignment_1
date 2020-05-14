import java.util.*;
class nod{
   int coeff,pow;
    nod next;
}
 class LinkList{
	nod first,last;
	     public LinkList() {
		first=null;
		last=null;
	     }
	public void Insert(int coeff,int pow) {
		nod q=new nod();
		q.coeff=coeff;
		q.pow=pow;
		if(first==null) {
			first=last=q;			
		}
		else {
		last.next=q;
		last=q;	
		}
	}
	public void Display() {
		nod x=first;
		while(x!=null) {
			 if(x.coeff>0 && x.pow!=0) {
					System.out.println(" "+x.coeff+"x^"+x.pow);
				}
				else if(x.coeff<0 && x.pow!=0) {
					System.out.println(" "+x.coeff+"x^"+x.pow);
				}
				if(x.pow==0) {
					if(x.coeff>0) {
						System.out.println(" "+x.coeff);
					}
					else if(x.coeff<0) {
						System.out.println(" "+x.coeff);
					}
					else System.out.println(" +0");
				}
				x=x.next;
			}
		    System.out.println();
		}
	public void add(LinkList a,LinkList b){
			nod x1,x2;
			x1=a.first;
			x2=b.first;
			while(x1!=null && x2!=null) {
				if(x1.pow>x2.pow) {
					Insert(x1.coeff,x1.pow);
					x1=x1.next;
				
				}
				else if(x1.pow<x2.pow) {
					Insert(x2.coeff,x2.pow);
					x2=x2.next;
									}
				else {
					Insert(x1.coeff+x2.coeff,x1.pow);
					x1=x1.next;
					x2=x2.next;
				}
			}
			if (x1==null && x2!=null) {
				while(x2!=null) {
					Insert(x2.coeff,x2.pow);
					x2=x2.next;
					
				}
			}
			else if(x1!=null && x2==null) {
				while(x1!=null) {
					Insert(x1.coeff,x1.pow);
					x1=x1.next;
					
				}
			}
		}
	}
 
 public class minor_2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int coeff,exp,i,y,z;
			LinkList a=new LinkList();
			LinkList b=new LinkList();
			LinkList c=new LinkList();
			System.out.print("Enter the degree of Polynomial 1:\n");
			y=sc.nextInt();
			System.out.print("Enter coefficients in descending order:\n");
			for(i=y;i>0;i--) {
				System.out.print("Coefficient of x^"+i+":");
				coeff=sc.nextInt();
				a.Insert(coeff,i);
	}
		System.out.print("Constant:");
		coeff=sc.nextInt();
		a.Insert(coeff,0);
		System.out.print("Enter the degree of Polynomial 2:\n");
		z=sc.nextInt();
		System.out.print("Enter coefficients in descending order:\n");
		for(i=z;i>0;i--) {
			System.out.print("Coefficient of x^"+i+":");
			coeff=sc.nextInt();
			b.Insert(coeff,i);
   }
	System.out.print("Constant:");
	coeff=sc.nextInt();
	b.Insert(coeff,0);
	c.add(a, b);
	System.out.println("Polynomial 1:");
	a.Display();
	System.out.println("Polynomial 2:");
	b.Display();
	System.out.println("Addition of both the polynomials:");
	c.Display();
      }
}
 


