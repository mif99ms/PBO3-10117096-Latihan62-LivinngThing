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
 */
public abstract class LivingThing {
     public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama + " bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " makan");
    }
}
