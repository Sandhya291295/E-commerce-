import java.util.Scanner;

public class Mens {
	static Scanner sc=new Scanner(System.in);
	
	public static void mens() {
		System.out.println("\n"+">>MEN'S FASHION<<");
		System.out.println("1.T-SHIRTS");
		System.out.println("2.SHIRTS");
		System.out.println("3.TROUSERS");
		System.out.println("4.JEANS");
		System.out.println("5.ETHNIC WEAR");
		System.out.println("6.FOOTWEAR");
		System.out.println("7.SPORTSWEAR");
		System.out.println("8.BACK"  );
		System.out.println("9.HOMEPAGE"  );
		System.out.println("Select your choice");
		int choice=sc.nextInt();
		try {
		switch(choice) {
		case 1:tshirts();
		break;
		case 2:shirts();
		break;
		case 3:trousers();
		break;
		case 4:jeans();
		break;
		case 5:ethnic();
		break;
		case 6:footwear();
		break;
		case 7:sportswear();
		break;
		case 8:Categories.category();
		break;
		case 9:HomePage.home();
		break;
		default:System.err.println("select correct choice");
		mens();
		}
		}catch(Exception e) {
			System.err.println("select correct choice");
			mens();	
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
     
       try {
   		System.out.println("\n"+"select your choice");
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
		int p3=650;    String scott="T-shirt(DECATHLON)";         String grey="Aura Grey";
		int p4=1599;    String lee="Shorts(CUPID)";			      String blue="Nebula blue";
			
       System.out.println("1. "+puma+"-"+p1+"/-");
       System.out.println("2. "+polo+"-"+p2+"/-");
       System.out.println("3. "+scott+"-"+p3+"/-");
       System.out.println("4. "+lee+"-"+p4+"/-");
//       System.out.println("Select your choice");
       try {
   		System.out.println("\n"+"select your choice");
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


	private static void tshirts() {
		int p1=1200;    String puma="Tshirt(PUMA) ";           	       String black="Rich Black";
		int p2=780;    String polo="Polo(AWG)";                          String white="Pearl white";
		int p3=650;    String scott="Sleeveless(SCOTT)";          String grey="Aura Grey";
		int p4=1599;    String lee="LongSleeves(LEE)";			   String blue="Nebula blue";
			
       System.out.println("1. "+puma+"-"+p1+"/-");
       System.out.println("2. "+polo+"-"+p2+"/-");
       System.out.println("3. "+scott+"-"+p3+"/-");
       System.out.println("4. "+lee+"-"+p4+"/-");
//       System.out.println("Select your choice");
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
   		    tshirts();
   		
   		}
   		}catch(Exception e) {
   			System.err.println("Choose a correct number");
   			tshirts();
   		}
       
       
	}

	private static void ethnic() {
		int p1=1200;    String puma="Kurtha(VON-HUETTE)";       String black="Rich Black";
		int p2=2500;    String polo="KurthaSets(U-TURN)";     String white="Pearl white";
		int p3=6500;    String scott="Sherwani(MAHARAJA)";      String grey="Aura Maroon";
		int p4=1999;    String lee="Dhotis(ROYAL)";			   String blue="Nebula blue";
			
       System.out.println("1. "+puma+"-"+p1+"/-");
       System.out.println("2. "+polo+"-"+p2+"/-");
       System.out.println("3. "+scott+"-"+p3+"/-");
       System.out.println("4. "+lee+"-"+p4+"/-");
//       System.out.println("Select your choice");
       try {
   		System.out.println("\n"+"select your choice");
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
		int p2=1199;     String polo="Slimfit(LEE)";                String white="Pearl white";
		int p3=999;     String scott="Regular(PEPE JEANS)";   String grey="Aura Grey";
		int p4=1599;    String lee="Joggers(WRANGLER)";			    String blue="Nebula blue";
			
       System.out.println("1. "+puma+"-"+p1+"/-");
       System.out.println("2. "+polo+"-"+p2+"/-");
       System.out.println("3. "+scott+"-"+p3+"/-");
       System.out.println("4. "+lee+"-"+p4+"/-");
//       System.out.println("Select your choice");
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

	private static void shirts() {
		
		System.out.println("1.CASUAL SHIRTS");
		System.out.println("2.FORMAL SHIRTS");
		System.out.println("Select your choice");
		int choice=sc.nextInt();
		try {
		switch(choice) {
		case 1:{
			int p1=999;    String puma="RoundCollar(ARROW) ";          String black="Rich Black";
			int p2=899;    String polo="WingCollar(PETER)";      String white="Pearl white";
			int p3=750;    String scott="CLassic(VANHUESSEN)";           String grey="Aura Maroon";
			int p4=800;    String lee="ButtonDown(USPOLO)";			 String blue="Nebula blue";
			
			
	       System.out.println("1. "+puma+"-"+p1+"/-");
	       System.out.println("2. "+polo+"-"+p2+"/-");
	       System.out.println("3. "+scott+"-"+p3+"/-");
	       System.out.println("4. "+lee+"-"+p4+"/-");
	       System.out.println("Select your choice");
	       try {
	   		System.out.println("\n"+"select your choice");
	   		int choice1=sc.nextInt();
	   		switch(choice1) {
	   		
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
	   		    shirts();
	   		
	   		}
	   		}catch(Exception e) {
	   			System.err.println("Choose a correct number");
	   			shirts();
	   		}
		}
		break;
		
		case 2:{
			int p1=999;    String puma="RoundCollar(ARROW) ";          String black="Rich Black";
			int p2=899;    String polo="WingCollar(PETER)";      String white="Pearl white";
			int p3=750;    String scott="CLassic(VANHUESSEN)";           String grey="Aura Maroon";
			int p4=800;    String lee="ButtonDown(USPOLO)";			 String blue="Nebula blue";
			
			
	       System.out.println("1. "+puma+"-"+p1+"/-");
	       System.out.println("2. "+polo+"-"+p2+"/-");
	       System.out.println("3. "+scott+"-"+p3+"/-");
	       System.out.println("4. "+lee+"-"+p4+"/-");
	       System.out.println("Select your choice");
	       try {
	   		System.out.println("\n"+"select your choice");
	   		int choice1=sc.nextInt();
	   		switch(choice1) {
	   		
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
	   		    shirts();
	   		
	   		}
	   		}catch(Exception e) {
	   			System.err.println("Choose a correct number");
	   			shirts();
	   		}
		}
		break;
		
		default:System.err.println("Enter a correct choice");
		shirts();
       
		}
		}catch(Exception e) {
   			System.err.println("Choose a correct number");
   			shirts();
		}
       
		
	}

	private static void trousers() {
		int p1=1200;    String puma="Chinos(LEVIS) ";           	       String black="Rich Black";
		int p2=780;    String polo="Formal(PETERENGLAND)";        String white="Dark Brown";
		int p3=650;    String scott="Casual(BLACKBERRY)";         String grey="Aura Grey";
		int p4=1599;    String lee="Denim(US POLO)";			           String blue="Nebula blue";
			
       System.out.println("1. "+puma+"-"+p1+"/-");
       System.out.println("2. "+polo+"-"+p2+"/-");
       System.out.println("3. "+scott+"-"+p3+"/-");
       System.out.println("4. "+lee+"-"+p4+"/-");
//       System.out.println("Select your choice");
       try {
   		System.out.println("\n"+"select your choice");
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
   		    trousers();
   		
   		}
   		}catch(Exception e) {
   			System.err.println("Choose a correct number");
   			trousers();
   		}
       
       
	}

		
	}

