package homework_1;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {
		// 3- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
		// while döngüsü: belirli bir koşul doğru olduğu sürece döngü bloğunu çalıştırmaya devam eden bir kontrol yapısıdır. 
		//	Koşul başlangıçta doğru ise döngü bloğu en az bir kez çalışır.
		// do-while döngüsü, koşulun başlangıçta kontrol edilmeden önce en az bir kez 
		// döngü bloğunu çalıştıran bir döngüdür.
		
	     Scanner scanner = new Scanner(System.in);

	        // Kullanıcıdan bir sayı al
	        System.out.print("Bir sayı girin: ");
	        int number = scanner.nextInt();

	        // While Döngüsü
	        System.out.println("While Döngüsü İle:");
	        int counterWhile = 1;

	        while (counterWhile <= number) {
	            System.out.println("Counter (While): " + counterWhile);
	            counterWhile++;
	        }

	        // Do-While Döngüsü
	        System.out.println("Do-While Döngüsü İle:");
	        int counterDoWhile = 1;

	        do {
	            System.out.println("Counter (Do-While): " + counterDoWhile);
	            counterDoWhile++;
	        } while (counterDoWhile <= number);

	        scanner.close();
     
	}
}
