/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.data;

/**
 *
 * @author danil
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    private void init(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        if(!dataValida()){
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    public Data() {
        init(1, 1, 1900);
    }

    public Data(int dia, int mes, int ano) {
        init(dia, mes, ano);
    }
    
    public Data(int dia, int mes){
        init(dia, mes, 2025);
    }

    public void setData(int dia, int mes, int ano) {
        init(dia, mes, ano);
    }

    public boolean dataValida() {
        int[] mes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (this.ano < 0) {
            return false;
        }

        if (this.mes < 1 || this.mes > 12) {
            return false;
        }

        if (anoBissexto()) {
            mes[1] = 29;
        }

        if (this.dia <= 0 && this.dia > mes[this.mes - 1]) {
            return false;
        }

        return true;
    }

    //TODO:
    public boolean anoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String dataFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
   
    
}
