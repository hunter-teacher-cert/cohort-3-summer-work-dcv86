import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.(Done 7/19/22 11:12)
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors. (Done 7/19/22 11:12)

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method. (Done 7/20)
  2. Uncomment the lines in SortProjectDriver to test. (Done 7/20)

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.

Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<15;i++){
    	    data.add(r.nextInt(20));
    	}
	
    }
    
    public SortSearch(int size){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i=0;i<size;i++){
    	    data.add(r.nextInt(20));
    	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
    	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      data[3] <- 6 // arrayName[index]
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
      // smallIndex is the LOCATION of the smallest value
    	int smallIndex = start;
    	for(int i = start; i < data.size(); i++){
        // Need to reference the actual VALUES\
        // data is the name of the array list
        // EX: data[0] < data[1] checks VALUE at 0 < VALUE at 1
				if (data.get(i) < data.get(smallIndex)){
					smallIndex = i;
				}
			}
    	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
	 
       
    */
    public void sort(){
			int smallIndex=0;
				for(int i = 0; i < data.size(); i++){
					

					int temp;
					smallIndex = findSmallestIndex(i);
					temp = data.get(i);
					data.set(i,data.get(smallIndex));
					data.set(smallIndex, temp);
				}
	
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
			// int index = -1;
			for (int i = 0; i < data.size(); i++){
				if(value == data.get(i)){
					return i;
				}
			}
        return -1; // replace this return
		}
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
     public int binarySearch(int value){
      int high = data.size()-1;
      int mid;
      int low = 0;

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
      
      while (high >= low){
        mid = (low + high) / 2;
        if (value < data.get(mid)){
          high = mid - 1;
        } 
        else if (value > data.get(mid)){
          low = mid + 1;
        }
        else
      return mid;
      }

	return -1;
	    
    }

	   //  return 0;
	    
    // }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
  	  return 0;  
	    
    }
    
	
    public String toString(){
  	  return ""+data;  
    };


    public void builtinSort(){
	    Collections.sort(data);
	
    }


   /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */    
    public ArrayList<Integer> merge( ArrayList<Integer> list1,
				    ArrayList<Integer> list2){
      
      //create a new ArrayList list3 to hold the values from list1 & list2 
			ArrayList<Integer> list3 = new ArrayList<Integer> ();

      //use i and j to keep track of where we are in list 1 & list2
      int i = 0;
      int j = 0;

      // CASE 1: add the smaller element from one of the lists
      //keep looping until at the end of both lists
      while(i < list1.size() && j < list2.size()){
      
        //check if list1's element is smaller
        if(list1.get(i) < list2.get(j)){

          //add it to the new list
          list3.add(list1.get(i));

          //increment i appropriately
          i++;
        }
        
        //check if list2's element is smaller
        else{
          
          //add it to the new list
          list3.add(list2.get(j));
          
          //increment j appropriately
          j++;
        }

      }

      // Case 2: if at the end of list1, pull from list2
      while(j < list2.size()){
        
          //add it to the new list
          list3.add(list2.get(j));
          
          //increment j appropriately
          j++;
      }

      // Case 3: if at the end of list2, pull from list1
      while(i < list1.size()){
        
          //add it to the new list
          list3.add(list1.get(i));
          
          //increment i appropriately
          i++;
      }

      //return the new list 
      return list3;
    }

  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){
  
    //BASE CASE: if the number of elements is less than 2, then stop doing recursion!
    if(list.size() < 2)
      return list;

    //RECURSIVE CASES: split in two lists
    int middle = list.size() / 2;
    
    //fill up the left ArrayList from 0 to middle
    ArrayList<Integer> left = new ArrayList<Integer>();
    for(int i = 0; i < middle; i++){
      left.add(list.get(i));
    }
 
    //fill up the right ArrayList from middle to the end
    ArrayList<Integer> right = new ArrayList<Integer>();
    for(int i = middle; i < list.size(); i++){
      right.add(list.get(i));
    }
    
    // mergeSort the left half
    left = mergeSort(left);
    
    // mergeSort the right half
    right = mergeSort(right);
    
    // merge them together into a new list & return
    return merge(left, right);


  }


  public void msort(){
      data =  mergeSort(data);
  }

    
}