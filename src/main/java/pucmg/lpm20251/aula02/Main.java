/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02;

import java.util.Scanner;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int linhas, colunas;
        System.out.println("Digite o Número de Linhas:");
        linhas = s.nextInt();
        
        System.out.println("Digite o Número de Colunas:");
        colunas =  s.nextInt();
        
        Matriz_G1M matriz = new Matriz_G1M();
        
        matriz.inicializarMatriz(linhas, colunas);
        
        matriz.lerDadosMatriz();
        
        matriz.imprimeMatriz();
        
        matriz.multiplicaPorConstante(3);
        
        
    }
    
}
