/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02.VooN2;

/**
 *
 * @author danil
 */
public class Passageiro {
    
    private String nome;
    private String rg;
    private String telefone;
    private String endereco;

    public Passageiro(String nome, String rg, String telefone, String endereco) {
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return nome + " - " + rg + " - " + telefone + " - " + endereco;
    }
    
    
    
}
