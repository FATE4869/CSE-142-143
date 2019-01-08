// This program constructs a list of stop words and echoes
// Halmet's famous speech with the stop words removed.
import java.io.*;
import java.util.*;

public class ACompleteArrayListProgram
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // build the list of stop words
      ArrayList<String> stopwords = new ArrayList<>();
      stopwords.add("a");
      stopwords.add("be");
      stopwords.add("by");
      stopwords.add("how");
      stopwords.add("in");
      stopwords.add("is");
      stopwords.add("it");
      stopwords.add("of");
      stopwords.add("on");
      stopwords.add("or");
      stopwords.add("that");
      stopwords.add("the");
      stopwords.add("this");
      stopwords.add("to");
      stopwords.add("why");
      
      // process the file, printing all but stop words
      Scanner input = new Scanner (new File("speech.txt"));
      while(input.hasNext())
      {
         String next = input.next();
         if (!stopwords.contains(next.toLowerCase()))
         {
            System.out.print(next + " ");
         }
      }
   }
}