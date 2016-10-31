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
public class Practice3 {
   Practice3(){
       System.out.println("Insert the value of a");
       double a=S.nextDouble();
       System.out.println("Insert the value of a");
       double b=S.nextDouble();
       System.out.println("Insert the value of a");
       double c=S.nextDouble();
       System.out.println("Insert the value of a");
       double d=S.nextDouble();
       System.out.println("Insert the value of a");
       double e=S.nextDouble();
       System.out.println("Insert the value of a");
       double f=S.nextDouble();
      double x=(e*d - b*f)/(a*d - b*c);
      double y=(a*f - e*c)/(a*d - b*c);
       System.out.println("value of X"+x);
       System.out.println("Value of Y"+y);
   } 
}
