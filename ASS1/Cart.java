import java.util.*;

public class Cart
{
   	 static String itemName;
   	 static String[] checkItemList = new String[5];
   	 static float [] qty = new float[5] ;
   	 static int j=0;
   	 static float price; 
   	 static HashMap<String, Float> myCart = new HashMap<String, Float>();
   	 static HashMap<String, Float> amount = new HashMap<String, Float>();
     
   	 public static void main(String args[]) 
	{
		System.out.println("WELCOME to METAGROCERY\n");

		HashMap<String, Float> map = new HashMap<String, Float>();
		map.put("wheatflour",320f);
		map.put("cornflour",320f);
		map.put("rice", 90f);
<<<<<<< HEAD
		map.put("premium oil", 380f);
=======
		map.put("oil", 380f);
>>>>>>> 34915e1d3f245eff75d50a743bef8a885b1dac39
		
	    Set<String> keys = map.keySet();
	    for(String i:keys)
	    {
	    	System.out.println(i+"   "+map.get(i));
	    }
	    
<<<<<<< HEAD
	    boolean action=true;
	    label: while(action)
=======
	    int action=1;
	    label: while(action==1)
>>>>>>> 34915e1d3f245eff75d50a743bef8a885b1dac39
	    {
	     System.out.println("\npress 1 for adding item in cart...press 2 for removing item from cart...press 3 for generating bill\n");
	     Scanner choice = new Scanner(System.in);
   	     int n = choice.nextInt();
    	 switch(n)
    	 {
    	  case 1 : System.out.println("enter item name...");
                 Scanner myItem = new Scanner(System.in);         
    	         String s = myItem.nextLine();
    	         addItem(s,map.get(s));
    	         break;
    	  case 2 : System.out.println("enter item to be removed...");
    	         Scanner myItem1 = new Scanner(System.in);
                 String s1 = myItem1.nextLine();
<<<<<<< HEAD
    	         //removeItem(s1);
    			 break;
    	  case 3 : //generateBill();
    			 break; 
    	  default : System.out.println("invalid action");
    	          break;    	
    	 }
    	 System.out.println("more activity ?");
    	 Scanner ss = new Scanner(System.in);
    	 String a = ss.nextLine();
    	 if(a=="yes")
    	 action=true;
    	 if(a=="no")
         action=false;
    	 if(action=false)
    	 break label;
	    }
	    
	}	      
   	 
   	 
=======
    	         removeItem(s1);
    			 break;
    	  case 3 : generateBill();
    			   break; 
    	  default : System.out.println("invalid action");
    	          break;    	
    	 }
    	 System.out.println("for more activity press 1.... else press 2 for generating bill...");
    	 Scanner ss = new Scanner(System.in);
    	 int a = ss.nextInt();
    	 if(a!=1)
    	 {
    	  action=2;	 
          generateBill();
    	 break label;
	     }
	    }
	}	      
   	 
>>>>>>> 34915e1d3f245eff75d50a743bef8a885b1dac39
   	 static void addItem(String s, float p)
   	 {   		 
   		int l=0, previous=0;
   		for(int i=0; i<checkItemList.length; i++)
   		{
   			if(s==checkItemList[i])
   			{
   				l=1;
   				previous = i;
<<<<<<< HEAD
   				break;
   			
=======
   				break;		
>>>>>>> 34915e1d3f245eff75d50a743bef8a885b1dac39
   			}
   		}
   		 
   		if(l==0)
   		{
   			checkItemList[j++] = s;
   			qty[j++] = p;
   			myCart.put(s,p);
   			amount.put(s,1.0f);
   		}
   		
   		if(l==1)
   		{
   		   ++qty[previous];
   		   amount.put(s,amount.get(s)+1f);
   		}
   		
   		
   		//displaying selected items 
   		Set<String> keys = myCart.keySet();
   		System.out.println("item_name      price     quantity");
	    for(String i:keys)
	    {
<<<<<<< HEAD
	    	System.out.println(i+"   "+myCart.get(i)+"   "+amount.get(i));
=======
	    	System.out.println(i+"        "+myCart.get(i)+"        "+amount.get(i));
>>>>>>> 34915e1d3f245eff75d50a743bef8a885b1dac39
	    }
   	 }
   	 
   	 
<<<<<<< HEAD
   	 
   	 
   	 
   	static void generateBill()
    {
=======
   	 static void removeItem(String s)
     {
       myCart.remove(s);   
       Set<String> keys = myCart.keySet();
  	   System.out.println("item_name      price     quantity");
	   for(String i:keys)
	   {
	     System.out.println(i+"        "+myCart.get(i)+"        "+amount.get(i));
	   }
     }
     
   	static void generateBill()
    {
   	  float total=0;
>>>>>>> 34915e1d3f245eff75d50a743bef8a885b1dac39
   	  System.out.println("Your whole shopping is \n");
   	  System.out.println("item_name     price     quantity");
      Set<String> keys = myCart.keySet();
      for(String i:keys)
      {
<<<<<<< HEAD
    	System.out.println(i+"         "+myCart.get(i)+"      "+amount.get(i));
      }
            
    	System.out.println(i+"     "+myCart.get(i)+"      "+amount.get(i));
      }            
      
      //calculation of total amount 
      for(String i:keys)
      {
    	total=total+(myCart.get(i)*amount.get(i));  
      }
      System.out.println("total="+total);
    } 
    
}
