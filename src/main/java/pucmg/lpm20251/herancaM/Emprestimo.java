/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.herancaM;

/**
 *
 * @author danil
 */
public class Emprestimo extends Servico{
    
    private double valor;
    private double taxaJuros;
    
    public Emprestimo(String cliente, String funcionario, String dataContartacao, double valor, double taxaJuros){
       super(cliente,funcionario,dataContartacao); 
       this.valor = valor;
       this.taxaJuros = taxaJuros;
    }
}
