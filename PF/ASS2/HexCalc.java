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
  
  System.out.println("enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 for hex2dec conversion, 6 for dec2hex conversion");
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
 	  case 5 : 
 	  case 6 : dec2hex(dec1,dec2); break;
 	  default: System.out.println("\nyour game is over");
 	  }
  }
  
  static void dec2hex(int d1, int d2)
  {  
	int d = d1+d2;  
	String s = Integer.toHexString(d);
	System.out.println(s);
  }
}
