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
	


	      

    }
}