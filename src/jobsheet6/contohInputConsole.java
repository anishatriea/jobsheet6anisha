/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;
import java.io.Console;
public class contohInputConsole {
    public static void main(String[] args){
        String nama;
        int usia;
        String alamat;
        //membuat objek console
        Console con =System.console();
        // mengisi variabel nama usia alamat dengan console
        System.out.print("inputkan nama anda :");
        nama = con.readLine();
        System.out.print("inputkan Usia ;");
        usia = Integer.parseInt(con.readLine());
        System.out.print("inputkan alamat anda :");
        alamat= con.readLine();
        //menampilkan isi vataibel nama usia dan alamat
        System.out.println("nama kamu adalah: " +nama);
        System.out.println("saat ini berusia" +usia+"tahun");
        System.out.println("alamat kamu berada di: "+ alamat);
        
        
        
        
        
     
        
    }

}
