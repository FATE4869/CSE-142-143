import java.io.*;
import java.util.*;

public class BasicArrayListOperations
{
   public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String>();
      System.out.println("list = " + list);
      list.add("Tool");
      System.out.println("list = " + list);
      list.add("Phish");
      System.out.println("list = " + list);
      list.add("Pink Floyd");
      System.out.println("list = " + list);
      
      System.out.println("\n");
      
      System.out.println("before list = " + list);
      list.add(1,"U2");
      System.out.println("after list = " + list);
      
      System.out.println("\n");
      
      System.out.println("before remove list = " + list);
      list.remove(0);
      System.out.println("after 1st remove list = " + list);
      list.remove(1);
      System.out.println("after 2nd remove list = " + list);
      
      int sum = 0;
      for (int i = 0; i < list.size(); i++)
      {
         String s = list.get(i);
         sum += s.length();
      }
      System.out.println("Total of lengths = " + sum);
      // Basic  ArrayList Methods
      // add(value)
      // add(index, value)
      // clear()
      // get(index)
      // remove(index)
      // set(index, value)
      // size()
   }
}

