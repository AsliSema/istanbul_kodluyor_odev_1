package homework_1;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		// 5- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.
		// Bir sayının kendisi hariç pozitif bölenlerinin toplamı kendisine eşitse, 
		// o sayı mükemmel bir sayıdır.
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz:");
		int number= scanner.nextInt();
		int sumOfDivisors = 0;
		
		
		
		for(int i=2; i<=number; i++) { 
			if(number%i==0) {
				//System.out.println(number/i);
				int divisors = number/i;
				sumOfDivisors += divisors; 
			}
		}
		
		System.out.println("Girilen sayının kendisi hariç pozitif bölenlerinin toplamı: " + sumOfDivisors);
		System.out.println("Girilen Sayı: " + number);
		
		if(sumOfDivisors == number) {
			System.out.println(number + " sayısı mükemmel sayıdır.");
		}else{
			System.out.println(number+" sayısı mükemmel sayı değildir!");
		}
		
	}

}
