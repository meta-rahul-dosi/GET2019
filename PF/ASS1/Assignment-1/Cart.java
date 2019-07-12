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
		map.put("premium oil", 380f);
		
	    Set<String> keys = map.keySet();
	    for(String i:keys)
	    {
	    	System.out.println(i+"   "+map.get(i));
	    }
	    
	    boolean action=true;
	    label: while(action)
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
   	 
   	 
   	 static void addItem(String s, float p)
   	 {   		 
   		int l=0, previous=0;
   		for(int i=0; i<checkItemList.length; i++)
   		{
   			if(s==checkItemList[i])
   			{
   				l=1;
   				previous = i;
   				break;
   			
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
	    	System.out.println(i+"   "+myCart.get(i)+"   "+amount.get(i));
	    }
   	 }
   	 
   	 
   	 
   	 
   	 
   	static void generateBill()
    {
   	  System.out.println("Your whole shopping is \n");
   	  System.out.println("item_name     price     quantity");
      Set<String> keys = myCart.keySet();
      for(String i:keys)
      {
    	System.out.println(i+"         "+myCart.get(i)+"      "+amount.get(i));
      }
            
    } 
    
}
