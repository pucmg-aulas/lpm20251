/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.lpm20251.data;

/**
 *
 * @author danil
 */
public class MainN {

    public static void main(String[] args) {

        DataN data1 = new DataN(29, 2, 2025);
        System.out.println(data1.dataFormatada());
        System.out.println(data1.anoBissexto());

        DataN data2 = new DataN(30, 1);
        System.out.println(data2.dataFormatada());
        System.out.println(data2.anoBissexto());
        
        DataN data3 = new DataN();
        System.out.println(data3.dataFormatada());
        System.out.println(data3.anoBissexto());
        

        //data1.ajustarData(29, 02, -1000);
        //System.out.println(data1.dataFormatada());
        //System.out.println(data1.dataValida());

    }

}
