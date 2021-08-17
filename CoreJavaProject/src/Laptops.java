import java.util.Scanner;

public class Laptops {
public static void laptops() {
 
String linfo="Lenovo Ideapad S145 Intel Core I3 8th Gen 15.6-inch FHD Thin and Light Laptop ( 8GB RAM / 1TB HDD / DOS  / 1.85 Kg),81MV0094IN"; 
String ainfo="Apple MacBook Air (13-inch, Previous Model, 8GB RAM, 128GB Storage, 1.8GHz Intel Core i5)" ;
String dinfo="Dell Vostro 3581 15.6-inch HD Laptop (7th Gen Core i3-7020U/4GB/1TB HDD/Windows 10 + MS Office/Intel HD Graphics) ";
String hinfo="HP 14 Core i3 7th gen 14-inch Thin and Light Laptop (8GB/256GB SSD/Windows 10 Home/MS Office/1.43 kg), 14q-cs0023TU"; 

int lp=29490;    String lenovo="Lenovo";         String black="Shiny Black";
int ap=65990;    String apple="Apple";        
int dp=27300;    String dell="Dell";                   
int hp=32490;    String hpp="HP";	

System.out.println("1."+lenovo+"("+linfo+")"+"-"+lp+"/-");
System.out.println("2."+apple+"("+ainfo+")"+"-"+ap+"/-");
System.out.println("3."+dell+"("+dinfo+")"+"-"+dp+"/-");
System.out.println("4."+hpp+"("+hinfo+")"+"-"+hp+"/-");
Scanner sc=new Scanner(System.in);

try {
System.out.println("\n"+"select your choice by brands");
int choice=sc.nextInt();
switch(choice) {

case 1:	Cart.addcart(lp,lenovo,black);
break;

case 2:Cart.addcart(ap,apple,black);
break;

case 3:Cart.addcart(dp,dell,black);
break;	

case 4:Cart.addcart(hp,hpp,black);
break;

default:System.err.println("Enter a correct choice");
    laptops();

}
}catch(Exception e) {
	System.err.println("Choose a correct number");
	laptops();
}

}
}
