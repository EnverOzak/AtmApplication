package com.enverozak.atm.islemler;

import com.enverozak.atm.musteri.Musteri;

import java.util.Scanner;

public class Islemler {

    private static Integer miktar;

    private static Musteri islemMusteri;

    private final Scanner input = new Scanner(System.in);

    public static void SetMusteri(Musteri musteri){
        islemMusteri = musteri;
    }

    public void ParaYatirma(){
        System.out.println("Yatırmak İstediğiniz Miktarı Girin:");
        miktar = input.nextInt();
        islemMusteri.setHesapBakiyesi(islemMusteri.getHesapBakiyesi() + miktar);
        System.out.println("Yeni Bakiye: " + islemMusteri.getHesapBakiyesi());
    }

    public void ParaCekme(){
        System.out.println("Çekmek İstediğiniz Miktarı Girin:");
        miktar = input.nextInt();
        islemMusteri.setHesapBakiyesi(islemMusteri.getHesapBakiyesi() - miktar);
        System.out.println("Yeni Bakiye: " + islemMusteri.getHesapBakiyesi());
    }
}
