import java.io.*;
import java.util.*;

public class SortSearchDriver {
  
  //variables that help us track time
  public static long start = 0;
  public static long elapsed = 0;
  
    public static void main(String[] args) {

      int size = 3000;

    	// Uncomment these to test part 1

      // The 20 here is the size
      System.out.println("\nCreate a new set of data called ss with size of " + size);
    	SortSearch ss = new SortSearch(size);
    	if(size < 100) System.out.println(ss);
    	
    		
    
			// Uncomment these to test part 2
    
    	// int i;
    	// i = ss.findSmallestIndex(0);
    	// System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
    
    	// i = ss.findSmallestIndex(3);
    	// System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
    	
    	// Uncomment these to test part 3
    
    	// System.out.println(ss);
      System.out.println("\nLinear Sort on ss:");
      startTimeTest();
      ss.sort();
      endTimeTest();
    	if(size < 100) System.out.println(ss);

    //Test MERGE SORT
    // System.out.println("\n New list4 ArrayList with a size of " + 3);
    // ArrayList<Integer> list4 = ss.buildIncreasingList(3);
    // System.out.println(list4);

    // System.out.println("\n New list5 ArrayList with a size of " + 7);
    // ArrayList<Integer> list5 = ss.buildIncreasingList(7);
    // System.out.println(list5);
    
    // System.out.println("\nMerging list4 & list5 into a new list6:");
    // ArrayList<Integer> list6 = ss.merge(list4, list5);
    // System.out.println(list6);


    //MERGESORT TEST
    System.out.println("\nCreate a new set of data called ss2 of size " + size);
    SortSearch ss2 = new SortSearch(size);
    	if(size < 100) System.out.println(ss2);
  
    System.out.println("\nMergeSort on ss2:");
    startTimeTest();
    ss2.msort();
    endTimeTest();
    	if(size < 100) System.out.println(ss2);
	


	      

    }


    public static void startTimeTest(){
    //start = System.currentTimeMillis();
    start = System.nanoTime();
  }
  public static void endTimeTest(){
    //System.out.println("Size: " + size);
    
    //elapsed = System.currentTimeMillis() - start;
    //System.out.println(" Time: " + elapsed + " ms");
 
    elapsed = System.nanoTime() - start;
    System.out.println(" Time: " + elapsed/1000 + " us");

  }

}