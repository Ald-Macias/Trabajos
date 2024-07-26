/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizcuadrada;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class Raizcuadrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero de su agrado: ");
        double numero = teclado.nextDouble();
        
        double cuadrada = Math.sqrt(numero);
        
        System.out.println("La raiz de este numero " + numero + "es: " + cuadrada);
        teclado.close();
    }
} 
