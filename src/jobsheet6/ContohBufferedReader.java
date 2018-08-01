/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author asus
 */
public class ContohBufferedReader {
    public static void main(String [] args) throws IOException {
        String nama;
        // membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        
        //membuat objek bufferreder
        BufferedReader br = new BufferedReader (isr);
        
        //mengisi variabel nama dengan bufferedreader
        System.out.print("inputkan nama :");
        nama = br.readLine();
        
        //tampilkan output isi variabel nama
        System.out.println("nama kamu adalah :" +nama );
        
        
        
        
        
        
    }
}
