import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


    	// Uncomment these to test part 1

      // The 20 here is the size
    	SortSearch ss = new SortSearch(30);
    	System.out.println(ss);
    	
    		
    
			// Uncomment these to test part 2
    
    	int i;
    	i = ss.findSmallestIndex(0);
    	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
    
    	// i = ss.findSmallestIndex(3);
    	// System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
    	
    	// Uncomment these to test part 3
    
    	// System.out.println(ss);
    	// ss.sort();
    	// System.out.println(ss);

    //Test MERGE SORT
    System.out.println("\n New list4 ArrayList with a size of " + 3);
    ArrayList<Integer> list4 = ss.buildIncreasingList(3);
    System.out.println(list4);

    System.out.println("\n New list5 ArrayList with a size of " + 7);
    ArrayList<Integer> list5 = ss.buildIncreasingList(7);
    System.out.println(list5);
    
    System.out.println("\nMerging list4 & list5 into a new list6:");
    ArrayList<Integer> list6 = ss.merge(list4, list5);
    System.out.println(list6);


    //MERGESORT TEST
    System.out.println("\nCreate a new set of data called ss2:");
    SortSearch ss2 = new SortSearch(7);
    System.out.println(ss2);
  
    System.out.println("\nMergeSort on ss2:");
    ss2.msort();
    System.out.println(ss2);
	


	      

    }
}