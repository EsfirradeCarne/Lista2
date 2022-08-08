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

public class Leros3ValoresdoTriangulo {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	int a, b, c, maior;
	while (true) {
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();

        if (a == 0 && b == 0 && c == 0)
            break;
	if ((a == b) && (b == c)) {

    System.out.println("a");

}
    maior = a;
	if ((maior * maior) == (b * b) + (c * c)) {
    System.out.println("r");
	break;
}
	if (maior < b)
    maior = b;
	if ((maior * maior) == (a * a) + (c * c)) {
    System.out.println("r");
	break;
			}
	if (maior < c)
    maior = c;
	if ((maior * maior) == (b * b) + (a * a)) {
    System.out.println("r");
        
        break;
			}
		}
	} 
}
