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
public class Practice2 {
    Practice2(){
        System.out.println("Insert the value=");
        int a=S.nextInt();
        boolean A=true;
        boolean B=false;
        if(a%2==0){
            System.out.println(A);
        }
        else {
            System.out.println(B);
        }
    }
}
