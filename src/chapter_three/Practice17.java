/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_three;

import static chapter_three.practice.S;
import javax.swing.JOptionPane;

/**
 *
 * @author sajib
 */
public class Practice17 {
    Practice17(){
        String input=JOptionPane.showInputDialog("Insetr a year");
        System.out.println("Insert the  mounth");
        double year=S.nextInt();
        boolean isyear=((year%4==0)||(year%400==0));
        String output=year+"is a leapyear"+isyear;
        JOptionPane.showConfirmDialog(null, output);
    }
}
