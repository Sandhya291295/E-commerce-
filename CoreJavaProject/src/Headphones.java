import java.util.Scanner;

public class Headphones {

public static void headphones() {

	String jinfo="JBL C200SI Super Deep Bass in-Ear Headphones with Mic "; 
	String binfo="boAt Rockerz 450 Wireless Bluetooth Headphone" ;
	String soinfo="Sony Extra Bass MDR-XB450AP On-Ear Headphones with Mic ";
	String ainfo="AMZ Rockerz 510 Wireless Bluetooth Headphones "; 

	int jp=749;    String jbl="JBL";         String black="Shiny Black";
	int bp=1499;    String boat="boAt";        
	int sop=2000;    String sony="Sony";                   
	int ap=1899;    String amz="AMZ";	
	
	System.out.println("1."+jbl+"("+jinfo+")"+"-"+jp+"/-");
	System.out.println("2."+boat+"("+binfo+")"+"-"+bp+"/-");
	System.out.println("3."+sony+"("+soinfo+")"+"-"+sop+"/-");
	System.out.println("4."+amz+"("+ainfo+")"+"-"+ap+"/-");
	Scanner sc=new Scanner(System.in);
	
	try {
	System.out.println("\n"+"select your choice");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:Cart.addcart(jp,jbl,black);
	break;
	
	case 2:Cart.addcart(bp,boat,black);
    break;
	
	case 3:Cart.addcart(sop,sony,black);
    break;	
	
	case 4:Cart.addcart(ap,amz,black);
	break;
	
	default:System.err.println("Enter a correct choice");
	    headphones();
	
	}
	}catch(Exception e) {
		System.err.println("Choose a correct number");
		headphones();
	}
}
}
