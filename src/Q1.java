import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        /* Soru:    Kullanicidan bir tamsayi alin
                    Kullanici kac girerse girsin
                    konsolda -128 ile +127 arasinda bir sonuc yazdiracak kod yaziniz
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSayi= scan.nextInt();


        byte donusensayi= (byte)girilenSayi;

        System.out.println("girdiginiz " + girilenSayi + "'nin donusmus hali : " + donusensayi);
    }
}
