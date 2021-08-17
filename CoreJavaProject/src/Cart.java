import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Cart {
	static String name;
static ArrayList<Integer> p=new ArrayList<Integer>();
static ArrayList n=new ArrayList();
static ArrayList co=new ArrayList();
static ArrayList qty=new ArrayList();
static double tp;
private static Scanner sc;

public static void name(String name1) {
	name=name1;
	
}
public static void addcart(int price,String name, String color) {
	sc = new Scanner (System.in);
	System.out.println("\n");
	System.out.println("Enter the quantity to be added");
	int q=sc.nextInt();
	System.out.println("\n");
	System.out.println(q +" item added successfully to your cart");
    if(q==0) {
    	System.out.println("Quantity not selected");
	Categories.category();
     }
	p.add(price);
	n.add(name);
	co.add(color);
	qty.add(q);
	
	
//	System.out.println(p+" "+n+" "+co+" "+qty);
	next();
	}

private static void next() {
try {
	System.out.println("\n");
	System.out.println("Want to add some more items OR View your cart"+"\n"+"1.SHOP BY CATEGORIES"+"\n"+"2.VIEW CART");
	int choice=sc.nextInt();
	
	switch(choice){
		case 1:Categories.category();
		break;
		case 2:viewcart();
		break;
		default:System.err.println("Enter the correct choice");
		next();
	}
	}catch(Exception e) {
	System.err.println("Enter the correct choice");
	next();
	}
}

public static void removecart() {

	if (n.size() == 0) {
		System.out.println("                   YOUR CART IS EMPTY !!!!!");
		System.out.println("--------------------------------------------------------------------");
		Exit.exit();
		return;//break
	}
	try {
		if(n.size()>0) {
			System.out.println("Enter the sl.no to be removed?");
			int i = sc.nextInt();
			p.remove(i-1);
			n.remove(i-1);
			co.remove(i-1);
			qty.remove(i-1);
			System.out.println("Succesfully removed items from your cart!!!!");
			System.out.println("\n");
			System.out.println("Continue SHopping???? OR Proceed with the bill????"+"\n"+"1. SHOP BY CATEGORIES     2.BILL"
					+ "      3.REMOVECART     4.VIEWCART");
			int r=sc.nextInt();
			if(r==1) {
				Categories.category();
			}
			else if(r==2) {
			    bill();
			}
			else if(r==3) {
				removecart();
			}
			else if(r==4) {
				viewcart();
			}
			else {
				HomePage.home();
			}
		}
		else {
			System.out.println("\n");
			System.err.println("Enter the valid sl.no");
			removecart();
		}
	}catch(Exception e) {
		System.out.println("\n");
		System.err.println("Enter the valid no");
		removecart();
	}
	
}
public static void viewcart() {
	Scanner sc=new Scanner(System.in);
	try {
		if(n.size()==0) {
			System.err.println("                   YOUR CART IS EMPTY !!!!!");
			System.out.println("--------------------------------------------------------------------");
			Exit.exit();
			return;//break
		}
		
		if(n.size()>0) {
			System.out.println("                         _________________________________________________________________________________________________________");
		    System.out.println(String.format("%25s %-5s| %-41s| %-20s| %-20s| %-10s|","|","Sl.no","Item","Quantity","Price","Total"));
		    System.out.println("                        |_________________________________________________________________________________________________________|");
		    
		   int sum=0;
		    
		    for(int i=0;i<p.size();i++) {
		    	int pr=(int) p.get(i);
		    	int qt=(int) qty.get(i);
		    	double total=pr*qt;
		    System.out.println(String.format("%25s %-5s| %-20s %-20s| %-20s| %-20s| %-10s|","|",(i+1),n.get(i),co.get(i),qty.get(i),p.get(i),total));	 
			System.out.println("                        |_________________________________________________________________________________________________________|");
                sum=(int) (sum+total);
		    }
		    System.out.println("\n");
		    System.out.printf("%118s| %-10s|","TotalAmount             ",(double)sum);
		    
		    System.out.println("\n"+"What do you want to proceed with?"+"\n"+"1.REMOVECART"+"         2.BILL"+"         3.HOMEPAGE");
			int v=sc.nextInt();
			if(v==1) {
				System.out.println("\n");
				removecart();
			}
			else if(v==2) {
				System.out.println("\n");
				bill();
			}
			else if(v==3) {
				System.out.println("\n");
				HomePage.home();
			}
			else {
				System.err.println("Enter a valid choice");
				viewcart();
			}
			
		  }
		else {
			System.out.println("\n");
			System.err.println("Enter the valid sl.no");
			viewcart();
		}
		
		
		
	}catch(Exception e) {
		System.err.println("Enter a valid choice");
		viewcart();
	}
	
	
}

public static void bill() {
	Scanner sc=new Scanner(System.in);
	try {
		if(p.size()==0) {
			System.err.println("                     YOUR CART IS EMPTY!!!!!");
			System.err.println("                  NO ITEMS PURCHASED TO BILL!!!!!");
			System.out.println("--------------------------------------------------------------------");
			Exit.exit();
			return;//break
		}
		
	    
	     
        if(p.size()>0 ) {
        	Date date=new Date();
        	SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
        	String format = sf.format(date);
        	Calendar c = Calendar.getInstance();
        	c.add(Calendar.DAY_OF_MONTH, 4);
        	Date date1=c.getTime();
        	String format1 = sf.format(date1);
        	System.out.println("\n");
            System.out.printf("%59s %65s %-10s \n","GSTIN Number:     06AAGCK4804E2ZY","Date Of Creation: ",format);
            System.out.printf("%59s %65s %-10s \n","Invoice Number:   C10000004997807","Date of Delivery: ",format1);

            System.out.println("                      ________________________________________________________________________________________________________________________");
            System.out.printf("%25s %-70s %-43s|\n","|","Buyer's Name and Address","Seller's Name and Address");
            System.out.println("                        |                                                                                                                   |");
            System.out.printf("%25s %-70s %-43s|\n","|",name,"Shopping-Houz Products & Service Pvt.Ltd");
            System.out.printf("%25s %-70s %-43s|\n","|","#12,12th Cross,Mico 1st gate opp","No.26/3 1st floor A BLock");
            System.out.printf("%25s %-70s %-43s|\n","|","Near Bangalore Central Jail","80 Feet Road,Industrial Suburbs");
            System.out.printf("%25s %-70s %-43s|\n","|","Hosa-Road,Bangalore-560100","Koramangala,Bangalore-560034");
            System.out.printf("%25s %-70s %-43s|\n","|","Karnataka-India","Karnataka-India");

            System.out.printf("%25s %-17s %-30s %-10s %-35s %-10s %-5s|\n","|"," ","0/0(018)0008/033893","(008-256372)"," ","018/737","5974");
            System.out.println("                        |-------------------------------------------------------------------------------------------------------------------|");
            System.out.printf("%25s %-40s %-73s|\n","|"," ","TAX INVOICE No. 1808T032029890");
        	System.out.println("                        |-------------------------------------------------------------------------------------------------------------------|");
            System.out.println(String.format("%25s %-10s| %-18s| %-41s| %-10s| %-10s| %-15s| ","|","Sl.no","Article Code","                Item","HSN Code","Quantity","  Price"));
            System.out.println("                        |-------------------------------------------------------------------------------------------------------------------|");
			int count=0;
		    int sum=0;		    
			
		      
		    for(int i=0;i<p.size();i++) {
		    	String i1="120";
				Random r = new Random();
			      int randomNumber = r.nextInt(5000000);
			      int randomNumber1 =r.nextInt(500000);
		    	int pr=(int) p.get(i);
		    	int qt=(int) qty.get(i);
		    	double total=pr*qt;
		    System.out.println(String.format("%25s %-10s| %-18s| %-20s %-20s| %-10s| %-10s| %-15s| ","|",(i+1),(i1+randomNumber),n.get(i),co.get(i),randomNumber1,qty.get(i),total));	 
    	    System.out.println("                        |-------------------------------------------------------------------------------------------------------------------|");
	    	 sum=sum+p.get(i);
		       count++;
		    }
		    
		       double tax=sum*0.18;
		       DecimalFormat df = new DecimalFormat("#.##");
		       df.setRoundingMode(RoundingMode.FLOOR);
		       double tax1 = new Double(df.format(tax));
		       double total=sum+tax1;
			   tp=Math.round(total);
			    System.out.printf("%25s %-15s %-52s %-27s| %-15s|\n","|","Number Of Items=",count,"Net-Amount(INR)   ",(double)sum);
			    System.out.printf("%25s %-68s %-11s| %-15s|\n","|"," ","Tax%(SGST+CGST+CESS)--18%   ",tax1);
			    System.out.println("                        |-------------------------------------------------------------------------------------------------------------------|");
		        System.out.printf("%25s %-69s %-27s| %-15s|\n","|"," ","Total-Amount(INR)   ",total);
			    System.out.println("                        |-------------------------------------------------------------------------------------------------------------------|");
		        System.out.printf("%25s %-69s %-27s| %-15s|\n","|"," ","Total-PayableAmount(INR)   ",tp);
			    System.out.println("                         -------------------------------------------------------------------------------------------------------------------");
		     
		        System.out.println("                        |Authorised Signature                                                                                               |");
		        System.out.println("                        |Declaration                                                                                                        |");
		        System.out.println("                        |-The goods sold as part of info Shipment are intended for end user Consumption and not for any other Purpose       |");
		        System.out.println("                        |-Any product can be exchanged/returned within 14 days from the date of purchase and while exchanging and returning |");
		        System.out.println("                        |there should be no damage and neither should be used.TERMS AND CONDITIONS APPLY...                                 |");
		        System.out.println("                        |___________________________________________________________________________________________________________________|");
		        System.out.println("                        |Regd.Address                                                                                                       |");
		        System.out.println("                        |Shopping-Houz Products & Service Pvt.Ltd,No.26/3 1st floor A BLock                                                 |");
		        System.out.println("                        |80 Feet Road,Industrial Suburbs,Koramangala,Bangalore-560034,Karnataka-India                                       |");
		        System.out.println("                        |CIN No:U62600CA2020ETC100306                                                                                       |");

		        System.out.println("                        |If u have any queries feel free to call us on -(1800-258-134)/ShopHouz App/www.shophouz.in                         |");
		        System.out.println("                        |___________________________________________________________________________________________________________________|");
        
        payment(tp);
        Exit.exit();
        
        }
	
		
	}catch(Exception e) {
		System.out.println("\n");
	    bill();
	}
	
}
private static void payment(double tp1) {
	ArrayList b=new ArrayList();
	try {
	System.out.println("Select your payment mode");
	System.out.println("1.Debit/Credit Card"+"\n"+"2.Cash on Delivery"+"\n"+"3.Paytm/Phonepe/Gpay(Wallets)");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("\n");
		System.out.println("Enter your debit card 12digit number");
		String d=sc.next();
		if(d.length()==12) {
			b.add(d);
		}
		else {
			System.out.println("enterd number is >/< 12 digits");
			payment(tp);
		}
		
		System.out.println("Enter validity of month and year on card separated by "+"/");
		String m=sc.next();
		System.out.println("Enter 3 digit CVV number");
		int c=sc.nextInt();
		System.out.println("Enter your 10 digit mobile number to recieve OTP");
		long p=sc.nextLong();
		System.out.println("Enter 6 didgit OTP recieved");
		long o=sc.nextLong();
		System.out.println("TRANSCATION SUCCESSFULL of amount Rs."+tp1);
		break;
	case 2:
		System.out.println("Cash to be paid is Rs."+tp1);
	    break;
	case 3:
		System.out.println("Amount to be paid is Rs."+tp1);
	    System.out.println("Enter the phonenumber associated with wallet");
       long p1=sc.nextLong();
	   System.out.println("Transaction Successful!!!");
		break;
		default:System.err.println("Enter your correct choice");
		payment(tp);
	}
	}catch(Exception e) {
	System.err.println("Enter your correct choice");
	payment(tp);
	}
		
		
	}
}






