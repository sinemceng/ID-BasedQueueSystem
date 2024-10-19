import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gişe Uygulamasına Hoşgeldiniz");
        System.out.print("Lütfen TCKN giriniz: ");
        String tckn =scanner.nextLine();

        TCKN tcknNesne= new TCKN();
        tcknNesne.setTckn(tckn);

        //Random sınfı rastgele değer üretmek için kullanılan bir sınıftır.
        Random random = new Random();
        int giseNo =random.nextInt(100); //0-100 arasında rastgele değer üretmeyi sağlar.

        System.out.println("Gişe No: "+ giseNo);

    }
}