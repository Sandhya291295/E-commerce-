import java.util.Scanner;

public class Exit {
public static void exit() {
	Scanner sc=new Scanner(System.in);
	System.out.println("ARE YOU SURE,YOU WANT TO EXIT ?");
	System.out.println("                 1.EXIT");
	System.out.println("                 2.HOMEPAGE");
	
	try {
	int choice=sc.nextInt();
   switch(choice) {
   case 1:System.out.println("                                 ***************************1**********-------------******************************************");
          System.out.println("                                 *                       --<    @ THANK YOU FOR VISITING US @     >--                        *");
          System.out.println("                                 *                       --<         @ HAVE A GOOD DAY @     >--                             *");
          System.out.println("                                 *************************************-------------*******************************************");

          break;
   case 2:HomePage.home();
   		break;
   		default:System.out.println("Enter the correct choice");
   		    exit();
   }
	}catch(Exception e) {
		System.out.println("Choose a correct number");
		    exit();
	}
}
}
