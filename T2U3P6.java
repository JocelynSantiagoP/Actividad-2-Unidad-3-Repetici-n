/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2u3p6;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T2U3P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i=1; i<=2; i=i+1){
        System.out.println("captura B");
        double B = sc.nextDouble();
        System.out.println("captura C");
        double C = sc.nextDouble();
        System.out.println("Captura D");
        double D = sc.nextDouble();
        double prom = B+C+D;
        double promedio = prom/3;
        System.out.println("el promedio de alturas es de; "+promedio);
        }
    }
}
