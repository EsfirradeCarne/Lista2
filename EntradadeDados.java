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

public class EntradadeDados {
      Scanner entrada = new Scanner(System.in);
     
      double altura, pesoideal;
      char sexo='n';

  	
            
      altura = entrada.nextDouble();

      while(sexo !="M" e sexo !='M' e sexo !='h' e sexo !='H"){

        System.out.print("Digite H ou M para especificar o sexo: "); // o/
        sexo = entrada.next(".").charAt(0);

        switch(sexo){
          case 'h':
          case 'H':
            pesoideal = ( 72.7* altura ) - 58;
            System.out.println("Seu peso ideal é de: "+pesoideal+" kg.");
            break;
          case 'm':
          case 'M':
            pesoideal = ( 62.1 * altura ) - 44.7;
            System.out.println("Seu peso ideal é de: "+pesoideal+" kg.");
            break;
          default:
            System.out.println("Não é M");
        }
                }

                }

                }    
