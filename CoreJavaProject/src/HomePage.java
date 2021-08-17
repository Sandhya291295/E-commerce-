import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomePage {
	
public static void main(String[] args) throws InterruptedException {
	for(int i=1;i<=5;i++) {
		for(int k=5;k>=i;k--) {
			System.out.print(" "+"+ + + + + + + +");
			Thread.sleep(100);
		}
		for(int j=1;j<2*i;j++) {
			System.out.print(" "+"               ");
			Thread.sleep(100);
		}
		for(int k=5;k>=i;k--) {
			System.out.print(" "+"+ + + + + + + +");
			Thread.sleep(100);
		}
		System.out.println(" ");
	}
	
System.out.println("                                                ____          ____   ____                           ____           ____   ____                                    ");
System.out.println("                                               |____  |____| |    | |____|    ______        |____| |    | |    |  |____  |____                                    ");
System.out.println("                                               _____| |    | |____| |                       |    | |____| |____|  _____| |____                                    ");

	for(int i=1;i<=5;i++) {
		for(int k=1;k<=i;k++) {
			System.out.print(" "+"+ + + + + + + +");
			Thread.sleep(100);
		}
		for(int j=10;j>=2*i;j--) {
			System.out.print(" "+"               ");
			Thread.sleep(100);
		}
		for(int k=1;k<=i;k++) {
			System.out.print(" "+"+ + + + + + + +");
			Thread.sleep(100);
		}
		System.out.println(" ");
	}

	Scanner sc=new Scanner(System.in);
	System.out.println("\n"+"\n"+"\n");
	String s="WELCOME TO SHOP-HOUSE";
	System.out.print("                -----------------------------------------            ");
	for(int i=0;i<s.length();i++) {
		System.out.print(" "+s.charAt(i));
		Thread.sleep(200);	}
	System.out.print("            -----------------------------------------            ");
	
	System.out.println("\n"+"\n");
	Date date=new Date();
	SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy");
	String format = sf.format(date);
	Date date1=new Date();
	SimpleDateFormat sf1=new SimpleDateFormat("hh:mm:ss");
	String format1 = sf1.format(date1);
 

	System.out.println("\n");
	System.out.println("                                    *********************                                                                                 ********************");
	System.out.print("                                    ");
	for(int i=0;i<format.length();i++) {
		System.out.print(String.format("%2s",format.charAt(i)));
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	System.out.print("                                                                                  ");
	for(int i=0;i<format1.length();i++) {
		System.out.print(String.format("%2s",format1.charAt(i)));
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
//	System.out.println("\n");
	System.out.print("\n");
	System.out.println("                                    *********************                                                                                 ********************");	
	System.out.println("\n"+"\n");
	System.out.println("                                                      We have have all kind of varieties,brands and different products all around the world ");
	System.out.println("                                                         >Fashion ,");
	System.out.println("                                                                   >Kids ,");
	System.out.println("                                                                          >Books ,                ");
	System.out.println("                                                                                  >Electronics," );
	System.out.println("                                                                                            >Jewellery,");
	System.out.println("                                                                                                       >Crafts and Antiques etc.....");
	System.out.println("\n"+"                                       To be our Customer ----> PLEASE ENTER YOUR NAME AND PROCEED");
	
	String name=sc.next().toUpperCase();
	Cart.name(name);
	HomePage h=new HomePage();
			
	System.out.print("\n"+"Please Wait");
	for(int i=1;i<=5;i++) {
		System.out.print("  * * ");
		Thread.sleep(500);
	}

            System.out.println("\n");
            System.out.print("Hello   ");
            for(int i=0;i<name.length();i++) {
            	System.out.print(name.charAt(i)+" ");
            	Thread.sleep(500);
            }
            System.out.print("              , Enjoy Your Shopping"+"\n"+"\n");
            
	home();
	
}

    public static void home() {
    	Scanner sc=new Scanner(System.in);
	
	System.out.println(             "1.HOME"  );
	System.out.println(             "2.SHOP BY ALL CATEGORIES"  );
	System.out.println(             "3.YOUR ORDERS"  );
	System.out.println(             "4.YOUR BILL"  );
	System.out.println(             "5.EXIT"  );
	try {
	System.out.println("\n"+"select your choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1: home();
	       break;
	
	case 2:Categories.category();
	       break;
	
	case 3:Cart.viewcart();
	       break;
	       
	case 4:Cart.bill();
	       break;
	       
	case 5:Exit.exit();
break;	
		   
    default:System.err.println("Enter the correct choice");
            home();
	}
	}catch(Exception e) {
		System.err.println("choose a correct number");
		home();
	}
}
}

