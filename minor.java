import java.util.*;
class Author{
String name;
String email;
char gender;
public String list;
int i;
Scanner sc = new Scanner(System.in);
public Author() {
				System.out.print("Enter Author Name : ");
				this.name = sc.nextLine();
				System.out.print("Enter Email ID : ");
				this.email = sc.nextLine();
				System.out.print("Enter Gender : ");
				this.gender = sc.next().charAt(0);
		}
			public String getName(){return name;}
			public String getEmail(){return email;}
			public char getGender() {return gender;}
			public void setEmail(String e) {this.email = e;}
			public String toString() {
				this.list = "Author : "+name+", email : "+email+", gender : "+gender+" ";
				return list;
			}
		}
			class Book extends Author{
				public Book(String name, String email, char gender) {
					super();
				}
				String bname,list2;
				Author author ;
				double price;
				int qty ;
					
						public Book(String name , Author author , double price,int qty){
								super();
								Scanner sc=new Scanner(System.in);
								System.out.print("Enter the book name:");
								bname=sc.nextLine();
								System.out.print("Enter Price : ");
								price = sc.nextDouble();
								setPrice(price);
								System.out.print("Enter Quantity : ");
								this.qty = sc.nextInt();
								System.out.println("<< Response recorded >>");
						}
				String list1 = super.list;
				public String getName(){return bname;}
				public Author getAuthor() {
								return author;
							}
						public double getPrice() {return price;}
						public void setPrice(double p){this.price = p;}
						public int getQty() {return qty;}
						public void setQty(int qty) {this.qty = qty;}
						@Override
						public String toString() {
							list2 = "Book : "+bname +" , "+ super.toString() +", price : "+price+", Qty : "+ qty+" ";
							return list2;
						}
			}
			class Date{
				int dd,mm,yyyy;
				String list;
				Scanner sc = new Scanner(System.in);
				public Date() {
					System.out.println("Enter Date , Month & Year in order :");
					dd = sc.nextInt();
					mm = sc.nextInt();
					yyyy = sc.nextInt();
				}
					public int getDD() {return dd;}
					public int getMM() {return mm;}
					public int getYYYY() {return yyyy;}
					public String toString() {
						return list;
						}
			}
				class Student extends Date{
					String name,list;
					Book a[] = new Book[5];
					int roll,b=-1,j=0,index=0;
					Date issueDate;
					Date returnDate;
						public Student() {
							Scanner sc=new Scanner(System.in);
							System.out.print("New Student Data\n\nEnter Your Name : ");
							name = sc.nextLine();
							System.out.print("Enter Your Roll No. : ");
							roll = sc.nextInt();
						}
						public String getName() {
							return name;
						}
						public int getRoll() {
							return roll;
						}
						public void issueBook(Book[] a, int n) {
							int x = -1;
							System.out.println("\nBOOK LIST :\n");
							for(int i=0;i<n;i++) {
								System.out.println(a[i].toString());}
							System.out.println("Do you want to issue?");
							char ch = sc.next().charAt(0);
							while(ch == 'y'){
								if(index>=5)
									{
										System.out.println("Maximum issued");
										break;
									}
								System.out.println("Enter the name of the book you want to issue :");
								String s = sc.next();
								for(int i=0;i<n;i++) {
									if(a[i].name.equalsIgnoreCase(s)==true)
										{if(a[i].qty>0)
											{System.out.println("Book is Available.");
												x++;
												b=i;
												}
											x++;
											}
									else if(i==n)	
										System.out.println("Book is not Available currently.");
								}
								if(x>=0) {
									System.out.println("Enter issue Date :");
										issueDate= new Date();
										j++;
										System.out.println("Book Issued ");
										this.a[index]=a[b];
									}
									System.out.println("ISSUE MORE?");
									ch=sc.next().charAt(0);
								}
						}
						public void depositBook() {
							if(index == 0)
								System.out.println("No Book Issued");
							else {
								System.out.println("Enter book name to be deposited");
								String s = sc.next();
								for(int i=0;i<index;i++) {
										if(this.a[i].name.equalsIgnoreCase(s)==true){
											for(int j=i;j<index-1;j++){
												this.a[j] = this.a[j++];
											}
											System.out.println("Book was returned");
											index--;
										}
										else if(i==index) 
											System.out.println("Book was not issued.");
								}
							}
					}
@Override
public String toString() {
	list = "Name : "+name+", roll "+roll;
	return list;
	}
}
public class minor {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Author x = null ;
			int bookno = -1;
			Student s[] = new Student[100];
			Book a[] = new Book[100];
			int studno = -1;
			char ch1 = 'n';
			while(ch1!='y') {
				System.out.println(" INSTRUCTIONS : ");
				System.out.println("1 for UPDATING THE LIBRARY. 2 for LIST. 3 for ISSUE. 4 for INDIVIDUAL DATA. 5 for RETURN. 6 for NEW STUDENT DATA");  
				System.out.println("  Enter your Choice : ");
				int ch = sc.nextInt();
				ch1='y';
				if(ch==1) {
					while(ch1=='y') {
						bookno++;
						a[bookno] = new Book(null, x, bookno, bookno);
						System.out.println("Want to enter more book?");
						ch1 = sc.next().charAt(0);
					}
				}
				else if(ch==2) {
					if(bookno == -1)
						System.out.println("No Book is Available currently !!!");
					else for(int i=0;i<=bookno;i++)
						System.out.println(a[i].toString());
				}
				else if(ch==3) {
					if(studno==-1) {
						studno++;
						s[studno]=new Student();
						s[studno].issueBook(a, bookno);
					}
					else s[studno].issueBook(a, bookno);
				}
				else if(ch==6) {
					System.out.println("Enter the New Student data");
					studno++;
					s[studno] = new Student();
				}
				else if(ch==3) {
					s[0].issueBook(a, bookno);
				}
				else if(ch==4) {
					if(studno==-1) {
						System.out.println("No Student has issued any Books currently!!");
					}
					else {
						for(int i = 0 ;i<studno;i++) {
							System.out.println(s[i].toString());
							if(s[studno].index>0) {
								System.out.println("ISSUED BOOKS");
								for(int j=0;j<s[0].index;j++)
									System.out.println(s[0].a[j].toString());
							}
							else System.out.println("No book issued");
						}
					}
				}
				else if(ch == 5) {
					s[0].depositBook();
				}
				else System.out.println("Invalid Request !!!");
				System.out.println("Want to Quit?");
				ch1 = sc.next().charAt(0);
			}
		}
}