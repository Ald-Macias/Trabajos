/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroenterosconmaximocomundivisor;
import java.util.Scanner;
/**
 *
 * @author macia
 */
public class Numeroenterosconmaximocomundivisor {
    public static int MCD(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = teclado.nextInt();
        
        int mcd = MCD(num1, num2);
        
        System.out.println("El Maximo Comun Divisor de "+ num1 + "y" + num2 + "es" + mcd);
        
        teclado.close();
    }
}
