import java.lang.*;
import java.util.*;

public class HexCalc 
{
 public static void main(String[] args) 
 {
  String h1, h2;
  String pattern = "^[0-9A-Fa-f]+$";
  int choice;
  
  System.out.println("enter two hexadecimal numbers : ");
  Scanner input = new Scanner(System.in);
  h1 = input.nextLine();
  h2 = input.nextLine();
 
  if(!h1.matches(pattern))
  System.out.println("invalid first input");
  if(!h2.matches(pattern))
  System.out.println("invalid second input");	  
  
  System.out.println("enter 1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for hex2dec conversion\n6 for dec2hex conversion\n7 for comparing both strings");
  choice = input.nextInt();
  hex2dec(h1,h2,choice);
 } 

 static String add(int d1, int d2)
 {
    int d = d1+d2;
    String s = Integer.toHexString(d);
    return s;
 }

 static String sub(int d1, int d2)
 {
   int d = d1-d2;
   String s = Integer.toHexString(d);
   return s;    
 }
 
 static String mul(int d1, int d2)
 {
	int d = d1*d2;
    String s = Integer.toHexString(d);
	return s;   
 }
 
 static String div(int d1, int d2)
 {
	int d = d1/d2;
	String s = Integer.toHexString(d);
	return s;
 }
  
  static void hex2dec(String h1, String h2, int ch)
  {
    int dec1 = Integer.parseInt(h1,16); 
	int dec2 = Integer.parseInt(h2,16);  
 	System.out.println("decimal format of first number is "+dec1);  
 	System.out.println("decimal format of second number is "+dec2);
 	
 	switch(ch)
 	  {
 	  case 1 : System.out.println(add(dec1,dec2)); break;
 	  case 2 : sub(dec1,dec2); break;
 	  case 3 : mul(dec1,dec2); break;
 	  case 4 : div(dec1,dec2); break;
 	  case 5 : h2d(h1,h2); break;
 	  case 6 : dec2hex(dec1,dec2); break;
 	  case 7 : compare(h1,h2); break;
 	  default: System.out.println("\nyour game is over");
 	  }
  }
  
  static void h2d(String h1, String h2)
  {
	int dec1 = Integer.parseInt(h1,16); 
    int dec2 = Integer.parseInt(h2,16);  
    System.out.println(dec1+" and "+dec2);
  }
  
  static void dec2hex(int d1, int d2)
  {    
	String s1 = Integer.toHexString(d1);
	String s2 = Integer.toHexString(d2);
	System.out.println(s1+" and "+s2);
  }
  
  static void compare(String h1, String h2)
  {
	int a = h1.compareTo(h2);
	if(a==1)
	System.out.println(h1+" is greater");
	else if(a==-1)
	System.out.println(h2+" is greater");
	else if(a==0)
	System.out.println(h1+" is equal to "+h2);
  }
}
