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

public class EstadoCivil {
    public static void main (String[] args){

        Scanner leituraNome = new Scanner(System.in);
        
        String nome = leituraNome.nextLine();
        
        System.out.println("Informe o nome: ");

        Scanner leituraSexo = new Scanner(System.in);
        System.out.println("Qual o seu sexo? Masculino ou Feminino? ");

        String sexo = leituraSexo.nextLine();

        Scanner leituraEstadoCivil = new Scanner(System.in);
        System.out.println("Seu estado civil: Casada (C) ou Solteira (S)? ");

        String estadoCivil = leituraEstadoCivil.nextLine();
        // int respostaEstadoCivil = Integer.parseInt(estadoCivil);

        if(sexo.equals("F") && estadoCivil.equals("C")){
            Scanner leituraTempo = new Scanner(System.in);
            System.out.println("Quantos anos casada? ");

            String casada = leituraTempo.nextLine();
            int anosCasada = Integer.parseInt(casada);

            System.out.println("Voce esta casada a " + anosCasada);
        }
    }
}
