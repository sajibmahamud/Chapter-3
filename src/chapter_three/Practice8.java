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
public class Practice8 {
    Practice8(){
        System.out.print("Enter three integers: ");
    int number1 = S.nextInt();
    int number2 = S.nextInt();
    int number3 = S.nextInt();

    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    if (number2 > number3) {
      int temp = number2;
      number2 = number3;
      number3 = temp;
    }

    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    System.out.println("The sorted numbers are "+ number1 + " " + number2 + " " + number3);
  }
}
    

