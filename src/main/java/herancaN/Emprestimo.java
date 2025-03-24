/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaN;

/**
 *
 * @author danil
 */
public class Emprestimo extends Servico {
    
    
    private double valor;
    private double taxa;
    
    public Emprestimo(String cliente, String funcionario, String dataContratacao, double valor, double taxa){
        super(cliente, funcionario, dataContratacao);
        this.valor = valor;
        this.taxa = taxa;
    }
    
    public void fazQualquerCoisa(){

        super.getDataContratacao();
            }
    
}
