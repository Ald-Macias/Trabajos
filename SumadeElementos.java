/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumadeelementos;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class SumadeElementos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]numeros = new int[5];
        int suma = 0;
        
        System.out.println("Ingrese 5 numeros: ");
        
        for(int i = 0; i < numeros.length; i++){
        System.out.print("Numero " + (i + 1) + ":");
        numeros[i] = teclado.nextInt();
    }
    
    for(int numero : numeros){
        suma += numero;
    }
    System.out.println("La suma de todos los numeros es: " + suma);
    
    teclado.close();
            
        
        
                
        
    }
}
