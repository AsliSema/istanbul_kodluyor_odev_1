package homework_1;

import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) {

//	2- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak 
//	toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
//	(Input için Scanner ve döngü için for döngüsü kullanınız)
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç ürün almak istiyorsunuz?: ");
        int numberOfProduct = scanner.nextInt();

        double totalPrice = 0;

        for (int i = 1; i <= numberOfProduct; i++) {
            System.out.print(i + ". ürünün fiyatını girin: ");
            double urunFiyati = scanner.nextDouble();
            totalPrice += urunFiyati;
        }

        System.out.println("Toplam Alışveriş Tutarı: " + totalPrice + " TL");

        scanner.close();
		
	System.out.println();

	}

}
