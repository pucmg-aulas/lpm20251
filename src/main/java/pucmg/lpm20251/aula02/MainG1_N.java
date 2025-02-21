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
public class MainG1_N {

    public static int lerNumeroInteiro(String mensagem) {
        System.out.println(mensagem);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static int[][] lerMatriz(int linhas, int colunas) {
        int[][] m = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                m[i][j] = lerNumeroInteiro("Digite o termo " + i + j);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Matriz_G1N m1 = new Matriz_G1N();

        int linhas = lerNumeroInteiro("Digite o número de linhas da matriz: ");
        int colunas = lerNumeroInteiro("Digite o número de colunas da matriz: ");

        m1.criarMatriz(linhas, colunas);
        m1.preencherMatriz(lerMatriz(linhas, colunas));
        System.out.println(m1.imprimirMatriz());

        int[][] m2 = m1.multiplicarCopiaMatrizPorConstante(2);
        Matriz_G1N m3 = new Matriz_G1N();
        m3.criarMatriz(linhas, colunas);
        m3.preencherMatriz(m2);
        
        System.out.println(m3.imprimirMatriz());

    }

}
