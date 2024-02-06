package homework_1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// 4-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini 
		// isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.
		// (While döngüsü ile yapınız ve rastgele sayı üretmek için 
		// Random sınıfını kullanınız)
		
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int number;
		int secretNumber = random.nextInt(10);
		
		while(true) {
			System.out.print("1 ile 10 arasında bir sayı giriniz: ");
			number = scanner.nextInt();
			
			
			if (number < 1 || number > 10) {
                System.out.println("Geçersiz sayı! Lütfen 1 ile 10 arasında bir sayı girin.");
            }
			
			else if (number == secretNumber) {
                System.out.println("Tebrikler! "+ secretNumber + " doğru tahmin!");
                return;
            } else {
                System.out.println("Yanlış tahmin! Tekrar deneyin.");
            }
		}
		
	}

}
