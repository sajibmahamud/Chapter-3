/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_three;

/**
 *
 * @author sajib
 */
public class Practice13 {
    Practice13(){
             int number1 = (int)(System.currentTimeMillis() % 10);
             if(number1%2==0){
                 System.out.println("head"); 
             }
             else{
                 System.out.println("tail");
             }
    }
}
