/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2u3p9;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T2U3P9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Cpar = 0;
        int Cimpar = 0;
        int Cnulo = 0;
        int i = 1;
        while (i <= 6) {
            System.out.println("captura numeros");
            int num = sc.nextInt();
            if (num == 0) {
                Cnulo = Cnulo + 1;
            } else if (num % 2 == 0) {
                Cpar = Cpar + 1;
            } else {
                Cimpar = Cimpar + 1;
            }
            i = i + 1;
        }
        System.out.println("Numeros impares; " + Cimpar);
        System.out.println("Numeros pares; " + Cpar);
        System.out.println("Numeros nulos; " + Cnulo);

    }
}
