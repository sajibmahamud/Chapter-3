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
public class Practice12 {
    Practice12(){
        System.out.println("Insert a value =");
        int a=S.nextInt();
        if(a%5==0 && a%6==0){
            System.out.println("value is divisible by 5 or 6, but not both");
          if(a%5==0 && a%6==0){
              System.out.println("value  is divisible by both 5 and 6");
          }  
        }
        else{
            System.out.println("value is not divisible by either 5 or 6");
        }
    }
}
