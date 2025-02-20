/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251;

import java.util.Scanner;

/**
 *
 * @author danil
 */
public class Aula01G2M {

    public static int multiplicaAB(int a, int b) {
        return a * b;
    }

    public static int lerNumero() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        return s.nextInt();
    }

    public static void main(String[] args) {

        int a = lerNumero();
        int b = lerNumero();

        System.out.println("Numero digitado: " + a);
        System.out.println("Numero digitado: " + b);

        int res = multiplicaAB(a, b);
        System.out.println("Resultado da Multiplicação é: " + res);

        int c = lerNumero();
        
        int d = lerNumero();

        res = multiplicaAB(c, d);
        System.out.println("Resultado da Multiplicação é: " + res);
        
        int e = lerNumero();
        res = multiplicaAB(res, e);
        System.out.println("Resultado da Multiplicação é: " + res);
        
        

    }

}
