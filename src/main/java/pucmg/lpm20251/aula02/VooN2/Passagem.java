/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02.VooN2;

/**
 *
 * @author danil
 */
public class Passagem {
    
    private Passageiro passageiro;
    private int poltrona;
    private double volumeBagagem;

    public Passagem(Passageiro passageiro, int poltrona, double volumeBagagem) {
        this.passageiro = passageiro;
        this.poltrona = poltrona;
        this.volumeBagagem = volumeBagagem;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public double getVolumeBagagem() {
        return volumeBagagem;
    }

    @Override
    public String toString() {
        return passageiro.getNome() + " - " + poltrona + " - " + volumeBagagem;
    }
    
    
    
}
