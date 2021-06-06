package com.enverozak.atm.musteri;
import java.util.Scanner;

public class Musteri {

    private String TcKimlikNo;
    private String AdSoyad;
    private Integer HesapBakiyesi;

    public Musteri(String tcKimlikNo, String adSoyad, Integer hesapBakiyesi, Scanner Input) {
        TcKimlikNo = tcKimlikNo;
        AdSoyad = adSoyad;
        HesapBakiyesi = hesapBakiyesi;
    }

    public String getTcKimlikNo() {
        return TcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        TcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        AdSoyad = adSoyad;
    }

    public Integer getHesapBakiyesi() {
        return HesapBakiyesi;
    }

    public void setHesapBakiyesi(Integer hesapBakiyesi) {
        HesapBakiyesi = hesapBakiyesi;
    }

    public void MusteriBilgileri(){
        System.out.println("Müşteri Bilgileri\n" +
                "Kurumsal Müşteri\n" +
                "Tc Kimlik No:    " + this.getTcKimlikNo() + "\n" +
                "Adı Soyadı:      " + this.getAdSoyad() + "\n" +
                "Hesap Bakiyesi:  " + this.getHesapBakiyesi());
    }
}
