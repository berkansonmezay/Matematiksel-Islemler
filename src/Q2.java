import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {


        /* Soru:    kullanicidan char bir karakter alin
                    o karakterden sonra gelen 3 karakteri yazdirin
                    ornek input : a , output : bcd

         */



        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char girilenKrk= scan.next().charAt(0);

        System.out.println(""+(char)(girilenKrk+1) + (char)(girilenKrk+2) + (char)(girilenKrk+3));
    }
}
