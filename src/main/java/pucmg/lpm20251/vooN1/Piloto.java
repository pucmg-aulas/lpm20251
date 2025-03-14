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
public class Piloto {
    
    private String nome;
    private int numeroRegistro;
    private LocalDateTime dataValidadeRegistro;

    public Piloto(String nome, int numeroRegistro, LocalDateTime dataValidadeRegistro) {
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.dataValidadeRegistro = dataValidadeRegistro;
    }
    
    public void atualizarValidadeRegistro(LocalDateTime novaData){
        this.dataValidadeRegistro = novaData;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nNumero Registro: " + numeroRegistro + "\n Data de Validade do Registro: " + dataValidadeRegistro ;
    }
    
    
}
