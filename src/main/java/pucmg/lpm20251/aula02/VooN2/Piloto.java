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
public class Piloto {
    
    private String nome;
    private int numeroRegistro;
    private LocalDateTime dataValidadeRegistro;

    public Piloto(String nome, int numeroRegistro, LocalDateTime dataValidadeRegistro) {
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.dataValidadeRegistro = dataValidadeRegistro;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public LocalDateTime getDataValidadeRegistro() {
        return dataValidadeRegistro;
    }
    
    public void alterarDataValidadeRegistro(LocalDateTime dataValidadeRegistro){
        this.dataValidadeRegistro = dataValidadeRegistro;
    }
    
}
