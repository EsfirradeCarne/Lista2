/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaprojeto1;

/**
 *
 * @author Usuario
 */

import java.util.Locale;
import java.util.Scanner;

public class EncotraroDobro {
    
        public static void main(String[] args) {
            
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
    double a = input.nextDouble();
    double b= 2;
    double c = 3;
    double tripo = a*c;
    double mult = a*b;
    
if(mult>0) {
    
	System.out.println("O número é positivo " + mult);
   }else {
	if(tripo<0) {
	System.out.println("O número é Negativo " + tripo);
	input.close();
	}
    
}
    }
}
