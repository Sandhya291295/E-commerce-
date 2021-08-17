import java.util.Scanner;

public class Cameras {

public static void cameras() {
	String cinfo="Canon EOS 1500D 24.1 Digital SLR Camera with EF S18-55 is II Lens, 16GB Card and Carry Case "; 
	String qinfo="Qubo Smart Indoor Camera - AI Enabled Wi-Fi Home Security Camera | Alexa Built-In Speaker | Smart Home Hub | HCI01A " ;
	String linfo="Leica 19106 Sofort Instant Film Camera ";
	String soinfo="Sony HDRCX405 9.2MP HD Handycam Camcorder with Free Carrying Case"; 

	int cp=25990;    String canon="Canon";         String black="Shiny Black";
	int qp=12990;    String qubo="Qubo";        
	int lp=18377;    String leica="Leica";                   
	int sop=15790;    String sony="Sony";	
	
	System.out.println("1."+canon+"("+cinfo+")"+"-"+cp+"/-");
	System.out.println("2."+qubo+"("+qinfo+")"+"-"+qp+"/-");
	System.out.println("3."+leica+"("+linfo+")"+"-"+lp+"/-");
	System.out.println("4."+sony+"("+soinfo+")"+"-"+sop+"/-");
	Scanner sc=new Scanner(System.in);
	
	try {
	System.out.println("\n"+"select your choice by brands");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:	Cart.addcart(cp,canon,black);
	break;
	
	case 2:Cart.addcart(qp,qubo,black);
    break;
	
	case 3:Cart.addcart(lp,leica,black);
    break;	
	
	case 4:Cart.addcart(sop,sony,black);
	break;
	
	default:System.err.println("Enter a correct choice");
	    cameras();
	
	}
	}catch(Exception e) {
		System.err.println("Choose a correct number");
		cameras();
	}
}
}


