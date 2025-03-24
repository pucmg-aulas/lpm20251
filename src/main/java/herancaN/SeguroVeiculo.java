/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaN;

/**
 *
 * @author danil
 */
public class SeguroVeiculo extends Servico{
    
    private String veiculo;
    private double valorSeguro;
    private double franquia;
    
    public SeguroVeiculo(String cliente, String funcionario, String dataContratacao, String veiculo, double valorSeguro, double franquia){
        super(cliente, funcionario, dataContratacao);
        this.veiculo = veiculo;
        this.franquia = franquia;
        this.valorSeguro = valorSeguro;
    }
    
}
