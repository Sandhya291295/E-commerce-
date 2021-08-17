import java.util.Scanner;

public class Beauty {
static Scanner sc=new Scanner(System.in);
public static void beauty() {
	System.out.println("\n"+">>BEAUTY & GROOMING<<");
	System.out.println("1.MAKE UP & NAILS");
	System.out.println("2.SKINCARE");
	System.out.println("3.HAIR CARE");
	System.out.println("4.FRAGRANCES");
	System.out.println("5.BATH & SHOWER");
	System.out.println("6.BACK"  );
	System.out.println("7.HOMEPAGE"  );
	System.out.println("Select your choice");
	int choice=sc.nextInt();
	try {
	switch(choice) {
	case 1:makeup();
	break;
	case 2:skin();
	break;
	case 3:hair();
	break;
	case 4:frag();
	break;
	case 5:bath();
	break;
	case 6:Categories.category();
	break;
	case 7:HomePage.home();
	break;
	default:System.err.println("select correct choice");
	beauty();
	}
	}catch(Exception e) {
		System.err.println("select correct choice");
		beauty();
	}	
}
private static void bath() {
	int p1=599;    String puma="Shower Gels";           	     String black="NIVEA";
	int p2=450;     String polo="Soap's";               String white="PEARS";
	int p3=799;     String scott="Body Oils";               String grey="BODYSHOP";
	int p4=780;    String lee="Loofas";			     String blue="PALMOLIVE";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.PEARS");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.PALMOLIVE");
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
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.PEARS");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.PALMOLIVE");
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
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.PEARS");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.PALMOLIVE");
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
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.PEARS");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.PALMOLIVE");
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
		    bath();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			bath();
		}	
}
private static void frag() {
	int p1=599;    String puma="Perfumes";           	     String black="FOGG";
	int p2=450;     String polo="Deodrants";               String white="SKINN";
	int p3=799;     String scott="Body Mist";               String grey="PARK AVENUE";
	int p4=780;    String lee="Essential Oils";			     String blue="ORGANIX MANTRA";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.FOGG");
		System.out.println(    "2.SKINN");
		System.out.println(    "3.PARK AVENUE");
		System.out.println(    "4.ORGANIX MANTRA");
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
		System.out.println(    "1.FOGG");
		System.out.println(    "2.SKINN");
		System.out.println(    "3.PARK AVENUE");
		System.out.println(    "4.ORGANIX MANTRA");
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
		System.out.println(    "1.FOGG");
		System.out.println(    "2.SKINN");
		System.out.println(    "3.PARK AVENUE");
		System.out.println(    "4.ORGANIX MANTRA");
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
		System.out.println(    "1.FOGG");
		System.out.println(    "2.SKINN");
		System.out.println(    "3.PARK AVENUE");
		System.out.println(    "4.ORGANIX MANTRA");
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
		    frag();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			frag();
		}	
	
}
private static void hair() {
	int p1=599;    String puma="Shampoos";           	     String black="FORESTESSENTIAL";
	int p2=450;     String polo="Conditioners";               String white="KAMAAYURVEDA";
	int p3=799;     String scott="Hair serums";               String grey="BODYSHOP";
	int p4=780;    String lee="Hair Oil";			     String blue="WOW";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.FORESTESSENTIAL");
		System.out.println(    "2.KAMAAYURVEDA");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.WOW");
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
		System.out.println(    "1.FORESTESSENTIAL");
		System.out.println(    "2.KAMAAYURVEDA");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.WOW");
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
		System.out.println(    "1.FORESTESSENTIAL");
		System.out.println(    "2.KAMAAYURVEDA");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.WOW");
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
		System.out.println(    "1.FORESTESSENTIAL");
		System.out.println(    "2.KAMAAYURVEDA");
		System.out.println(    "3.BODYSHOP");
		System.out.println(    "4.WOW");
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
		    hair();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			hair();
		}
   	
}
private static void makeup() {
	int p1=1200;    String puma="Compact&Foundations";           	     String black="LAKME";
	int p2=780;     String polo="Lipsticks";                             String white="MAC";
	int p3=950;     String scott="Brushes & Tools";                      String grey="MAYBELLINE";
	int p4=1599;    String lee="Make-Up Palettes";			             String blue="COLORBAR";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.LAKME");
		System.out.println(    "2.MAC");
		System.out.println(    "3.MAYBELLINE");
		System.out.println(    "4.COLORBAR");
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
		System.out.println(    "1.LAKME");
		System.out.println(    "2.MAC");
		System.out.println(    "3.MAYBELLINE");
		System.out.println(    "4.COLORBAR");
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
		System.out.println(    "1.LAKME");
		System.out.println(    "2.MAC");
		System.out.println(    "3.MAYBELLINE");
		System.out.println(    "4.COLORBAR");
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
		System.out.println(    "1.LAKME");
		System.out.println(    "2.MAC");
		System.out.println(    "3.MAYBELLINE");
		System.out.println(    "4.COLORBAR");
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
		    makeup();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			makeup();
		}
   
   
	
	
}
private static void skin() {
	int p1=299;    String puma="FaceWash";           	     String black="NIVEA";
	int p2=450;     String polo="Body Lotion";               String white="LAKME";
	int p3=799;     String scott="SunScreens";               String grey="CLINIQUE";
	int p4=1500;    String lee="Moisturizer";			     String blue="BODY SHOP";
		
   System.out.println("1. "+puma+"-"+p1+"/-");
   System.out.println("2. "+polo+"-"+p2+"/-");
   System.out.println("3. "+scott+"-"+p3+"/-");
   System.out.println("4. "+lee+"-"+p4+"/-");
   System.out.println("\n"+"Select your choice");
   try {
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:	   System.out.println("1. "+puma+"-"+p1+"/-");
		
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.LAKME");
		System.out.println(    "3.CLINIQUE ");
		System.out.println(    "4.BODYSHOP");
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
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.LAKME");
		System.out.println(    "3.CLINIQUE ");
		System.out.println(    "4.BODYSHOP");
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
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.LAKME");
		System.out.println(    "3.CLINIQUE ");
		System.out.println(    "4.BODYSHOP");
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
		System.out.println(    "1.NIVEA");
		System.out.println(    "2.LAKME");
		System.out.println(    "3.CLINIQUE ");
		System.out.println(    "4.BODYSHOP");
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
		    skin();
		
		}
		}catch(Exception e) {
			System.err.println("Choose a correct number");
			skin();
		}
   
   
	
	
}
}
