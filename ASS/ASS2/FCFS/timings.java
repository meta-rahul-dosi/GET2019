import java.util.*;

public class timings 
{
     int m1()
	{
	  Scanner input = new Scanner(System.in);
	  int n = input.nextInt(); 
	  return n;
	}
	
	int[][] m2(int n)
	{		   
		  int[][] timing = new int[n][2];

		  Scanner input = new Scanner(System.in);
		  System.out.println("\nenter arrival times and burst times of \n");
		  for(int i=0; i<n; i++)
		  {
		    int k = i;
		    System.out.println("for P"+(++k)+"  ");
		    for(int j=0; j<2; j++)
			{
			 int t = input.nextInt();
		     timing[i][j] = t;
		    }
		  }
		  
		  System.out.println("\nProcess"+"  "+"Arrival_time"+"  "+"Burst_time");
		  for(int i=0; i<n; i++)  
		  {
		    int k = i;
		    System.out.println("  P"+(++k)+"          "+timing[i][0]+"           "+timing[i][1]);
		  } 
          return timing;		  
	}	
}
