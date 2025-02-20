/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02;

/**
 *
 * @author danil
 */
public class ContaCorrente {
    
    private String titular;
    private double saldo;
    private double limiteCredito;
    
    public void criarConta(String titular, double limiteCredito){
        this.titular = titular;
        this.saldo = 0;
        this.limiteCredito = limiteCredito;
    }
    
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo = valor;
            return true;
        }
        return false;
    }
    
    public String sacar(double valor){
        if(this.saldo + this.limiteCredito >= valor){
            //TODO
            return "Saque efetuado..";
        }
        
        return "Saldo e/ou limite insuficiente";
    }
    
    public String getTitular(){
        return this.titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    
    
    
    
}
