import java.util.Scanner;

public class Electronics {
public static void electronics() {
	
	System.out.println("\n"+">> ELECTRONICS <<");
	System.out.println(             "1.MOBILES"  );
	System.out.println(             "2.TELIVISIONS"  );
	System.out.println(             "3.CAMERAS"  );
	System.out.println(             "4.LAPTOPS"  );
	System.out.println(             "5.HEADPHONES"  );
	System.out.println(             "6.BACK"  );
	System.out.println(             "7.HOMEPAGE"  );
	
	
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("\n"+"select your choice");
	int choice=sc.nextInt();
	switch(choice) {
    case 1:Mobiles.mobiles();
	        break;
	        
	case 2:Telivisions.telivisions();
			break;
			
	case 3:Cameras.cameras();
			break;
			
	case 4:Laptops.laptops();
		    break;
		    
	case 5:Headphones.headphones();
			break;
			
	case 6:Categories.category();
		   break;
			
	case 7:HomePage.home();
	       break;
	        
	default:System.err.println("Enter the correct choice");
	        electronics();
	        
	}
	}catch(Exception e) {
		System.err.println("choose a correct number");
		electronics();
	}
}
 





}

    


