/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2u3p5;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class T2U3P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Cmayor = 0;
        int Cmenor = 0;
        int i=1;
        while (i<=10){
            System.out.println("calificacion");
        int cal= sc.nextInt();
            if (cal >=70){
                Cmayor= Cmayor+1;
            }else{
                Cmenor = Cmenor+1;
            } i = i+1;
        }System.out.println("aprobados; "+Cmayor);
        System.out.println("reprobados; "+Cmenor);
    }
}
