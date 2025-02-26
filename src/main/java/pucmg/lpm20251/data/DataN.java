/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.data;

/**
 *
 * @author danil
 */
public class DataN {

    private int dia;
    private int mes;
    private int ano;

    public DataN(int dia, int mes, int ano) {
        init(dia, mes, ano);
    }

    public DataN(int dia, int mes) {
        init(dia, mes, 2025);
    }

    public DataN() {
        init(1, 1, 2005);
    }
    private void init(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!dataValida()) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2005;
        }
        
    }
    public void ajustarData(int dia, int mes, int ano) {
        init(dia, mes, ano);
    }

    public boolean anoBissexto() {
        return (this.ano % 400 == 0) || (this.ano % 100 != 0 && this.ano % 4 == 0);
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

        return !(this.dia < 1 || this.dia > mes[this.mes - 1]);
    }

    public String dataFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

}
