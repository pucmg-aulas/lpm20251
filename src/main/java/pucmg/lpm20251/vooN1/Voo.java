/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.vooN1;

import java.time.LocalDateTime;

/**
 *
 * @author danil
 */
public class Voo {
    
    private int numero;
    private LocalDateTime horaPartida;
    private LocalDateTime horaChegada;
    private Cidade localPartida;
    private Cidade localDestino;
    private Piloto piloto;
    private Piloto copiloto;
    private Passagem[] passagens;
    private int MAX_PASSAGENS = 250;
    private int passagensVendidas;

    public Voo(int numero, LocalDateTime horaPartida, LocalDateTime horaChegada, Cidade localPartida, Cidade localDestino) {
        this.numero = numero;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.localPartida = localPartida;
        this.localDestino = localDestino;
        this.passagens = new Passagem[MAX_PASSAGENS];
        this.passagensVendidas = 0;
    }
    
    public void addPiloto(Piloto piloto){
        this.piloto = piloto;
    }
    
    public void addCopiloto(Piloto copiloto){
        this.copiloto = copiloto;
    }
    
    public String registrarPassagem(Passagem passagem){
        if(passagensVendidas < MAX_PASSAGENS){
            this.passagens[this.passagensVendidas] = passagem;
            return "Passagem registrada!";
        }else
            return "Passagens esgotadas!";
 
    }
    
}
