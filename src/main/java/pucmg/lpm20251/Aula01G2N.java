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
public class Aula01G2N {
    
    public static int lerNumero(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        return s.nextInt();
    }
    
    public static int multiplicar(int a, int b){
        if(a > 0 && b >0)
            return a*b;
        else
            return -1;
    }
    
    public static void main(String[] args) {
        
     
        int base = lerNumero();
        System.out.println("O valor digitado foi de " + base);

        int exp = lerNumero();
        System.out.println("O valor digitado foi de " + exp);
        
        double res = Math.pow(base, exp);
        System.out.println("O resultado é " + res);
        
        int a = lerNumero();
        int b = lerNumero();
        
        res = multiplicar(a, b);
        System.out.println("O resultado da multiplicação é " + res); 
    }
    
}
