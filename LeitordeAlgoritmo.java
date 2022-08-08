/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprojeto1;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class LeitordeAlgoritmo {

    public static void main(String[] args) {
        Scanner aVal = new Scanner (System.in);

       int a = aVal.nextInt();
       
       System.out.println("Valor de A: ");
       
       System.out.print("Valor de B: ");

       Scanner bVal = new Scanner (System.in);

       int b = bVal.nextInt();

       System.out.print("O valor de C: ");

       Scanner cVal = new Scanner (System.in);

       int c = cVal.nextInt();

       int soma = a+b;

           if (soma>c){

               System.out.println("Soma: "+soma);

               System.out.println("O valor de A+B é maior que C");
           }

           else if (soma<c){
               System.out.println("Soma: "+soma);

               System.out.println("O valor de A+B é menor que C");

           }

           else {

               System.out.println("Soma: "+soma);

               System.out.println("A+B = C");
           
           
           }
           }
}
