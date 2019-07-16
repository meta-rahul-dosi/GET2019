import java.util.*;

public class JobScheduler
{
  static public void main(String[] args)
 {
  System.out.println("\nFCFS scheduling\n");
  
  timings t = new timings();
  System.out.println("enter number of processes ");  
  int n = t.m1();
  int[][] time = new int[n][2]; 
  t.m2(n);
  cal(n,time);
 }
 
   static void cal(int n, int[][] time)
  {
   int completion[] = new int[n];
   int turnaround[] = new int[n];
   int waiting[] = new int[n]; 
   int avgWaiting=0, avgTurnaround=0;
   System.out.println(time[][]);
   for(int i=0; i<n; i++)
   {
     if(i==0)
	{	
	  completion[i] = time[i][0] + time[i][1];
	}
	else
    {
	  if( time[i][0] > completion[i-1])
	 {
		completion[i] = time[i][0] + time[i][1];
	 }
	  else
	    completion[i] = completion[i-1] + time[i][1];
	 }
		turnaround[i] = completion[i] - time[i][0] ;          
		waiting[i] = turnaround[i] - time[i][1] ;          
		avgWaiting += waiting[i] ;            
		avgTurnaround += turnaround[i] ;
   }
   
      System.out.println("\nprocess  arrival  burst  completion  turnWaiting");
	  for(i=0; i<n; i++)
	 {
	    System.out.println("P"+(i+1)+"\t"+time[i][0]+"\t"+time[i][1]+"\t"+completion[i]+"\t"+turnaround[i]+"\t" +waiting[i]);
	 }
	 System.out.println("\naverage waiting time: "+ (avgWaiting/n));
  }
}

