/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class Palindromo {
    public static boolean Polindromo(String texto){
        texto = texto.toLowerCase();
        
        String Invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(Invertido);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un texto");
        String texto = teclado.nextLine();
        
        if(Polindromo(texto)){
            System.out.println("Es una palabra palindromo");
        }else{
            System.out.println("No es una palabra palindromo");
        }
        teclado.close();
    }
}
