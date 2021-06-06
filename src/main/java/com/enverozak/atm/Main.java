package com.enverozak.atm;
import com.enverozak.atm.musteri.*;
import com.enverozak.atm.islemler.Islemler;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static Map<String, Musteri> hesaplar;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        Islemler islemler = new Islemler();

        hesaplar = new HashMap<>();
        hesaplar.put("1", new BireyselMusteri("11111111111", "Ali Sönmez", 3000, "Aydın", input));
        hesaplar.put("2", new BireyselMusteri("22222222222", "Mehmet Koç", 7000, "İstanbul", input));
        hesaplar.put("3", new KurumsalMusteri("33333333333", "Onur Akkoyun", 22000, "Arçelik", input));
        hesaplar.put("4", new BireyselMusteri("44444444444", "Alptekin Alp", 30000, "Adana", input));
        hesaplar.put("5", new KurumsalMusteri("55555555555", "Anıl Arslan", 10000, "Beko", input));

        Musteri musteri = getMusteri();
        Integer islem = getIslem();

        Islemler.SetMusteri(musteri);

        if(islem == 1)
        {
            islemler.ParaYatirma();
        }
        else
        {
            islemler.ParaCekme();
        }
    }

    private static Musteri getMusteri(){
        System.out.println("Müşteri No Giriniz: ");

        String musteriNo = input.nextLine();

        hesaplar.get(musteriNo).MusteriBilgileri();

        return hesaplar.get(musteriNo);
    }

    private static Integer getIslem(){
        System.out.println("\nPara Yatırma İşlemi İçin 1\n" +
                "Para Çekme İşlemi İçin 2 Yazınız");

        return input.nextInt();
    }
}
