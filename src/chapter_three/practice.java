/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_three;

import java.util.Scanner;

/**
 *
 * @author sajib
 */
public class practice {
    static Scanner S=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,r1,r2;
        System.out.println("Insert the value of a=");
        a=S.nextDouble();
        System.out.println("Insert the value of b=");
        b=S.nextDouble();
        System.out.println("Insert the value of c=");
        c=S.nextDouble();
        r1=((-b+.5*(b*b-4*a*c))/2*a);
        r2=((-b-.5*(b*b-4*a*c))/2*a);
        System.out.println("valiu of r1="+r1);
         System.out.println("valiu of r2="+r2);
         //Practice2 a1=new Practice2();
         //Practice3 a2=new Practice3();
         //Practice4 a3=new Practice4();
         //Practice5 a4=new Practice5();
         //Practice7 a5=new Practice7();
         //Practice8 a6=new Practice8();
         //Practice9 a7=new Practice9();
         //Practice10 a8=new Practice10();
         //Practice12 aa=new Practice12();
         //Practice13 a9= new Practice13();
         //Practice14 a10=new Practice14();
         //Practice15 a11=new Practice15();
         //Practice16 a12=new Practice16();
         //Practice17 a13=new Practice17();
         //Practice18 a14=new Practice18();
         //Practice19 a15=new Practice19();
    }
    
}
