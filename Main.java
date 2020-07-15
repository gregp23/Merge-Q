//Gregory Pierre || EMPLID: 15239799 || CISC 3130- TY2- Fall 2019
import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.util.Arrays;
import java.lang.Number;
import java.util.PriorityQueue;
class Main{
//This program ask the user to put the number of elements of two Queues
//Then the user inputs the elements within the Queue and the final 
//Output is two merged Queues in a sorted array 
public static void main(String[]args)throws Exception{ 
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>();
  //Scanner for user input
    Scanner scanner = new Scanner(System.in);

    System.out.println("-----First Queue-----");
    System.out.println("Enter the number of elements for the first Queue: ");
    //Variable for the number of elements in a Queue
    int numelements = scanner.nextInt();
    System.out.println("Enter your elements: ");
    //Elements for the first Queue
    for(int i = 0; i<= numelements-1;i++){
    int val = scanner.nextInt(); 
    queue.add(val);  
    }
    System.out.println("-----Second Queue-----");
    System.out.println("Enter the number of elements for the second Queue: ");

    int numelements2 = scanner.nextInt();
    System.out.println("Enter your elements: ");
    //Elements for the second Queue
    for(int i = 0; i<= numelements2-1;i++){
    int val = scanner.nextInt();   
    queue2.add(val);
  }
  //Once the two Queues pass through the merge method it becomes a sorted array
   Object []q = merge(queue,queue2);
   System.out.println("");
   System.out.print("[");
    for(int i =0;i<= q.length-2;i++){
      System.out.print(q[i]+", ");
    }
    System.out.print(q[q.length-1]+"]");
}
  //Method merge, merges two Queues and returns it as a sorted Array
  public static Object[] merge(PriorityQueue queue, PriorityQueue queue2)throws NumberFormatException{
    PriorityQueue<Integer> QueueMerge = new PriorityQueue<Integer>();
    
    while(!queue.isEmpty()){
      String string = queue.poll().toString();
      QueueMerge.add(Integer.parseInt(string));}
      
    while(!queue2.isEmpty()){
      String string = queue2.poll().toString();
      QueueMerge.add(Integer.parseInt(string));}
      Object[]array= QueueMerge.toArray();
      Arrays.sort(array);
   return array;
  }
}