import java.io.*;
import java.util.*;

public class Queue{

  // Place private instance variables here
  private LinkedList LL;
  
  // Place constructors here - A constructor with no parameters
  public Queue(){
    LL = new LinkedList();
  }

  // void enqueue(int value) - add value to the end of the queue
  public void enqueue(int value){
    LL.add(value);
  }
  
  // int dequeue() - remove and return the top value from front of the queue
  public int dequeue(){
    int value;
    if (LL.size() == 0){
      return -1;
    }
    else{
      value = LL.get(LL.size()-1);
      
    }
  }

  // int front() - return but do not remove the top value from the front of the queue


  // boolean isEmpty() - return true of the queue is empty, false otherwise


  // int size() - return the number of elements currently in the queue

  
}