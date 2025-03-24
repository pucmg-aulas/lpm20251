/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaN;

/**
 *
 * @author danil
 */
public class Servico {
    
    protected String cliente;
    private String funcionario;
    private String dataContratacao;

    public Servico(String cliente, String funcionario, String dataContratacao) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataContratacao = dataContratacao;
    }
    
    
    public String getDataContratacao(){
        return this.dataContratacao;
    }
    
}
