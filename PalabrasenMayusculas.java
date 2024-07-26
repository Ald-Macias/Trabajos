/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palabrasenmayusculas;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class PalabrasenMayusculas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true){
            
            System.out.print("Ingrese una palabra(espacio blanco termina): ");
            String input = teclado.nextLine();
            
            if(input.trim().isEmpty()){
                break;
            }
            String Mayusculas = input.toUpperCase();
            System.out.println("Texto en palabras mayusculas" + Mayusculas);
        }
        teclado.close();
    }
}
