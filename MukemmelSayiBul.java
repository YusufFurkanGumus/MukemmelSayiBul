import java.util.Scanner;

public class MukemmelSayiBul{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı al
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        // Sayının kendisi hariç pozitif bölenlerinin toplamını bul
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Mükemmel sayı kontrolü
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }

        scanner.close();
    }
}
