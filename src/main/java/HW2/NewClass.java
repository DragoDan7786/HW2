/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW2;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.time.*;
import java.util.Scanner;
public class NewClass {
    
    int[] arr;
    int numItems;

    
    public NewClass(int theInt , int[] theArr){
        numItems = theInt;
        arr = theArr;
    }
    
    public int MaxPair(){
        
        int max1 = arr[0];
        int max2 = 0;
        
        for(int i = 1; i< numItems ; i++){
            if(arr[i] > max1)
                max1 = arr[i];    
            
            else{
                if(arr[i] > max2 && arr[i] <= max1)
                   max2 = arr[i];
            }
        }
        
        return max1 * max2;
    }
    
 public static void main(String[] args) throws ParseException {
     
 Instant start = Instant.now();
 
 Scanner theScan = new Scanner(System.in);
 int num;
 int[] theSequence;
 
 System.out.println("Input sequence length");
 num = theScan.nextInt();

 if(num < 2 || num > 2*(10^5))
     System.out.print("ERROR");
 
 else{
     theSequence = new int[num];
     System.out.println("Insert the contents of the sequence");
     
     
     for(int i = 0 ; i < num ; i++)
         theSequence[i] = theScan.nextInt();
     
     
     NewClass seq = new NewClass(num , theSequence);
     
     System.out.println("The max pair multiplied is " + seq.MaxPair());
     
     }
 
 
 
 Instant finish = Instant.now();
 long timeElapsed = Duration.between(start, finish).toMillis(); //in millis
 System.out.println("time "+ timeElapsed);
    

     
 
 }
}

