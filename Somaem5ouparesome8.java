/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprojeto1;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Somaem5ouparesome8 {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); 
       int a;
       
       System.out.print("Insira o valor: ");
       Scanner abs = new Scanner (System.in);
       a = abs.nextInt();

           if (a%2==0) a+=5;

           else a+=8;

       System.out.println(a);
    }
    
}
