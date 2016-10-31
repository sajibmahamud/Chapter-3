/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_three;

import static chapter_three.practice.S;

/**
 *
 * @author sajib
 */
public class Practice19 {
    Practice19(){
          System.out
    .print("Enter the temperature in Fahrenheit between -58°F and 41°F:");
  double ta = S.nextDouble();
  System.out.print("Enter the wind speed (>=2) in miles per hour:");
  double v = S.nextDouble();
  double twc = 0;
 
  if (ta < -58 || ta > 41) {
   System.out.println("The temperature input is incorrect.");
   twc = -1;
  }
 
  if (v < 2) {
   System.out.println("The wind speed input is incorrect.");
   twc = -1;
  }
 
  if (twc == -1) {
   System.exit(0);
  }
 
  twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta
    * Math.pow(v, 0.16);
 
  System.out.print("The wind chill index is " + twc);
    }
}
