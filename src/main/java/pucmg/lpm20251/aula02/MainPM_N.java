/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02;

/**
 *
 * @author danil
 */
public class MainPM_N {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        
        cc.criarConta("João", 100);
        cc.depositar(3000);
        
        cc.setLimiteCredito(2000);
        
        
    }
    
}
