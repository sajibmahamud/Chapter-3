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
public class Practice9 {
    Practice9(){
        int number1 = (int)(Math.random() * 100);
    int number2 = (int)(Math.random() * 100);
 
    
    if (number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }
 
    
    System.out.print("What is " + number1 + " - " + number2 + "? ");
    
    int answer = S.nextInt();
 
    
    if (number1 - number2 == answer)
      System.out.println("You are correct!");
    else
      System.out.println("Your answer is wrong.\n" + number1 + " - "
        + number2 + " should be " + (number1 - number2));
    }
}
