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
 public static void main(String[] args) throws ParseException {
 Instant start = Instant.now();

 long i=0;
 while (i<100000000){
 i++;

 }

 Instant finish = Instant.now();
 long timeElapsed = Duration.between(start, finish).toMillis(); //in millis
 System.out.println("time "+ timeElapsed);
 }
}