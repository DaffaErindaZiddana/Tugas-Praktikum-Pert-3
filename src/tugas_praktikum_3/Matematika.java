/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum_3;

/**
 *
 * @author dafae
 */
public class Matematika {
     public int pertambahan(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
    
  
    public int pengurangan(int a, int b){
        int hasil = a - b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
    
   
    public int perkalian(int a, int b){
        int hasil = a * b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
    
    
    public int pembagian(int a, int b){
        int hasil = a / b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
    
    public int modulus(int a, int b){
        int hasil = a % b;
        System.out.println("Hasil : " + hasil);
        return hasil;
    }
}
