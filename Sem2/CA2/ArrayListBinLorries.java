// CA2 - Question 3
// BinLorryArrayTester
// John Gallagher
// Applied Computing

import java.util.*;

public class ArrayListBinLorries
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList<BinLorry> b1List = new ArrayList<BinLorry>();
      double bin1 = 10;
      double bin2 = 50;
      double bin3 = 100;
      
      BinLorry b1 = new BinLorry();
      b1List.add(b1);
      BinLorry b2 = new BinLorry();
      b1List.add(b2);
      BinLorry b3 = new BinLorry();
      b1List.add(b3);
      
      
      b1.collectBin(bin1);
      b2.collectBin(bin2);
      b3.collectBin(bin3);
       
      //System.out.print(b1List.get(0).collectBin(bin));
      //b1List.collectBin(bin2);
      //b1List.collectBin(bin3);
      
      for(BinLorry b : b1List)
      {
         System.out.println(b); 
      }
         
      
      BinLorry max = b1List.get(0); 
      for(BinLorry b : b1List) {
         if(max.getRubbishLvl() < b.getRubbishLvl()) {
            max = b; 
         }
      }
      System.out.print("\nBinLorry with most rubbish: " + max);
       
      

   }
}