import java.util.Scanner;

public class Categories {

public static void category()  {
	System.out.println("\n"+">> SHOP BY ALL CATEGORIES <<");
	System.out.println(             "1.ELECTRONICS"  );
	System.out.println(             "2.MEN'S FASHION"  );
	System.out.println(             "3.WOMEN'S FASHION"  );
	System.out.println(             "4.KID'S SECTION"  );
	System.out.println(             "5.BEAUTY"  );
	System.out.println(             "6.HOME,KITCHEN AND FURNITURE"  );
	System.out.println(             "7.BACK"  );
	System.out.println(             "8.EXIT"  );
	
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("\n"+"select your choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:Electronics.electronics();
			break;
			
	case 2:Mens.mens();
	        break;
	        
	case 3:Women.women();
			break;
			
	case 4:Kids.kids();
			break;
			
	case 5:Beauty.beauty();
		    break;
		    
	case 6:Kitchen.kitchen();
			break;
			
	case 7:HomePage.home();
			break;
			
	case 8:Exit.exit();
	        break;
	        
	default:System.out.println("Enter the correct choice");
	        category();
	        
	}
	}catch(Exception e) {
		System.out.println("choose a correct number");
		 category();
	}
}
}
