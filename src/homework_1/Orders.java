package homework_1;

import java.util.Scanner;

public class Orders {

	public static void main(String[] args) {
//		1- Switch case ile müşteriden alınan sipariş numarasına göre 
//		hangi ürünün sipariş edildiğini belirleyen algoritma yazınız.
//		Input için Scanner kullanınız

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen sipariş numaranızı giriniz: ");
		int order_number = scanner.nextInt();
		
		switch(order_number) {
		case 1:
			System.out.println("Ayakkabı sipariş ettiniz.");
	    	break;
		case 2:
			System.out.println("Elbise sipariş ettiniz.");
		    break;
		case 3:
			System.out.println("Kolye sipariş ettiniz.");
		    break;
		case 4:
			System.out.println("Eldiven sipariş ettiniz.");
		    break; 
		case 5:
			System.out.println("Pantolon sipariş ettiniz.");
		    break;
		case 6:
			System.out.println("Gömlek sipariş ettiniz.");
		    break;
		default:
		    System.out.println("Böyle bir sipariş bulunmamaktadır. Lütfen kontrol ediniz.");
		}
		scanner.close();
	}
}
