/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02.VooN2;

/**
 *
 * @author danil
 */
public class Aeroporto {
    
    private String sigla;
    private String nome;
    private Cidade cidade;

    public Aeroporto(String sigla, String nome, Cidade cidade) {
        this.sigla = sigla;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return sigla + " - " + nome + " - " + cidade + '}';
    }
    
    
    
}
