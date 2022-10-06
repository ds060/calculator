package KDV;
import java.util.Scanner;
    public class kdv {
    public static void main(String[] args) {
    double fiyat;

    Scanner input = new Scanner(System.in);
    System.out.print("Ürün Fiyatını Giriniz:");
    fiyat = input.nextDouble();
    double kdvlifiyat = fiyat + (fiyat*0.18);
    System.out.println("kdvli fiyatı:" + kdvlifiyat);
    }
    
    }

