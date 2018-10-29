/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan62.livinngthing;

/**
 *
 * @author 
 * Nama         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * Kelas        : PBO 3
 * Deskripsi    : Program ini berisi program untuk menampilkan kegiatan kita 
 * sebagai manusia
 */
public class PBO310117096Latihan62LivinngThing {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Human a = new Human();
        a.setNama("Miftah Muhammad Sidqi");
        a.walk(a.getNama());
        a.breath(a.getNama());
        a.eat(a.getNama());
        
    }
    
}
