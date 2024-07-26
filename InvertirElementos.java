/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertirelementos;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class InvertirElementos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]numero = new int[6];
        int[]Invertidos = new int[6];
        
        System.out.println("Ingrese 6 numeros: ");
        
        for(int i = 0; i < numero.length; i++){
            System.out.print("Numero " + (i + 1) + ":");
            numero[i] = teclado.nextInt();
        }
        for (int i = 0; i < numero.length; i++){
            Invertidos[i] = numero[numero.length -1 -i];
        }
        System.out.print("Array Invertido: ");
        for (int i = 0; i < Invertidos.length; i++){
            System.out.print(Invertidos[i] + "");
        }
        System.out.println();
        teclado.close();
    }
}
