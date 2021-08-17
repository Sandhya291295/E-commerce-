import java.util.Scanner;

public class Kitchen {
	static Scanner sc=new Scanner(System.in);

public static void kitchen() {
	System.out.println("\n"+">>HOME,KITCHEN & FURNITURE<<");
	System.out.println("1.KITCHEN AND DINING");
	System.out.println("2.FURNITURE");
	System.out.println("3.HOME FURNISHING");
	System.out.println("4.HOME DECOR");
	System.out.println("5.BACK"  );
	System.out.println("6.HOMEPAGE"  );
	System.out.println("Select your choice");
	int choice=sc.nextInt();
	try {
	switch(choice) {
	case 1:dining();
	break;
	case 2:fur();
	break;
	case 3:hom();
	break;
	case 4:decor();
	break;
	case 5:Categories.category();
	break;
	case 6:HomePage.home();
	break;
	default:System.err.println("select correct choice");
	kitchen();
	}
	}catch(Exception e) {
		System.err.println("select correct choice");
		kitchen();
	}
}

private static void decor() {
	int p1=400;     String puma="Photo Frames";           	  String black="Rich Black";
	int p2=580;     String polo="Mirrors";                 String white="Pearl white";
	int p3=650;     String scott="Clocks";              String grey="Aura Grey";
	int p4=1599;    String lee="Vases";			  String blue="Nebula blue";
		
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
		    decor();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			decor();
		}
	
}

private static void hom() {
	int p1=400;     String puma="Curtains ";           	  String black="Rich Black";
	int p2=580;     String polo="Bedsheets";              String white="Pearl white";
	int p3=650;     String scott="Cushion Covers";        String grey="Aura Grey";
	int p4=1599;    String lee="Carpets";			      String blue="Nebula blue";
		
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
		    hom();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			hom();
		}	
}

private static void fur() {
	int p1=35000;     String puma="Sofas ";           	  String black="Rich Black";
	int p2=42000;     String polo="Mattresses";                 String white="Pearl white";
	int p3=32999;     String scott="Dining Sets";              String grey="Aura Grey";
	int p4=22999;    String lee="Recliners";			  String blue="Nebula blue";
		
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
		    fur();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			fur();
		}	
}

private static void dining() {
	int p1=1700;     String puma="Dinner sets ";           	  String black="Rich Black";
	int p2=999;     String polo="Casseroles";                 String white="Pearl white";
	int p3=1500;     String scott="Cultery";              String grey="Aura Grey";
	int p4=599;    String lee="Glasses & Jugs";			  String blue="Nebula blue";
		
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
		    dining();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			dining();
		}	
}
}
