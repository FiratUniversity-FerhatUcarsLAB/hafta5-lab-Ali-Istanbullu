/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [8.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */


import java.util.Scanner;

public class GeometriHesap {

public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
//-----------------------------------------------------------------------------------------------------------------------------------------------------
     // KARE İLE İLGİLİ ALAN 
     System.out.println("== KENARLARI GIRINIZ ==");

     System.out.print("Karenin Kenarini Giriniz : ");
       double kenarKare = input.nextDouble();
//------------------------------------------------------------------------------------------------------------------------------------------------------
     // DİKDÖRTGEN İLE İLGİLİ ALAN 
     System.out.println("\n== KENARLARI GIRINIZ == ");

     System.out.print("Dikdörtgenin Kisa Kenarini Giriniz : ");
        double dikKenarKisa = input.nextDouble();

     System.out.print("Dikdörtgenin Uzun Kenarini Giriniz : ");
        double yatayKenarUzun = input.nextDouble();
//------------------------------------------------------------------------------------------------------------------------------------------------------
    // DAİRE İLE İLGİLİ ALAN
     System.out.println("\n== YARI ÇAPI GIRINIZ == ");

     System.out.print("Dairenin Yari Çapini Giriniz : ");
       double daireYariÇap = input.nextDouble();
//------------------------------------------------------------------------------------------------------------------------------------------------------
    // ÜÇGEN İLE İLGİLİ ALAN 
     System.out.println("\n== KENARLARI GIRINIZ == ");

     System.out.print("Ücgenin Taban Uzunluğunu Giriniz : ");
       double tabanUzunlukUcgen = input.nextDouble();

     System.out.print("Ücgenin Yüksekliğini  Giriniz : ");
       double YuksekUzunlukUcgen = input.nextDouble();

     System.out.print("Ücgenin Sol Kenar Uzunluğunu Giriniz : ");
       double solUzunlukUcgen = input.nextDouble();

     System.out.print("Ücgenin Sağ Kenar Uzunluğunu Giriniz : ");
       double sağUzunlukUcgen = input.nextDouble();
//----------------------------------------------------------------------------------------------------------------------------------------------------- 


     System.out.println("==================================================");
     System.out.println("          == HESAPLAMA SONUÇLARI ==               ");
     System.out.println("==================================================");

     System.out.printf("KARE (kenar : %.1f cm)",kenarKare);
     System.out.printf("\n KARENİN ALAN HESABI : %.1f ",calculateSquareArea(kenarKare));
     System.out.printf("\n KARENİN ÇEVRE HESABI : %.1f ",calculateSquarePerimeter(kenarKare));

     System.out.println(" ");

     System.out.printf("\nDİKDÖRTGEN (kenar : %.1f cm || %.1f cm)",dikKenarKisa,yatayKenarUzun);
     System.out.printf("\n DİKDÖRTGEN ALAN HESABI : %.1f",calculateRectangleArea(dikKenarKisa,yatayKenarUzun));
     System.out.printf("\n DİKDÖRTGEN ÇEVRE HESABI : %.1f",calculateRectanglePerimeter(dikKenarKisa, yatayKenarUzun));

     System.out.println(" ");

     System.out.printf("\nDAİRE (yari çap : %.1f)",daireYariÇap);
     System.out.printf("\n DAİRENİN ALAN HESABI : %.1f",calculateCircleArea(daireYariÇap));
     System.out.printf("\n DAİRENİN ÇEVRE HESABI : %.1f",calculateCircleCircumference(daireYariÇap));

     System.out.println(" ");

     System.out.printf("\nÜÇGEN (taban : %.1f yükseklik : %.1f )",tabanUzunlukUcgen,YuksekUzunlukUcgen);
     System.out.printf("\n ÜÇGENİN ALAN HESABI : %.1f",calculateTriangleArea(tabanUzunlukUcgen,YuksekUzunlukUcgen));
     System.out.printf("\n ÜÇGENİN ÇEVRE HESABI : %.1f",calculateTrianglePerimeter(tabanUzunlukUcgen,sağUzunlukUcgen,solUzunlukUcgen));
     
     System.out.println("\n==================================================");

input.close();
}


// KARE ALAN
public static double calculateSquareArea(double kenarKare){

   double alan = kenarKare*kenarKare;

   return alan ;

}
// KARE ÇEVRE 
public static double calculateSquarePerimeter(double kenarKare){

    double cevre = 4*kenarKare;

    return cevre;
}
// DİKDÖRTGEN ALAN
public static double calculateRectangleArea(double dikKenarKisa , double yatayKenarUzun){

    double alan = dikKenarKisa*yatayKenarUzun;

    return alan;
}
// DİKDÖRTGEN ÇEVRE
public static double calculateRectanglePerimeter(double dikKenarKisa , double yatayKenarUzun){

    double cevre = 2*(dikKenarKisa+yatayKenarUzun);

    return cevre ;

}
// DAİRE ALAN
public static double calculateCircleArea(double daireYariÇap){

    double alan = Math.PI*Math.pow(daireYariÇap, 2);

    return alan ;

}
// DAİRE ÇEVRE
public static double calculateCircleCircumference(double daireYariÇap){

    double cevre = 2*Math.PI*daireYariÇap;

    return cevre ;

}
// ÜÇGEN ALAN
public static double calculateTriangleArea(double tabanUzunlukUcgen, double YuksekUzunlukUcgen){

    double alan = tabanUzunlukUcgen*YuksekUzunlukUcgen/2;

    return alan ;
}
// ÜÇGEN ÇEVRE
public static double calculateTrianglePerimeter(double sağUzunlukUcgen,double solUzunlukUcgen,double tabanUzunlukUcgen){

    double cevre = sağUzunlukUcgen+solUzunlukUcgen+tabanUzunlukUcgen;

    return cevre ;

}

}
