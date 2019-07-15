import java.util.*;

public class Cart
{
  static public void main(String[] args)
 {
  System.out.println("\nFCFS scheduling\n");

  Scanner input = new Scanner(System.in);
  System.out.println("enter number of processes");
  int n = input.nextInt();  
  int[][] timing = new int[n][2];

  System.out.println("\nenter arrival times and burst times of \n");
  for(int i=0; i<n; i++)
  {
    int k = i;
    System.out.println("for P"+(++k)+"  ");
    for(int j=0; j<2; j++)
	{
	 int time = input.nextInt();
     timing[i][j] = time;
    }
  }
  
  System.out.println("\nProcess"+"  "+"Arrival_time"+"  "+"Burst_time");
  for(int i=0; i<n; i++)  
  {
    int k = i;
    System.out.println("  P"+(++k)+"          "+timing[i][0]+"           "+timing[i][1]);
  }  
 }
}


