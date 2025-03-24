/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.herancaM;

/**
 *
 * @author danil
 */
public class SeguroVeiculo extends Servico{
    
    private String carro;
    private double valorSegurado;
    private double franquia;

    public SeguroVeiculo(String carro, double valorSegurado, double franquia, String cliente, String funcionario, String dataContartacao) {
        super(cliente, funcionario, dataContartacao);
        this.carro = carro;
        this.valorSegurado = valorSegurado;
        this.franquia = franquia;
    }
    
    
    
}
