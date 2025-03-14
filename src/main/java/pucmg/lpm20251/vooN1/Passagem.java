/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.vooN1;

/**
 *
 * @author danil
 */
public class Passagem {
    
    private Passageiro passageiro;
    private int numeroCadeira;
    private double volumeBagagem;

    public Passagem(Passageiro passageiro, int numeroCadeira, double volumeBagagem) {
        this.passageiro = passageiro;
        this.numeroCadeira = numeroCadeira;
        this.volumeBagagem = volumeBagagem;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public int getNumeroCadeira() {
        return numeroCadeira;
    }

    public double getVolumeBagagem() {
        return volumeBagagem;
    }

    @Override
    public String toString() {
        return passageiro + " - " + numeroCadeira + " - " + volumeBagagem;
    }
    
    
    
}
