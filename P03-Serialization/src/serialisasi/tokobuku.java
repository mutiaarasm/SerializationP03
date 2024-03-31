/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class tokobuku implements Serializable{
    private String id;
    private String judul;
    private List<buku> books;
    
    public void setId(String id){
        this.id =id;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public List<buku> getBooks() {
        return books;
    }
    public void setBooks(List<buku> books){
        this.books = books;
    }
    
    @Override
    public String toString(){
        String buku, orang = "";
        buku = "Toko Buku : \r\n"
                + "id = " + id + "\r\n"
                +"judul=" + judul + "\r\n"
                + "=========================\r\n"
                + "Detail:\r\n";
        orang = books.stream().map((obj)->
    obj.toString()).reduce(orang, String::concat);
        return buku + orang;
    }
    
}
