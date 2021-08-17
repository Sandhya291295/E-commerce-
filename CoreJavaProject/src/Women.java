import java.util.Scanner;

public class Women {
	static Scanner sc=new Scanner(System.in);
public static void women() {
	
	System.out.println("\n"+">>WOMEN'S FASHION<<");
	System.out.println("1.WESTERN WEAR");
	System.out.println("2.ETHNIC WEAR");
	System.out.println("3.SPORTS WEAR");
	System.out.println("4.FOOT WEAR");
	System.out.println("5.JEANS");
	System.out.println("6.BACK"  );
	System.out.println("7.HOMEPAGE"  );
	System.out.println("Select your choice");
	int choice=sc.nextInt();
	try {
	switch(choice) {
	case 1:western();
	break;
	case 2:ethnic();
	break;
	case 3:sportswear();
	break;
	case 4:footwear();
	break;
	case 5:jeans();
	break;
	case 6:Categories.category();
	break;
	case 7:HomePage.home();
	break;
	default:System.err.println("select correct choice");
	}
	}catch(Exception e) {
		System.err.println("select correct choice");
		
	}
	}

private static void western() {
	int p1=750;    String puma="Tops(LEVIS)";           	  String black="Rich Black";
	int p2=1150;    String polo="Skirts(LEE)";                String white="Dark Brown";
	int p3=1200;    String scott="Dresses(VEROMODA)";          String grey="Bride Red";
	int p4=599;    String lee="T-shirts(OLIVE)";		  String blue="Nebula blue";
	
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Dark Brown");
		System.out.println(    "3.Bride Red");
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
		System.out.println(    "2.Dark Brown");
		System.out.println(    "3.Bride Red");
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
		System.out.println(    "2.Dark Brown");
		System.out.println(    "3.Bride Red");
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
		System.out.println(    "2.Dark Brown");
		System.out.println(    "3.Bride Red");
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
		western();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			western();
		}		
}

private static void footwear() {
	int p1=1200;    String puma="SportsShoes(PUMA) ";           	       String black="Rich Black";
	int p2=1150;    String polo="FormalShoes(NIKE)";                      String white="Dark Brown";
	int p3=750;    String scott="Loafers(BATA)";                           String grey="Aura Grey";
	int p4=599;    String lee="Sandals(WOODLAND)";			               String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Dark Brown");
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
		System.out.println(    "2.Dark Brown");
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
		System.out.println(    "2.Dark Brown");
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
		System.out.println(    "2.Dark Brown");
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
		footwear();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			footwear();
		}		
}


private static void sportswear() {
	int p1=1200;    String puma="TrackPants(CLOUD) ";     String black="Rich Black";
	int p2=780;    String polo="SweatShirts(PUMA)";           String white="Dark Brown";
	int p3=650;    String scott="Tshirt(DECATHLON)";         String grey="Aura Grey";
	int p4=1599;    String lee="Shorts(CUPID)";			      String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
	
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Dark Brown");
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
		System.out.println(    "2.Dark Brown");
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
		System.out.println(    "2.Dark Brown");
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
		System.out.println(    "2.Dark Brown");
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
		sportswear();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			sportswear();
		}
	
}

private static void ethnic() {
	int p1=1200;    String puma="Sarees(SOCH)";                String black="Rich Black";
	int p2=2500;    String polo="Kurthis(BIBA)";     String white="Pearl white";
	int p3=6500;    String scott="SalwarSuits(LIBAS)";        String grey="Aura Maroon";
	int p4=1999;    String lee="LehengaCholi(RANG)";	   String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.Rich Black");
		System.out.println(    "2.Pearl white");
		System.out.println(    "3.Aura Maroon");
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
		System.out.println(    "3.Aura Maroon");
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
		System.out.println(    "3.Aura Maroon");
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
		System.out.println(    "3.Aura Maroon");
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
		ethnic();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			ethnic();
		}
   
   
}

private static void jeans() {
	int p1=1200;    String puma="Skinny(LEVIS)";          String black="Rich Black";
	int p2=1199;     String polo="Slim fit(LEE)";                String white="Pearl white";
	int p3=999;     String scott="Regular(PEPE JEANS)";   String grey="Aura Grey";
	int p4=1599;    String lee="Joggers(WRANGLER)";			    String blue="Nebula blue";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
  
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
		    jeans();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			jeans();
		}
   
   
	
}

}


