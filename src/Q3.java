public class Q3 {

    public static void main(String[] args) {
        /*
        Soru: str1 ve str2'nin degerlerini matematiksel olarak toplayin
         */

        String str1= "123";
        String str2= "12";

        System.out.println(str1 + str2); // 12312

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 135

        // Integer.parseInteger(str) icine yazilan str rakamlardan olusuyorsa str'i int'a cevirir
        // ancak bir karakter bile rakam degilse hata verir
    }

}
