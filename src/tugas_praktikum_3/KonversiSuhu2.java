/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_3;

/**
 *
 * @author dafae
 */
public class KonversiSuhu2 extends KonversiSuhu{
    
    double fahrenheitToReamur(double f){
        rumus = 0.44444444444444444444444444444444 * (f - 32);
        System.out.println("Fahrenheit -> Reamur = " + rumus + " R");
        return rumus;
    }
}
