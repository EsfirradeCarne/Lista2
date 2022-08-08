/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author labinfo
 */

import java.util.Scanner;

public class algoritmosdeabc {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Insira o valor de A");
        a = sc.nextDouble();

        System.out.println("Insira o valor de B");
        b = sc.nextDouble();

        System.out.println("Insira o valor de C");
        c = sc.nextDouble();

        if ((a + b) > c) {
            System.out.println("A soma de A e B é MAIOR que C");
        } else {
            System.out.println("A soma de A e B é MENOR que C");
        }
    }
}

