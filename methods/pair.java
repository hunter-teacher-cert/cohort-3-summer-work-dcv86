import java.io.*;
import java.util.*;
// if x=[0,1,2,3] then barGraphify(x) will output
// 0:			//no lane
// 1: =		//if we know Lane 1 has one 1 lane, we can continue to keep adding. 
// 2: ==
// 3: ===

// if x=[1,0,3,2] then barGraphify(x) will output
// 0: =
// 1:
// 2: ===
// 3: ==

// if x=[1,2,0,3] then barGrahify(x) will output

// 	0: =
// 	1: ==
// 	2: 
// 	3: ===
public class pair{
  public static void main(String[] args){
    for( int x = 0; x < 5; x++ ) {
	  System.out.println(barGraphify[]);
    }
  }
  
  public static String barGraphify(int[] x)
  {

    
    if (x == 1){
      return "=";
    }
  else if (x == 0){
      return "";
    }
  if (x == 2){
      return "==";
    }
  else if (x == 3){
      return "===";
    }
    
	}

}