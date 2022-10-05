
package notOrtalamasi;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, biyoloji;

        Scanner input = new Scanner(System.in);

        System.out.print( "Matematik notunuz:");
        mat= input.nextInt();

        System.out.print( "fizik notunuz:");
        fizik= input.nextInt();

        System.out.print( "kimya notunuz:");
        kimya= input.nextInt();

        System.out.print("Türkçe notunuz:");
        turkce= input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih= input.nextInt();

        System.out.print("muzik notunuz:");
        muzik= input.nextInt();

        System.out.print("biyoloji notunuz:");
        biyoloji= input.nextInt();

        int toplam = (mat+ fizik+ kimya+ turkce+ tarih+ muzik);
        double sonuc= toplam / 6.0;
        System.out.println("ortalamanız:"+sonuc);
//bundan sonra yazılan kod kaldı ya da geçti sonucunu ekrana yazdırmak için

        System.out.println(sonuc<60? "Sınıfta Kaldınız":"Sınıfı Geçtiniz" );
    }
}