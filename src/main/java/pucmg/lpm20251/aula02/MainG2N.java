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
public class MainG2N {

    public static int lerNumeroInteiro(String mensagem) {
        System.out.println(mensagem);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static int[][] lerMatriz(int linhas, int colunas) {
        int[][] m = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                m[i][j] = lerNumeroInteiro("Entre com o termo a" +(i+1)+(j+1)+ " da matriz:");
            }
        }
        return m;
    }

    public static void main(String[] args) {

        Matriz_G2N matriz = new Matriz_G2N();

        int linhas = lerNumeroInteiro("Digite o Número de Linhas da Matriz: ");
        int colunas = lerNumeroInteiro("Digite o Número de Colunas da Matriz: ");

        matriz.criarMatriz(linhas, colunas);
        matriz.preencherMatriz(lerMatriz(linhas, colunas));
        System.out.println(matriz.imprimirMatriz());
        
        //matriz.multiplicarPorConstante(3);
        //System.out.println(matriz.imprimirMatriz());
        
        Matriz_G2N m2 = new Matriz_G2N();
        m2.criarMatriz(linhas, colunas);
        m2.preencherMatriz(matriz.multiplicarPorConstante(3));
        System.out.println(m2.imprimirMatriz());
        
        
    }

}
