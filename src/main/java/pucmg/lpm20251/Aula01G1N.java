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
public class Aula01G1N {

    public static int lerNumero() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        return s.nextInt();
    }

    public static int multiplicar(int a, int b){
        if(a < 0 || b < 0)
            return -1;
        
        return a*b;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = lerNumero();
        int b = lerNumero();

        int res = multiplicar(a, b);
        System.out.println("O resultado da multiplicação é: " + res);

        //Raíz Quadrada de Número
        int c = lerNumero();

        double root = Math.sqrt(c);
        System.out.println("A raíz de " + c + " é " + root);

    }

}
