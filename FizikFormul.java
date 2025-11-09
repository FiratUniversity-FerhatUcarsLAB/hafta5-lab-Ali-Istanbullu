/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [9.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormul {
    static final double GRAVITY = 9.8;

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
//----------------------------------------------------------------------------------------------
    // HIZ ve İVME
     System.out.println("== HIZ VE İVME HESABI ==");

     System.out.print("Mesafeyi Giriniz : ");
       double mesafe = input.nextDouble();

     System.out.print("Zamani Giriniz : ");
       double zaman = input.nextDouble();
//------------------------------------------------------------------------------------------------
    // KUVVET ve İŞ
     System.out.println("\n== KUVVET VE İŞ HESABI  ==");

     System.out.print("Ağirliği Giriniz : ");
       double kutle = input.nextDouble();
//---------------------------------------------------------------------------------------------------
    // ENERJİ
     System.out.println("\n== ENERJİ HESABI  ==");
     System.out.print("Yuksekliği Giriniz : ");
     double yukseklik = input.nextDouble();
     double toplamEnerji = calculateKineticEnergy(kutle, calculateVelocity(mesafe, zaman))+calculatePotentialEnergy(kutle, GRAVITY, yukseklik);
//----------------------------------------------------------------------------------------------------------------------------------------------------------
    // MOMENTUM
    // System.out.println("\n== MOMENTUM HESABI  ==");

     input.close();

       System.out.println("\n== FIZIK FORMUL ASISTAN  ==");
       System.out.println("\nTEMEL OLCUMLER:");

       System.out.printf("\nKutle (kg)   : %.1f",kutle);
       System.out.printf("\nMesafe (m)   : %.1f",mesafe);
       System.out.printf("\nZaman (t)    : %.1f",zaman);
       System.out.printf("\nHiz (m/s)    : %.1f",calculateVelocity(mesafe, zaman));
       System.out.printf("\nYukseklik (h): %.1f",yukseklik);

       System.out.println("\n==================================================");
       System.out.println("          == HESAPLAMA SONUÇLARI ==               ");
       System.out.println("==================================================");

       System.out.printf("HIZ (v = s/t)      : %.2f m/s",calculateVelocity(mesafe, zaman));
       System.out.printf("\nİVME (a = Δv/t)    : %.2f m/s²",calculateAcceleration(mesafe, zaman));

       System.out.println(" ");

       System.out.printf("\nKUVVET (F = m*a)   : %.2f N",calculateForce(kutle, calculateAcceleration(mesafe, zaman)));
       System.out.printf("\nİŞ  (W = F*d)      : %.2f J" ,calculateWork(mesafe, calculateForce(kutle, calculateAcceleration(mesafe, zaman))));
       System.out.printf("\nGÜÇ   (P = W/t)    : %.2f W",calculatePower(calculateWork(mesafe, calculateForce(kutle, calculateAcceleration(mesafe, zaman))), zaman));

       System.out.println(" ");

       System.out.printf("\nKİNETİK   (KE)     : %.2f J",calculateKineticEnergy(kutle, calculateVelocity(mesafe, zaman)));
       System.out.printf("\nPOTANSİYEL  (PE)   : %.2f J",calculatePotentialEnergy(kutle, GRAVITY, yukseklik));
       System.out.printf("\nTOPLAM ENERJİ      : %.2f J",toplamEnerji);

       System.out.println(" ");

       System.out.printf("\nMOMENTUM (p = m*v) : %.2f kg.m/s",calculateMomentum(kutle,calculateVelocity(mesafe, zaman)));

       System.out.println("\n==================================================");

    }

    // HIZ
     public static double calculateVelocity(double mesafe, double zaman){

        double hiz = mesafe/zaman;

        return hiz ;

    }
    // İVME
    public static double calculateAcceleration(double mesafe,double zaman){

        double ivme = mesafe/Math.pow(zaman, 2);

        return ivme ;

    } 
    // KUVVET
    public static double calculateForce(double kutle, double ivme){

        double kuvvet = kutle*ivme;

        return kuvvet ;

    }
    // İŞ
    public static double calculateWork(double mesafe, double kuvvet){

        double iş = mesafe*kuvvet;

        return iş ;

    }
    // GÜÇ
    public static double calculatePower(double iş, double zaman){

        double güç = iş/zaman;

        return güç ;

    }
    // KİNETİK
    public static double calculateKineticEnergy(double kutle , double hiz){
     
        double kinetik = 0.5*kutle*Math.pow(hiz, 2);

        return kinetik ;

    }
    // POTANSİYEL
    public static double calculatePotentialEnergy(double kutle ,double GRAVITY ,double yukseklik){

        double potansiyel = kutle*GRAVITY*yukseklik;

        return potansiyel ;
    }
    // MOMENTUM 
    public static double calculateMomentum(double kutle, double hiz){

        double momentum = kutle*hiz;

        return momentum ;

    }

}
