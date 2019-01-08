import java.io.*;
import java.util.*;

public class AddingToAndRemovingFromAnArrayList
{
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<String> words= new ArrayList<>();
      words.add("four");
      words.add("score");
      words.add("and");
      words.add("seven");
      words.add("years");
      words.add("ago");
      System.out.println("words = " + words);
      
      for (int i = 0; i < words.size(); i += 2)
      {
         words.add(i, "~");
      }
      System.out.println("after loop words = " + words);
      
      // undo this operation
      for(int i = 0; i < words.size(); i++)
      {
         words.remove(i);
      }
      System.out.println("after second loop words = " + words);
   }
}