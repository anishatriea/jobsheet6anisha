/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.util.Scanner;
/**
 *
 * @author asus
 */
public class PraktikumAnisha {
    public static void main(String[] args){
        String operator;
        int bilangan1, bilangan2, hasil;
        
        Scanner input =new Scanner (System.in);
        System.out.println("bilangan pertama :");//input bilangan pertama
        bilangan1= input.nextInt();
        System.out.println("bilangan kedua :");//input bilangan kedua
        bilangan2= input.nextInt();
        System.out.println("operator aritmatika :");//input bilangan ketiga
        operator = input.next();
        
        String StringOp = operator;
        
        if(operator.equals("+"))//jika input operator adalah jumlah(+)
        {
            hasil = bilangan1 +bilangan2;//melakukan penjumlahan
            System.out.println("===================");
            System.out.println("hasil operasi :"+hasil);
            
        }
        else if(operator.equals("-"))//input pengurangan (-)
        {
            hasil = bilangan1 - bilangan2;// proses 
            System.out.println("================");
            System.out.println("hasil operasi :"+ hasil );
        }
        else if(operator.equals("*"))// melakuakn proses perkalian
        {
            hasil = bilangan1 - bilangan2;//proses 
            System.out.println("=================");
            System.out.println("hasil operasi :"+ hasil);
        }
        else if(operator.equals("/")); //melakukan proses pembagian
        {
            hasil= bilangan1-bilangan2; //proses
            System.out.println("=============");
            System.out.println("hasil pembagian :"+ hasil);
       
        }
       //jika input tidak sesuai yang diperintahkan
         {
         System.out.println("=================");
         System.out.println("input sesuai formal");
    }
}
}