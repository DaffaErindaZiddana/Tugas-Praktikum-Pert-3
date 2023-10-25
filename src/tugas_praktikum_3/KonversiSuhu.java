/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_3;

/**
 *
 * @author dafae
 */
public class KonversiSuhu {
    double rumus;
    
    double celciusToFahrenheit(double c){
       rumus = (1.8 * c) + 32;
       System.out.println("Celcius -> Fahrenheit = " + rumus + " F");
       return rumus;
    }
    
    double celciusToReamur(double c){
       rumus = 0.8 * c;
       System.out.println("Celcius -> Reamur = " + rumus + " R");
       return rumus;
    }

   
}
