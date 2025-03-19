/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ContaCorrente;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import pucmg.lpm20251.aulaTestesN.ContaCorrente;

/**
 *
 * @author danil
 */
public class ContaCorrenteTesteM {
    
    public ContaCorrenteTesteM() {
    }
    
    @Test
    public void sacarComSaldoSuficiente(){
        
        double valorSaque = 100.0;
        double valorSaldoEsperado = 100.0;
        double valorSaldoInicial = 200.0;
        
        ContaCorrente cc = new ContaCorrente();    
        cc.depositar(valorSaldoInicial);
        cc.sacar(valorSaque);
        
        assertEquals(valorSaldoEsperado,cc.consultarSaldo(), 0.001);
        
    }
    
    @Test
    public void sacarComSaldoINSuficiente(){
        
        double valorSaque = 300.0;
        //double valorSaldoEsperado = -100.0;
        double valorSaldoInicial = 200.0;
        
        ContaCorrente cc = new ContaCorrente();    
        cc.depositar(valorSaldoInicial);
       
        
        assertEquals("Saldo Insuficiente!",cc.sacar(valorSaque));
        
    }
    
}
