import java.util.Scanner;

public class Telivisions {

public static void telivisions() {
	String oinfo="138.8 cm (55 inches) Q1 Series 4K Certified Android QLED TV 55Q1IN-1(Without Stand)"; 
	String linfo="108 cm (43 inches) 4K UHD Smart LED TV 43UM7290PTF (2019 Model)" ;
	String soinfo="80 cm (32 inches) HD Ready LED TV KLV-32R202G  ";
	String sinfo="138 cm (55 Inches) Super 6 Series 4K UHD LED Smart TV UA55NU6100 (2019 model)"; 

	int sp=49999;    String samsung="Samsung";         String black="Shiny Black";
	int op=69899;    String oneplus="OnePlus";        
	int lp=35999;    String lg="LG";                   
	int sop=17999;    String sony="Sony";	
	
	System.out.println("1."+samsung+"("+sinfo+")"+"-"+sp+"/-");
	System.out.println("2."+oneplus+"("+oinfo+")"+"-"+op+"/-");
	System.out.println("3."+lg+"("+linfo+")"+"-"+lp+"/-");
	System.out.println("4."+sony+"("+soinfo+")"+"-"+sop+"/-");
	Scanner sc=new Scanner(System.in);
	
	try {
	System.out.println("\n"+"select your choice");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:Cart.addcart(sp,samsung,black);
	break;
	
	case 2:Cart.addcart(op,oneplus,black);
    break;
	
	case 3:Cart.addcart(lp,lg,black);
    break;	
	
	case 4:Cart.addcart(sop,sony,black);
	break;
	
	default:System.err.println("Enter a correct choice");
	    telivisions();
	
	}
	}catch(Exception e) {
		System.err.println("Choose a correct number");
		telivisions();
	}
}
}
