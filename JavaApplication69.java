/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication69;

import java.util.Scanner;

/**
 *
 * @author batuhanatasoy
 */
public class JavaApplication69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner batu= new Scanner (System.in);
        System.out.println("Enter the number of steps in the staircase");
        int step = batu.nextInt();
        System.out.println("Enter the first symbol for the staircase:");
             char smb1 = batu.next().charAt(0);   
            System.out.println("Enter the second symbol for the staircase: ");
            char smb2 = batu.next().charAt(0);
            System.out.println("patterm:");
           int a=1;
           int b;
           int c=0;
            while(a<=step){
              b=a;
              c=7-a;
             
              while(b>0){
                  System.out.print(smb1);
                  b--;
              }
               while(c>0){
                  System.out.print(smb2);
                  c--;
              }
                System.out.println();
                a++;
            }
    }
    
}
