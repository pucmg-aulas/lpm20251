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
public class Matriz_G1M {
    
    int linhas;
    int colunas;
    int[][] matriz;

    public void inicializarMatriz(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
    }
    
    public int[][] multiplicaCopiaMatrizPorConstante(int c){
        
        int[][] result = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                result[i][j] = matriz[i][j] * c;
            }
        }
        return result;
    }
    
    public void multiplicaPorConstante(int c){
                
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = matriz[i][j] * c;
            }
        }
    }
    
    //TODO: propor um método pra fazer multiplicação entre matrizes... casa
    public void multiplicacaoDeMatrizes(){};
    
    //TODO
    public int[][] copiarMatriz(){
        int[][] copia = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                copia[i][j] = matriz[i][j];
            }
        }
        return copia;
    }
    
    //TODO
    public void lerDadosMatriz(){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = s.nextInt();
            }
        }
    }
    
    public void imprimeMatriz(){
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
