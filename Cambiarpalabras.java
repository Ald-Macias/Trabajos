/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cambiarpalabras;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class Cambiarpalabras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        String texto = teclado.nextLine();
        
        System.out.print("Ingrese un caracter que quiera cambiar: ");
        char palabraInicial = teclado.nextLine().charAt(0);
        
        System.out.print("Ingrese el nuevo caracter: ");
        char nuevaPalabra = teclado.nextLine().charAt(0);
        
        String Modificacion = texto.replace(palabraInicial, nuevaPalabra);
        System.out.println("Caracter Modificado: " + Modificacion);
        
        teclado.close();
    }
}
