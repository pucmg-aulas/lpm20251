/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ContaCorrente;

import org.junit.Test;
import static org.junit.Assert.*;
import pucmg.lpm20251.aulaTestesN.ContaCorrente;

/**
 *
 * @author danil
 */
public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
    }
    
    @Test
    public void depositarValorNegativoContaCorrente(){
        
        double valorEsperado = 0;
        double valorRetornado;
        
        ContaCorrente c = new ContaCorrente();
        c.depositar(-200);
        
        valorRetornado = c.consultarSaldo();
        
        assertEquals(valorEsperado, valorRetornado, 0.0001);
        
    }
    
    @Test
    public void depositarvalorPositivoContaCorrente(){
        double valorEsperado = 200;
        double valorRetornado;
        
        ContaCorrente c = new ContaCorrente();
        c.depositar(200);
        
        valorRetornado = c.consultarSaldo();
        
        assertEquals(valorEsperado, valorRetornado, 0.0001);
        
    }
    
}
