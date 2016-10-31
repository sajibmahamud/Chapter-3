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
public class practice6 {
    practice6(){
 
    
    System.out.print("Enter height in inches: ");
    double feet = S.nextDouble();
    double enchy=feet*12;
    System.out.print("Enter height in inches: ");
    double enchi = S.nextDouble();
    double final_enchi=enchy+enchi;
    final double METERS_PER_INCH = 0.0254; 
    
    
    double heightInMeters = final_enchi * METERS_PER_INCH; 
    double bmi =  (heightInMeters * heightInMeters);
        System.out.println("BMI +"+bmi);
    }
}
