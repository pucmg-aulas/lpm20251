/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02.VooN2;

/**
 *
 * @author danil
 */
public class Cidade {
    
    private String nome;
    private String estado;
    private String pais;

    public Cidade(String nome, String estado, String pais) {
        this.nome = nome;
        this.estado = estado;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return nome + " - " + estado + " - " + pais;
    }
    
    
    
}
