/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.aula02.VooN2;

import java.util.ArrayList;

/**
 *
 * @author danil
 */
public class Application {
    
    private static ArrayList<Passageiro> passageiros = new ArrayList<>();
    private static ArrayList<Piloto> pilotos = new ArrayList<>();
    private static ArrayList<Voo> voos = new ArrayList<>();
    private static ArrayList<Aeroporto> aeroportos = new ArrayList<>();
    private static ArrayList<Cidade> cidades = new ArrayList<>();
    
    
    public static void main(String[] args) {
        
    }
    
    public static void venderPassagem(){
        //ler do teclado
        String nomePassageiro;
        int poltrona;
        int volumeBagagem;
        
        Passageiro p = buscarPassageiroByNome(nomePassageiro);
        
        Passagem pass = new Passagem(p, poltrona, volumeBagagem);
    }
    
    public static Passageiro buscarPassageiroByNome(String nome){
        for (Passageiro p : passageiros) {
            if(p.getNome().equalsIgnoreCase(nome))
                return p;
        }
        return null;
    }
    
    public static void cadastrarPassageiro(){
        
    }
    
}
