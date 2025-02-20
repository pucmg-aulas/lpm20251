/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02;

/**
 *
 * @author danil
 */
public class Matriz_G2M {

    private int linhas;
    private int colunas;
    private int[][] matriz;

    //criarMatriz
    public void criarMatriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }
    // preencherMatriz 
    public void preencherMatriz(int[][] matriz){
        this.matriz = matriz;
    }
    
    // imprimirMatriz
    public String imprimirMatriz() {
        String print = "";
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                print = print + matriz[i][j] + " ";
            }
            print = print + "\n";
        }
        return print;
    }

    //multiplicarCopiaMatrizPorContante
    public int[][] multiplicarCopiaMatrizPorContante(int c){
        int[][] matrizCopia = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizCopia[i][j] = c * matriz[i][j];
            }
        }
        return matrizCopia;
    }
}
