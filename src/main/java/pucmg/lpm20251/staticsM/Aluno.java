/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.staticsM;

/**
 *
 * @author danil
 */
public class Aluno {
    
    private int matricula;
    private static int proxMatricula;
    
    private int codCurso;
    private String nome;
    private double[] notas;
    
    private final static int NUMERO_AVALIACOES;
    private final static double NOTA_MINIMA;
    
    static{
        proxMatricula = 1;
        NUMERO_AVALIACOES = 6;
        NOTA_MINIMA = 60.0;
    }
    
    public Aluno(String nome, int codCurso){
        this.nome = nome;
        this.codCurso = codCurso;
        this.matricula = getProxMatricula();
        this.notas = new double[NUMERO_AVALIACOES];
        
    }
    
    private int getProxMatricula(){
        return proxMatricula++;
    }
    
    public void registrarAvaliacao(int numero, double nota){  
        this.notas[numero] = nota;
    }
    
    public static void fazQualquerCoisa(){
        System.out.println(NUMERO_AVALIACOES);
    }
}
