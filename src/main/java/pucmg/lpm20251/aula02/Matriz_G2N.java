/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02;

/**
 *
 * @author danil
 */
public class Matriz_G2N {

    private int linhas;
    private int colunas;
    private int[][] matriz;

    public void criarMatriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    public void preencherMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[][] multiplicarPorConstante(int c) {
        int[][] m = new int[this.linhas][this.colunas];

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                m[i][j] = this.matriz[i][j] * c;
            }
        }

        return m;
    }

    public String imprimirMatriz() {
        String print = "";

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                print += matriz[i][j] + " ";
            }
            print += "\n";
        }
        return print;
    }

}
