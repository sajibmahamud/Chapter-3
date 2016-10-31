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
public class Practice4 {
 Practice4(){
    
     boolean A = false,B=true;
     int number1 = (int)(System.currentTimeMillis() % 10);
     int number2 = (int)(System.currentTimeMillis() * 7 % 10);
     int sum=number1+number2;
     System.out.println("the sum of two generated number"+sum);
     System.out.println("Insert a Sum of two number =");
     int b=S.nextInt();
     if(b==sum){
         System.out.println(B); 
     }
     else{
         System.out.println(A);
     }
 }   
}
