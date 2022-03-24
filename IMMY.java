

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kawi;

import java.util.Scanner;

/**
 *
 * @author MY PC
 */
public class IMMY {
public static void main (String[]args){
            System.out.println("welcome to xyz bank");
            System.out.println("choose from the following accounts");
            System.out.println("1. Regular account"); 
             System.out.println("2. Interest account");
             System.out.println("3. Checking account");
              System.out.println("4. CD account");
              Scanner scan =new Scanner(System.in);
              System.out.println("ENTER THE PIN");
              int pin= scan.nextInt();
              switch(pin){
                  case 1:
                      System.out.println("charges of 10% of the balance at the end of the month\n no interest\n penalty of 10.00 when the balance goes below of 50,000.00");
                      break;
                  case 2:
             System.out.println("charges of 10% of the balance at the end of month\n interest of 7% paid monthly\n no minimum balance");
             break;
                  case 3:
             System.out.println("charges of 10% of the balance at the end of month\n annual interest of 7%\n penalty of 10.00 when balance goes below 10,000.00\n charges of 0.10 on every transaction");
             break;
                  case 4:
              System.out.println("charges of 10% of the balance at the end of month\n annual interest of 15%\n no minimum balance\n penalty of 20% of current balance if you withdraw before 12 months");
              break;
                  default:
                      System.out.println("WRONG PIN");
                      main(null);
                      break;
              }
              
            
}

}
Thank you
