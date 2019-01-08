import java.io.*;
import java.util.*;

public class WrapperClass
{
   public static void main(String[] args)
   {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(13);
      list.add(47);
      list.add(15);
      list.add(9);
      int sum = 0;
      for (int n : list)
      {
      sum += n;
      }
      System.out.println("list = " + list);
      System.out.println("sum = " + sum);
      System.out.println("product = " + list.get(0) * list.get(1) );
   }
}