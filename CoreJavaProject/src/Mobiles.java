import java.util.Scanner;

public class Mobiles {
	public static void mobiles() {
		int sp=69999;    String samsung="Samsung Galaxy";  String sinfo=" 8GB RAM, Schott display, 256GB Storage, 4200mAH Battery"; 	  String black="Shiny Black";
		int op=53999;    String oneplus="OnePlus Pro";          String oinfo=" 8GB RAM, Fluid AMOLED Display, 256GB Storage, 4085mAH Battery"; String white="Pearl white";
		int vp=22990;    String vivo="Vivo 17";                    String vinfo=" 8GB RAM,Transclucent display, 128GB Storage, 4200mAH Battery";  String golden="Aura Golden";
		int rp=13999;    String redmi="Redmi Note 8";			   String rinfo=" 6GB RAM, Transparent display, 64GB Storage, 3560mAH Battery";   String purple="Nebula Purple";
		System.out.println("1."+samsung+"("+sinfo+")"+"-"+sp+"/-");
		System.out.println("2."+oneplus+"("+oinfo+")"+"-"+op+"/-");
		System.out.println("3."+vivo+"("+vinfo+")"+"-"+vp+"/-");
		System.out.println("4."+redmi+"("+rinfo+")"+"-"+rp+"/-");
		Scanner sc=new Scanner(System.in);
		int color;
		try {
		System.out.println("\n"+"select your choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	System.out.println("1."+samsung+"("+sinfo+")"+"-"+sp+"/-");
		
		System.out.println(    "1.Shiny BLack");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Golden");
		System.out.println(    "4.Nebula Purple");
		System.out.println("Choose a color");
	    color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(sp,samsung,black);
		break;
		case 2:Cart.addcart(sp,samsung,white);
		break;
		case 3:Cart.addcart(sp,samsung,golden);
		break;
		case 4:Cart.addcart(sp,samsung,purple);
		break;
		
		}
		break;
		
		case 2:System.out.println("2."+oneplus+"("+oinfo+")"+"-"+op+"/-");
		 System.out.println(    "1.Shiny BLack");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Golden");
		System.out.println(    "4.Nebula Purple");
		System.out.println("Choose a color");
		color=sc.nextInt();
		
		switch(color) {
		case 1:Cart.addcart(op,oneplus,black);
		break;
		case 2:Cart.addcart(op,oneplus,white);
		break;
		case 3:Cart.addcart(op,oneplus,golden);
		break;
		case 4:Cart.addcart(op,oneplus,purple);
		break;
		
		}
		break;
		
		case 3:	System.out.println("3."+vivo+"("+vinfo+")"+"-"+vp+"/-");
	     System.out.println(    "1.Shiny BLack");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Golden");
		System.out.println(    "4.Nebula Purple");
		System.out.println("Choose a color");
		color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(vp,vivo,black);
		break;
		case 2:Cart.addcart(vp,vivo,white);
		break;
		case 3:Cart.addcart(vp,vivo,golden);
		break;
		case 4:Cart.addcart(vp,vivo,purple);
		break;
		
		}
		break;	
		
		case 4:	System.out.println("4."+redmi+"("+rinfo+")"+"-"+rp+"/-");
		
		System.out.println(    "1.Shiny BLack");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Golden");
		System.out.println(    "4.Nebula Purple");
		System.out.println("Choose a color");
		color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(rp,redmi,black);
		break;
		case 2:Cart.addcart(rp,redmi,white);
		break;
		case 3:Cart.addcart(rp,redmi,golden);
		break;
		case 4:Cart.addcart(rp,redmi,purple);
		break;
		
		}
		break;
		
		default:System.err.println("Enter a correct choice");
		    mobiles();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			mobiles();
		}
	}
	
//	public static void color() {
//		String black="Shiny Black";
//        String white="Pearl white";
//		 String golden="Aura Golden";
//         String purple="Nebula Purple";
//	
//		Scanner sc=new Scanner(System.in);
//		System.out.println(    "1.Shiny BLack");
//		System.out.println(    "2.Pearl white");
//		System.out.println(    "3.Aura Golden");
//		System.out.println(    "4.Nebula Purple");
//		System.out.println("Choose a color");
//		int color=sc.nextInt();
//		switch(color) {
//		case 1:Cart.addcart(price,name,black);
//		break;
//		case 2:Cart.addcart(price,name,white);
//		break;
//		case 3:Cart.addcart(price,name,golden);
//		break;
//		case 4:Cart.addcart(price,name,purple);
//		break;
//		default:System.out.println("Enter a correct color choice");
//		color(name,price);
//	}
//	}
	

}
