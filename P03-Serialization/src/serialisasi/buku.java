/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class buku implements Serializable {
    private final String penerbit = "PT Gramedia"; // contoh buat keyword final
    private String tahunterbit; 
    private transient String kodebuku; //contoh buat keyword transient
    
    public buku(String penerbit, String tahunterbit, String kodebuku){
       
        this.tahunterbit = tahunterbit;
        this.kodebuku = kodebuku;
    }
    
    @Override
    public String toString() {
        return "\r\npenerbit=" + penerbit + "\r\ntahun terbit =" + tahunterbit + "\r\nkode buku =" + kodebuku + "\r\n";
    }
    
}
