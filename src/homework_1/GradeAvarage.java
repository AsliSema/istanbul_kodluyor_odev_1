package homework_1;

import java.util.Scanner;

public class GradeAvarage {

	public static void main(String[] args) {
		// kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı, 
		// öğrenci soyadı, 1.sınav notu, 2.sınav notu, 3.sınav notu isteyen ve daha sonra 
		//not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen öğrenci sayısını giriniz: ");
		int numberOfStudent = scanner.nextInt();
		int exam1;
		int exam2;
		int exam3;
		double avarageGrade;
		String firstName;
		String lastName;
		
		for(int i=1; i<=numberOfStudent; i++) {
			System.out.print(i + ". öğreninin adını giriniz: ");
			firstName = scanner.next();
			System.out.print(i + ". öğreninin soyadını giriniz: ");
			lastName = scanner.next();
			System.out.print(i + ". öğreninin birinci sınav notunu giriniz: ");
			exam1 = scanner.nextInt();
			System.out.print(i + ". öğreninin ikinci sınav notunu giriniz: ");
			exam2 = scanner.nextInt();
			System.out.print(i + ". öğreninin üçüncü sınav notunu giriniz: ");
			exam3 = scanner.nextInt();
			avarageGrade = (exam1+exam2+exam3)/3;
			System.out.println(firstName + " " + lastName + " adlı öğrencinin not ortalaması " + avarageGrade);
			
		}
		
	}

}
