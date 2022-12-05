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
public class Penyanyi {
public class penyanyi extends pop {
    public static void main(String[]args){
        Pop pop = new Pop ("Blackpink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Benruk Cinta");
        pop.cetakLabel();
        
        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;
        dangdut.song("Via Vallen", "Kopi Dangdut");
        dangdut.cetakLabel();
   }
}

}
