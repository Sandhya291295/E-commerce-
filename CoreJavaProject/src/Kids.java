import java.util.Scanner;

public class Kids {
	static Scanner sc=new Scanner(System.in);
    public static void kids() {
	System.out.println("\n"+">>KID'S SECTION<<");
	System.out.println("1.BOY'S CLOTHING");
	System.out.println("2.GIRL'S CLOTHING");
	System.out.println("3.BABY PRODUCTS");
	System.out.println("4.KID'S TOYS");
	System.out.println("5.KID'S SHOES");
	System.out.println("6.BACK"  );
	System.out.println("7.HOMEPAGE"  );
	System.out.println("Select your choice");
	int choice=sc.nextInt();
	try {
	switch(choice) {
	case 1:boy();
	break;
	case 2:girl();
	break;
	case 3:baby();
	break;
	case 4:toy();
	break;
	case 5:foot();
	break;
	case 6:Categories.category();
	break;
	case 7:HomePage.home();
	break;
	default:System.err.println("select correct choice");
	kids();
	}
	}catch(Exception e) {
		System.err.println("select correct choice");
		kids();
	}
	}


private static void boy() {
	int p1=400;     String puma="Tshirt(PUMA) ";           	  String black="Rich Black";
	int p2=580;     String polo="Shirt(AWG)";                 String white="Pearl white";
	int p3=650;     String scott="Jeans(SCOTT)";              String grey="Aura Grey";
	int p4=1599;    String lee="Etnic wear(BIBA)";			  String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
//   System.out.println("Select your choice");
   try {
		System.out.println("\n"+"select your choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(p1,puma,black);
		break;
		case 2:Cart.addcart(p1,puma,white);
		break;
		case 3:Cart.addcart(p1,puma,grey);
		break;
		case 4:Cart.addcart(p1,puma,blue);
		break;
		
		}
		break;
		
		case 2:  System.out.println("2. "+polo+"-"+p2+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color1=sc.nextInt();
		switch(color1) {
		case 1:Cart.addcart(p2,polo,black);
		break;
		case 2:Cart.addcart(p2,polo,white);
		break;
		case 3:Cart.addcart(p2,polo,grey);
		break;
		case 4:Cart.addcart(p2,polo,blue);
		break;
		
		}
		break;
		
		case 3:	    System.out.println("3. "+scott+"-"+p3+"/-");
    System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color2=sc.nextInt();
		switch(color2) {
		case 1:Cart.addcart(p3,scott,black);
		break;
		case 2:Cart.addcart(p3,scott,white);
		break;
		case 3:Cart.addcart(p3,scott,grey);
		break;
		case 4:Cart.addcart(p3,scott,blue);
		break;
		
		}
		break;	
		
		case 4: System.out.println("4. "+lee+"-"+p4+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color3=sc.nextInt();
		switch(color3) {
		case 1:Cart.addcart(p4,lee,black);
		break;
		case 2:Cart.addcart(p4,lee,white);
		break;
		case 3:Cart.addcart(p4,lee,grey);
		break;
		case 4:Cart.addcart(p4,lee,blue);
		break;
		}
		break;
		
		default:System.err.println("Enter a correct choice");
		    boy();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			boy();
		}
   
   
}

private static void girl() {
	int p1=1200;    String puma="Dresses(PUMA) ";              String black="Rich Black";
	int p2=880;     String polo="Jumpsuits(AWG)";              String white="Pearl white";
	int p3=1500;    String scott="Jeans-Tshirt(SCOTT)";        String grey="Aura Grey";
	int p4=1599;    String lee="Ethnicwear(BIBA)";			   String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
//		System.out.println("\n"+"select your choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(p1,puma,black);
		break;
		case 2:Cart.addcart(p1,puma,white);
		break;
		case 3:Cart.addcart(p1,puma,grey);
		break;
		case 4:Cart.addcart(p1,puma,blue);
		break;
		
		}
		break;
		
		case 2:  System.out.println("2. "+polo+"-"+p2+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color1=sc.nextInt();
		switch(color1) {
		case 1:Cart.addcart(p2,polo,black);
		break;
		case 2:Cart.addcart(p2,polo,white);
		break;
		case 3:Cart.addcart(p2,polo,grey);
		break;
		case 4:Cart.addcart(p2,polo,blue);
		break;
		
		}
		break;
		
		case 3:	    System.out.println("3. "+scott+"-"+p3+"/-");
    System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color2=sc.nextInt();
		switch(color2) {
		case 1:Cart.addcart(p3,scott,black);
		break;
		case 2:Cart.addcart(p3,scott,white);
		break;
		case 3:Cart.addcart(p3,scott,grey);
		break;
		case 4:Cart.addcart(p3,scott,blue);
		break;
		
		}
		break;	
		
		case 4: System.out.println("4. "+lee+"-"+p4+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color3=sc.nextInt();
		switch(color3) {
		case 1:Cart.addcart(p4,lee,black);
		break;
		case 2:Cart.addcart(p4,lee,white);
		break;
		case 3:Cart.addcart(p4,lee,grey);
		break;
		case 4:Cart.addcart(p4,lee,blue);
		break;
		}
		break;
		
		default:System.err.println("Enter a correct choice");
		    girl();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			girl();
		}
   
   
}

private static void baby() {
	int p1=1200;    String puma="Baby Lotion ";           	     String black="MAMA EARTH";
	int p2=780;    String polo="Diaper Pants";                      String white="PAMPERS";
	int p3=650;    String scott="Baby Care";                       String grey="HIMALAYA";
	int p4=1599;    String lee="Bath Essentials";			             String blue="DOVE";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.MAMA EARTH");
		System.out.println(    "2.PAMPERS");
		System.out.println(    "3.HIMALAYA");
		System.out.println(    "4.DOVE");
		System.out.println("Choose your brand");
	    int color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(p1,puma,black);
		break;
		case 2:Cart.addcart(p1,puma,white);
		break;
		case 3:Cart.addcart(p1,puma,grey);
		break;
		case 4:Cart.addcart(p1,puma,blue);
		break;
		
		}
		break;
		
		case 2:  System.out.println("2. "+polo+"-"+p2+"/-");
		System.out.println(    "1.MAMA EARTH");
		System.out.println(    "2.PAMPERS");
		System.out.println(    "3.HIMALAYA");
		System.out.println(    "4.DOVE");
		System.out.println("Choose your brand");
	    int color1=sc.nextInt();
		switch(color1) {
		case 1:Cart.addcart(p2,polo,black);
		break;
		case 2:Cart.addcart(p2,polo,white);
		break;
		case 3:Cart.addcart(p2,polo,grey);
		break;
		case 4:Cart.addcart(p2,polo,blue);
		break;
		
		}
		break;
		
		case 3:	    System.out.println("3. "+scott+"-"+p3+"/-");
		System.out.println(    "1.MAMA EARTH");
		System.out.println(    "2.PAMPERS");
		System.out.println(    "3.HIMALAYA");
		System.out.println(    "4.DOVE");
		System.out.println("Choose your brand");
	    int color2=sc.nextInt();
		switch(color2) {
		case 1:Cart.addcart(p3,scott,black);
		break;
		case 2:Cart.addcart(p3,scott,white);
		break;
		case 3:Cart.addcart(p3,scott,grey);
		break;
		case 4:Cart.addcart(p3,scott,blue);
		break;
		
		}
		break;	
		
		case 4: System.out.println("4. "+lee+"-"+p4+"/-");
		System.out.println(    "1.MAMA EARTH");
		System.out.println(    "2.PAMPERS");
		System.out.println(    "3.HIMALAYA");
		System.out.println(    "4.DOVE");
		System.out.println("Choose your brand");
	    int color3=sc.nextInt();
		switch(color3) {
		case 1:Cart.addcart(p4,lee,black);
		break;
		case 2:Cart.addcart(p4,lee,white);
		break;
		case 3:Cart.addcart(p4,lee,grey);
		break;
		case 4:Cart.addcart(p4,lee,blue);
		break;
		}
		break;
		
		default:System.err.println("Enter a correct choice");
		    baby();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			baby();
		}
   
   
	
}

private static void toy() {
	int p1=1200;    String puma="REMOTECONTROL";    String black="Rich Black";
	int p2=780;     String polo="BUILDINGKITS";              String white="Pearl white";
	int p3=550;     String scott="PUZZLES";         String grey="Aura Grey";
	int p4=599;    String lee="TODDLER TOYS";			      String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("Select your choice");
   try {
		System.out.println("\n"+"select your choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(p1,puma,black);
		break;
		case 2:Cart.addcart(p1,puma,white);
		break;
		case 3:Cart.addcart(p1,puma,grey);
		break;
		case 4:Cart.addcart(p1,puma,blue);
		break;
		
		}
		break;
		
		case 2:  System.out.println("2. "+polo+"-"+p2+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color1=sc.nextInt();
		switch(color1) {
		case 1:Cart.addcart(p2,polo,black);
		break;
		case 2:Cart.addcart(p2,polo,white);
		break;
		case 3:Cart.addcart(p2,polo,grey);
		break;
		case 4:Cart.addcart(p2,polo,blue);
		break;
		
		}
		break;
		
		case 3:	    System.out.println("3. "+scott+"-"+p3+"/-");
    System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color2=sc.nextInt();
		switch(color2) {
		case 1:Cart.addcart(p3,scott,black);
		break;
		case 2:Cart.addcart(p3,scott,white);
		break;
		case 3:Cart.addcart(p3,scott,grey);
		break;
		case 4:Cart.addcart(p3,scott,blue);
		break;
		
		}
		break;	
		
		case 4: System.out.println("4. "+lee+"-"+p4+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color3=sc.nextInt();
		switch(color3) {
		case 1:Cart.addcart(p4,lee,black);
		break;
		case 2:Cart.addcart(p4,lee,white);
		break;
		case 3:Cart.addcart(p4,lee,grey);
		break;
		case 4:Cart.addcart(p4,lee,blue);
		break;
		}
		break;
		
		default:System.err.println("Enter a correct choice");
		    toy();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			toy();
		}
   
   
	
}

private static void foot() {
	int p1=1200;    String puma="Sneakers(PUMA) ";           	   String black="Rich Black";
	int p2=780;     String polo="Sandals(NIKE)";                   String white="Pearl white";
	int p3=650;     String scott="Shoes(DISNEY)";                  String grey="Aura Grey";
	int p4=1599;    String lee="FLIP FLOPS(SKETCHERS)";			   String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("Select your choice");
   try {
		System.out.println("\n"+"select your choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color=sc.nextInt();
		switch(color) {
		case 1:Cart.addcart(p1,puma,black);
		break;
		case 2:Cart.addcart(p1,puma,white);
		break;
		case 3:Cart.addcart(p1,puma,grey);
		break;
		case 4:Cart.addcart(p1,puma,blue);
		break;
		
		}
		break;
		
		case 2:  System.out.println("2. "+polo+"-"+p2+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color1=sc.nextInt();
		switch(color1) {
		case 1:Cart.addcart(p2,polo,black);
		break;
		case 2:Cart.addcart(p2,polo,white);
		break;
		case 3:Cart.addcart(p2,polo,grey);
		break;
		case 4:Cart.addcart(p2,polo,blue);
		break;
		
		}
		break;
		
		case 3:	    System.out.println("3. "+scott+"-"+p3+"/-");
    System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color2=sc.nextInt();
		switch(color2) {
		case 1:Cart.addcart(p3,scott,black);
		break;
		case 2:Cart.addcart(p3,scott,white);
		break;
		case 3:Cart.addcart(p3,scott,grey);
		break;
		case 4:Cart.addcart(p3,scott,blue);
		break;
		
		}
		break;	
		
		case 4: System.out.println("4. "+lee+"-"+p4+"/-");
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Grey");
		System.out.println(    "4.Nebula Blue");
		System.out.println("Choose a color");
	    int color3=sc.nextInt();
		switch(color3) {
		case 1:Cart.addcart(p4,lee,black);
		break;
		case 2:Cart.addcart(p4,lee,white);
		break;
		case 3:Cart.addcart(p4,lee,grey);
		break;
		case 4:Cart.addcart(p4,lee,blue);
		break;
		}
		break;
		
		default:System.err.println("Enter a correct choice");
		    foot();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			foot();
		}
   
   
}

	
}
