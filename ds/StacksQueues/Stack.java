import java.io.*;
import java.util.*;


public class Stack {
	private ArrayList <Integer> AL;
	
  public Stack(){
	  AL = new ArrayList <Integer> ();
	
	}

  // void push(int value) - add value to the top of the stack
	public void push(int value){

		AL.add (value);
		
	}

  // int pop() - remove and return the top value from the stack
  public int pop(){
		int value;
    // get the value at the top of the stack for int value by calling get from the size of AL
    if (AL.size() == 0){
      return -1;
    }
    else{
  		value = AL.get(AL.size()-1);
      // in order to remove the value from the top of the stack, call the location of the value
      AL.remove(AL.size() - 1);
      return value;
    }
  }

  // int top() - return but do not remove the top value from the stack
  public int top(){
  	int value;

    if (AL.size() == 0){
      return -1;
    }
    else{
      value = AL.get(AL.size()-1);
      return value; 
    }
  }

  // boolean isEmpty() - return true of the stack is empty, false otherwise
  public boolean isEmpty(){
    if (AL.size() == 0){
      return true;
    }
    else{
      return false;
    }
  }

  // int size() - return the number of elements currently in the stack
  public int size(){
    return AL.size();
  }

  // boolean isFull() - returns true if the stack is full, false otherwise - only implement this if you use an array for implementation
  public boolean isFull(){
    return false;
  }

  public String toString(){
    String stackList = "";
    //do we need to traverse here?
    for (int i = AL.size() - 1; i >= 0; i--){
      stackList += AL.get(i) + "\n";
    }
    return stackList;
  }
	
} 