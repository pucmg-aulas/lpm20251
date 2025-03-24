/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaN;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        Servico s = new Emprestimo("Tal", "Fulano", "2345678", 100000.0, 0.12);
        
        Emprestimo e = new Emprestimo("Qual", "Fulano", "2345678", 100000.0, 0.12);
        
       
        e.fazQualquerCoisa();
        
        System.out.println("");
        
    }
}
