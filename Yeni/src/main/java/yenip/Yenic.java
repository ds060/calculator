package yenip;
import java.util.Scanner;
public class Yenic {
    public static void main(String[] args) {

int mat, fizik, kimya;
        Scanner inp= new Scanner(System.in);

        System.out.println("matematik notunuz:");
        mat=inp.nextInt();

        System.out.println("fizik notunuz:");

        System.out.print("matematik notunuz:");
        mat= inp.nextInt();

        System.out.print("fizik notunuz:");
        fizik= inp.nextInt();

        System.out.print("kimya notunuz:");
        kimya= inp.nextInt();

        int toplam= (mat+fizik+kimya);
        double sonuc= toplam/3;
        System.out.println("ortalamanız:" +sonuc);


        boolean status= sonuc<60;

        System.out.println(status ? "kaldınız" : "geçtiniz");

    }
}
