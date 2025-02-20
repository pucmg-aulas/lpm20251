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
public class MainG2 {

    public static int lerNumeroInteiro(String mensagem) {
        System.out.println(mensagem);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static int[][] lerMatriz(int lin, int col) {
        int[][] matriz = new int[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = lerNumeroInteiro("DIgite o termo " + i + " " + j + " da matriz: ");
            }
        }
        return matriz;
    }

    public static void main(String[] args) {

        Matriz_G2M matriz = new Matriz_G2M();

        int linhas = lerNumeroInteiro("Digite o numero de linhas da Matriz: ");
        int colunas = lerNumeroInteiro("Digite o numero de colunas da Matriz: ");

        matriz.criarMatriz(linhas, colunas);
        matriz.preencherMatriz(lerMatriz(linhas, colunas));

        System.out.println(matriz.imprimirMatriz());

        int[][] m2 = matriz.multiplicarCopiaMatrizPorContante(3);

        
        Matriz_G2M m1 = new Matriz_G2M();
        m1.criarMatriz(linhas, colunas);
        m1.preencherMatriz(m2);
        m1.imprimirMatriz();
    }

}
