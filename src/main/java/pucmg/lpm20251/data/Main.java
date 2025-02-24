/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.data;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        Data d = new Data(29,2,2025);
        
        Data d1 = new Data();
        
        //d1.setData(29, 2, 2025);
        System.out.println(d.dataFormatada());
        System.out.println(d1.dataFormatada());
        
        System.gc();
        
    }
    
}
