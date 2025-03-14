/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02.VooN2;

import java.time.LocalDateTime;

/**
 *
 * @author danil
 */
public class Voo {

    private int numero;
    private LocalDateTime horarioPartida;
    private LocalDateTime horarioChegada;
    private Aeroporto localPartida;
    private Aeroporto localChegada;
    private Piloto piloto;
    private Piloto copiloto;
    private Passagem[] passagens;
    private int MAX_PASSAGENS;
    private int passagensVendidas;

    public Voo(int numero, LocalDateTime horarioPartida, LocalDateTime horarioChegada, Aeroporto localPartida, Aeroporto localChegada) {
        this.numero = numero;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.MAX_PASSAGENS = 250;
        this.passagensVendidas = 0;
        this.passagens = new Passagem[MAX_PASSAGENS];
    }

    public void addPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void addCopiloto(Piloto copiloto) {
        this.copiloto = copiloto;
    }

    public void registrarPassagem(Passagem passagem) {
        if (this.passagensVendidas < this.MAX_PASSAGENS) {
            this.passagens[this.passagensVendidas] = passagem;
            this.passagensVendidas++;
        }
    }

}
