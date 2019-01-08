import java.io.*;
import java.util.*;

public class ArrayListSearchingMethods
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // removes duplicates from a list
      Scanner input = new Scanner(new File("names.txt"));
      ArrayList<String> list = new ArrayList<String>();
      while( input.hasNext())
      {
         String name = input.next();
         if (!list.contains(name))
         {
            list.add(name);
         }
      }
      System.out.println("list = " + list);
      
      // Testing the replace method
      ArrayList<String> list_2 = new ArrayList<String>();
      list_2.add("to");
      list_2.add("be");
      list_2.add("or");
      list_2.add("not");
      list_2.add("to");
      list_2.add("be");
      System.out.println("inital list" + list_2);
      replace(list_2, "be", "beep");
      System.out.println("final list" + list_2);
      
      // ArrayList Searching Methods
      // contains()
      // indexOf()
      // lastIndexOf()
   }
   
   public static void replace(ArrayList<String> list, String target, String replacement)
   {
      int index = list.indexOf(target);
      if (index >= 0)
      {
         list.set(index, replacement);
      }
   }
}