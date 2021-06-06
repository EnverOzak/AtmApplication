package com.enverozak.atm.musteri;
import java.util.Scanner;

public class BireyselMusteri extends Musteri{

    private String EvAdresi;

    public BireyselMusteri(String tcKimlikNo, String adSoyad, Integer hesapBakiyesi, String evAdresi, Scanner Input) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi, Input);
        EvAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return EvAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.EvAdresi = evAdresi;
    }

    @Override
    public void MusteriBilgileri(){
        System.out.println("Müşteri Bilgileri\n" +
                "Kurumsal Müşteri\n" +
                "Tc Kimlik No:    " + this.getTcKimlikNo() + "\n" +
                "Adı Soyadı:      " + this.getAdSoyad() + "\n" +
                "Ev Adresi:       " + this.getEvAdresi() + "\n" +
                "Hesap Bakiyesi:  " + this.getHesapBakiyesi());
    }
}
