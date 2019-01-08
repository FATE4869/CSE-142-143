// Constructs an ArrayList of Strings and sorts it.
import java.io.*;
import java.util.*;

public class SortExample
{
   public static void main(String[] args)
   {
      ArrayList<String> words= new ArrayList<>();
      words.add("four");
      words.add("score");
      words.add("and");
      words.add("seven");
      words.add("year");
      words.add("ago");
      
      // show list before and after sorting
      System.out.println("before sort, word = " + words);
      Collections.sort(words);
      System.out.println("after sort, word = " + words);
   }
}