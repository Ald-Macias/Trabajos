/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroentero;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class NumeroEntero {
    public static boolean esPrimo(int numero) {
        if (numero <= 1){
            return false;
        }
        if (numero == 2){
            return true;
        }    
        if (numero % 2 == 0){
            return false;
        }
        for (int i=3; i<=Math.sqrt(numero);i+=2){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa un numero Entero: ");
        int numero = teclado.nextInt();
        
        if (esPrimo(numero)){
            System.out.println("El numero "+ numero + "es primo.");
        }else{
                System.out.println("El numero "+ numero + "no es primo-"); 
        }
        
        teclado.close();
    }
}
