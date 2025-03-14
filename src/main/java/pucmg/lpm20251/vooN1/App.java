/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.vooN1;

import java.util.ArrayList;

/**
 *
 * @author danil
 */
public class App {
    
    private static ArrayList<Piloto> pilotos =  new ArrayList<>();
    private static ArrayList<Cidade> cidades =  new ArrayList<>();;
    private static ArrayList<Voo> voos =  new ArrayList<>();;
    private static ArrayList<Passageiro> passageiros =  new ArrayList<>();;
    
    public static void main(String[] args) {
        
        
        Passageiro p = new Passageiro("Danilo", "1234", "(31)99999-9999", "Rua X, Numero 3...");
        passageiros.add(p);
        
        
    }
    
}
