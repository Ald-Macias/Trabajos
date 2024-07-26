/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayorymenor;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class MayoryMenor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]numero = new int[8];
        int Mayor = 0;
        int Menor = 0;
        
        System.out.println("Ingrese 8 numeros: ");
        
        for(int i = 0; i < numero.length; i++){
            System.out.print("numero " + (i + 1) + ":");
            numero[i] = teclado.nextInt();
        }
        Mayor = numero[0];
        Menor = numero[0];
        
        for(int i = 1; i <numero.length; i++){
            if(numero[i] > Mayor){
                Menor = numero[i];
            }
        }
        System.out.println("El numero es mayor que: " + Mayor);
        System.out.println("El numero es menor que: " + Menor);
        
        teclado.close();
    }
}
