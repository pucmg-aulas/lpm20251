/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.statics;

/**
 *
 * @author danil
 */
public class App {
    
    
    
    public static void main(String[] args) {
        
        Aluno aluno0 = new Aluno("Fulano", 20);
        Aluno aluno1 = new Aluno("Danilo", 10);
        Aluno aluno2 = new Aluno("Maria",  10);
        Aluno aluno3 = new Aluno("Carlos",  10);
        Aluno aluno4 = new Aluno("Claudia",  10);
        
        aluno3.getNotaMinimaAprovacao();
        
        Aluno.imprimirAluno(aluno3);
        
    }
    
}
