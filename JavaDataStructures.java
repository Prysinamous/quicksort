/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatastructures;
import java.util.Random;

/**
 *
 * @author Owner
 */
public class JavaDataStructures {

  
    public static void main(String[] args)
    {
        Random rand= new Random();

        UnOrderedArray u1= new UnOrderedArray(1000000);
        
        for(int x=0; x<1000000;x++)
        {
        u1.addLast(rand.nextInt(90));
        }
        
    System.out.println("Merge loading done.. Sorting started!");
     long start= System.nanoTime();
     u1.mergeSort();
     long end= System.nanoTime();
     System.out.println("Sorting done.. Took; "+(end-start)/1000000000.00 +"seconds");

     
      UnOrderedArray u11= new UnOrderedArray(1000000);
        
        for(int x=0; x<1000000;x++)
        {
        u1.addLast(rand.nextInt(90));
        }
        
     System.out.println("Quick sort loading done.. Sorting started!");
     start= System.nanoTime();
     u11.quickSort();
      end= System.nanoTime();
     System.out.println("Sorting done.. Took; "+(end-start)/1000000000.00 +"seconds");

    
        
    }
    
}
