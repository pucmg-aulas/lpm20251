/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.statics;

/**
 *
 * @author danil
 */
public class Aluno {
    
    private String nome;
    private int matricula;
    private static int proxMatricula;
    private int codCurso;
    private double[] notas;
    private static final int NUM_AVALIACOES;
    private int avRegistradas;
    public static final int NOTA_MINIMA;
    
    static{
        proxMatricula = 1;
        NUM_AVALIACOES = 6;
        NOTA_MINIMA = 60;
    }

    public Aluno(String nome, int codCurso) {
        this.nome = nome;
        this.matricula = getProxMatricula() ;
        this.codCurso = codCurso;
        this.avRegistradas = 0;
        //this.notas = notas;
    }
    
    public int getNotaMinimaAprovacao(){
        return NOTA_MINIMA;
    }
    
    private int getProxMatricula(){
        return proxMatricula++;
    }
    
    public void lancarNota(double nota){
        this.notas[this.avRegistradas] = nota;
        this.avRegistradas++;
        
    }
    
    public double notaFinal(){
        double notaFinal = 0;
        for (double nota : notas) {
            notaFinal+= nota;
        }
        return notaFinal;
    }
    
    public boolean isAprovado(){
        return notaFinal() >= NOTA_MINIMA;
    }
    
    public static void imprimirAluno(Aluno a){
        
        System.out.println("Nome: " + a.nome + "\nCódigo do Curso: " + a.codCurso);
    }
    
}
