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
    int one;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }
    
    public int maxPair(NewClass theClass){
        arr = theClass.getArr();
        one = theClass.getOne();
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++)
            if(arr[i] > max)
                max = arr[0];
        return max + one;
    }
    
    public NewClass(int theInt , int[] theArr){
        one = theInt;
        arr = theArr;
    }
    
    
 public static void main(String[] args) throws ParseException {
 Instant start = Instant.now();

 long i=0;
 while (i<100000000){i++;}

 
 
 
 
 
 Instant finish = Instant.now();
 long timeElapsed = Duration.between(start, finish).toMillis(); //in millis
 System.out.println("time "+ timeElapsed);
 }
}
