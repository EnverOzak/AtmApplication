package com.enverozak.atm.musteri;
import java.util.Scanner;

public class KurumsalMusteri extends Musteri {

    private String SirketAdi;

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, Integer hesapBakiyesi, String sirketAdi, Scanner Input) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi, Input);
        SirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return SirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        SirketAdi = sirketAdi;
    }

    @Override
    public void MusteriBilgileri(){
        System.out.println("Müşteri Bilgileri\n" +
                "Kurumsal Müşteri\n" +
                "Tc Kimlik No:    " + this.getTcKimlikNo() + "\n" +
                "Adı Soyadı:      " + this.getAdSoyad() + "\n" +
                "Şirket Adı:      " + this.getSirketAdi() + "\n" +
                "Hesap Bakiyesi:  " + this.getHesapBakiyesi());
    }
}
