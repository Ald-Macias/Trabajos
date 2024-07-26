/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imparesypares;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class Imparesypares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numero = new int[10];
        int pares = 0;
        int impares = 0;
        
        System.out.println("Ingrese 10 numeros: ");
        
        for(int i = 0 ; i < numero.length; i++){
            System.out.print("Numero" + (i + 1) + ":" );
            numero[i] = teclado.nextInt();
            
            if(numero[i]%2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        teclado.close();
                
    }
}
