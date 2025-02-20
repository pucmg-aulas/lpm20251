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
public class Aula01G1M {
    
    public static int soma(int a, int b){
        return a+b;
    }
    
    public static int leNumero(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero desejado:");
        return s.nextInt();
    }
    
    public static void main(String[] args) {
        
        int a = leNumero();
        int b = leNumero();
        int res = soma(a, b);
        System.out.println("O resultado da soma é: ");
        System.out.print(res);
        
    }
    
    
    
}
