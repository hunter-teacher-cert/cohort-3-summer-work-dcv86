import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args){
    Stack s = new Stack();

    System.out.println(s.pop());//should return error
    System.out.println(s.top());//should return error

    s.push(5);//adds '5' to stack
    s.push(10);//adds '10'
    s.push(7);//adds '7'

    System.out.println("-----");
    System.out.println(s);
    System.out.println("-----");

    System.out.println(s.top()); //return the last thing added to stack (in this case, '7')
    System.out.println(s.pop());
    System.out.println(s.top());

    /*
    -1
    -1
    -----
    7
    10
    5
    -----
    7
    7
    10
    */
  }
}