/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aulaTestesN;

/**
 *
 * @author danil
 */
public class ContaCorrente {

    private double saldo;

    public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
        }

    }

    public String sacar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            return "Saque de " + valor + " efetuado com sucesso!";
        }
        return "Saldo Insuficiente!";

    }

    public double consultarSaldo() {
        return this.saldo;
    }

}
