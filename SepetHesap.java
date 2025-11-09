/*
 * Ad Soyad: [Ali İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [9.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {
    static final double VAT_RATE = 0.18;      // KDV Oranı (%18)
    static final double SHIPPING_FEE = 29.99; // Sabit kargo ücreti (TL) 

    public static void main(String[] args) {

        Scanner inpot = new Scanner(System.in);

        System.out.println("==E-TICARET SEPET HESAPLAYICI==");

        System.out.println("\nLutfen 3 urunun bilgilerini girin: ");

        System.out.print("\n 1.ÜRÜN BİRİM FİYATI (TL): ");
        double ürünFiyat1 = inpot.nextDouble();

        System.out.print(" 1.ÜRÜN ADETİ : ");
        double ürünAdet1 = inpot.nextDouble();

        System.out.print("\n 2.ÜRÜN BİRİM FİYATI (TL): ");
        double ürünFiyat2 = inpot.nextDouble();

        System.out.print(" 2.ÜRÜN ADETİ : ");
        double ürünAdet2 = inpot.nextDouble();

        System.out.print("\n 3.ÜRÜN BİRİM FİYATI (TL): ");
        double ürünFiyat3 = inpot.nextDouble();

        System.out.print(" 3.ÜRÜN ADETİ : ");
        double ürünAdet3 = inpot.nextDouble();

        System.out.print("\nIndirim Kuponu Yuzdesi (%): ");
        double indrim1 = inpot.nextDouble();

        System.out.println("\n==================================================");
        System.out.println("               == HESAPLAMA SONUÇLARI ==               ");
        System.out.println("==================================================");
       
        double toplamFiyat1 = urunToplamFiyat(ürünFiyat1, ürünAdet1);
        double toplamFiyat2 = urunToplamFiyat(ürünFiyat2, ürünAdet2);
        double toplamFiyat3 = urunToplamFiyat(ürünFiyat3, ürünAdet3);
        
        double araToplam = üçÜrünToplamFiyati(toplamFiyat1, toplamFiyat2, toplamFiyat3);
        double indirimTutari = indirim(araToplam, indrim1);
        double indirimliToplamTutar = indirimliToplam(araToplam, indirimTutari);
        double kdvTutari = kdv(indirimliToplamTutar, VAT_RATE);

        System.out.printf("\n1.Ürün Fİyat (%.1f x %.1f)= %.2f TL ", ürünFiyat1, ürünAdet1, toplamFiyat1);
        System.out.printf("\n2.Ürün Fİyat (%.1f x %.1f)= %.2f TL ", ürünFiyat2, ürünAdet2, toplamFiyat2);
        System.out.printf("\n3.Ürün Fİyat (%.1f x %.1f)= %.2f TL ", ürünFiyat3, ürünAdet3, toplamFiyat3);
        
        System.out.println("\n-----------------------------------------------------------------------");
        
        System.out.printf("3 Ürün Toplam Fİyat          : %.2f TL ", araToplam);
        System.out.printf("\nIndirim Kuponu Yuzdesi (%%%.1f): -%.2f TL ", indrim1, indirimTutari);
        System.out.printf("\nİndirimli Toplam             : %.2f TL ", indirimliToplamTutar);
        System.out.printf("\nKDV (%%18)                    : %.2f TL ", kdvTutari); 
          
         System.out.println("\n-----------------------------------------------------------------------");
         
         System.out.printf("TÜM TOPLAM                   : %.2f TL ",tümToplam(indirimliToplamTutar, kdvTutari,SHIPPING_FEE));
          
         System.out.println("\n==================================================");

        inpot.close();
    }

    // ürün x adet
    public static double urunToplamFiyat(double Fiyat, double adetFiyat) {

        double ToplamFiyat = Fiyat * adetFiyat;

        return ToplamFiyat;
    }
    // 3 ürün toplam fiyat
    public static double üçÜrünToplamFiyati(double ürünBir, double ürünIki, double ürünUç) {
        
        double toplam = ürünBir + ürünIki + ürünUç;

        return toplam;

    }
    // indirim
    public static double indirim(double toplam3ürün, double indirim) {

        double indirimli = toplam3ürün * (indirim / 100);

        return indirimli;
    }
    // toplam-indirim
    public static double indirimliToplam(double toplam, double toplaminIndirimi) {

        double indirmimliToplam = toplam - toplaminIndirimi;

        return indirmimliToplam;
    }
    // kdv
    public static double kdv(double indirimliToplam, double kdv) {

        double kdvoran = indirimliToplam * kdv;

        return kdvoran;
    }
    // tüm toplam
    public static double tümToplam(double indirimliToplam , double kdvTutari , double kargoÜcreti){

    double tümTopLam = indirimliToplam+kdvTutari+kargoÜcreti;

    return tümTopLam ;

    }

}
