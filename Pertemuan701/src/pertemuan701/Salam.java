/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author SILVIA DIAN LESTARI
 * TGL 09 MEI 2025
 */
public class Salam {
    String tx ="hello good morning";
    
    public void tulisPesan(){
        System.out.println(this.tx);
    }
    public void tulisPesan(String txt1){
        System.out.println(txt1);
    }
    public void tulisPesan(String pesan, String telpon){
        System.out.println("Pesan yang masuk adalah: " + pesan + ", Telepon yang tidak terjawab: " +telpon);    }
}
