/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uts_tib;

/**
 *
 * @author Berlian Dwi Putri
 * kelas TI-B
 * 21104410084
 */
public class pop {
String penyanyi = "Raisa";
    String lagu = "Kali Kedua";
    
    pop(){
        
    }
    
    pop(String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi+"<=>"+this.lagu);
    }
    
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    protected void song(String lagu){
        this.penyanyi = penyanyi;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+"<=>"+this.lagu);
    }
}
