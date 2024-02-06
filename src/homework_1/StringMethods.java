package homework_1;

public class StringMethods {

	public static void main(String[] args) {
		// 6- String metotlarını araştırınız. Her bir metot için örnek yapınız.
		String str = "Merhaba";
		
		
		// length() Metodu: bir String ifadesinin karakter sayısını döndürür.
		int length = str.length();
		System.out.println("String Uzunluğu: " + length); // Çıktı: 7
		

		//charAt() Metodu:belirli bir String ifadesinin belirtilen indeksteki karakteri döndürür.
		char character = str.charAt(2);
		System.out.println("2. indeksteki Karakter: " + character); // Çıktı: r
		
		
		//toUpperCase() ve toLowerCase() Metotları:
		//toUpperCase() metodu, bir String ifadesinin tüm karakterleri büyük harfe çevirir.
		//toLowerCase() metodu, bir String ifadesinin tüm karakterleri küçük harfe çevirir.
		String upperStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		System.out.println("Büyük Harfli: " + upperStr); // Çıktı: MERHABA
		System.out.println("Küçük Harfli: " + lowerStr); // Çıktı: merhaba
		
		
		//equals() ve equalsIgnoreCase() Metotları:
		//equals() metodu, iki String in eşit olup olmadığını kontrol eder.
		//equalsIgnoreCase() metodu, büyük-küçük harf duyarlılığı olmaksızın iki String in eşit olup olmadığını kontrol eder.
		String str1 = "merhaba";
		boolean equal = str1.equals(str);
		boolean equalIgnoreCase = str1.equalsIgnoreCase(str);
		System.out.println("Eşit mi?: " + equal); // Çıktı: false
		System.out.println("Büyük-küçük harf duyarsız Eşit mi?: " + equalIgnoreCase); // Çıktı: true
		
		
		//indexOf() Metodu: belirtilen bir alt dizenin String teki ilk indeksini döndürür.
		int index = str.indexOf("r");
		System.out.println("r'nin indeksi: " + index); // Çıktı: 8
		
		
		//substring() Metodu: substring(beginIndex) belirtilen başlangıç indeksinden itibaren bir alt String oluşturur.
		String subStr = str.substring(3);
		System.out.println("Alt Dize: " + subStr); // Çıktı: haba
		
		
		//substring(beginIndex, endIndex) metodu, belirtilen başlangıç ve bitiş indeksleri arasındaki alt String i oluşturur.
		String subStr2 = str.substring(0, 3);
		System.out.println("Alt Dize: " + subStr2); // Çıktı: Mer
		
		
		//replace() Metodu: replace(oldChar, newChar) metodu, belirli bir karakteri başka bir karakterle değiştirir.
		String newStr = str.replace('a', 'e');
		System.out.println("Değiştirilmiş Dize: " + newStr); // Çıktı: Merhebe

		
		//replaceAll() Metodu: replaceAll(regex, replacement) metodu, belirli bir düzeni karşılayan tüm alt dizeleri başka bir dizeyle değiştirir.
		String newStr2 = str.replaceAll("haba", "hamet");
		System.out.println("Değiştirilmiş Dize: " + newStr2); // Çıktı: Merhamet
		
		
		//startsWith() ve endsWith() Metotları:
		//startsWith(prefix) metodu, bir dizgenin belirtilen önek ile başlayıp başlamadığını kontrol eder.
		//endsWith(suffix) metodu, bir dizgenin belirtilen sonek ile bitip bitmediğini kontrol eder.
		boolean startCheckl = str.startsWith("Me");
		boolean endCheck = str.endsWith("aba");
		System.out.println("Başlangıç Kontrolü: " + startCheckl); // Çıktı: true
		System.out.println("Son Kontrolü: " + endCheck); // Çıktı: true
		
		
		//trim() Metodu:bir String teki başındaki ve sonundaki boşlukları kaldırır.
		String str2 = "    Merhaba    ";
		String trimDize = str2.trim();
		System.out.println("Trimlenmiş Dize: " + trimDize); // Çıktı: Merhaba
		
		
		//isEmpty() Metodu:bir String in boş olup olmadığını kontrol eder.
		String str3 = ""; // Boş dize
		String str4 = "Java";
		boolean isStr3Empty = str3.isEmpty();
		boolean isStr4Empty = str4.isEmpty();
		System.out.println("Boş mu? (str3): " + isStr3Empty); // Çıktı: true
		System.out.println("Boş mu? (str4): " + isStr4Empty); // Çıktı: false
		
		
		//contains() Metodu:bir String in belirtilen karakter dizisini içerip içermediğini kontrol eder.
		boolean isContains = str.contains("aba");
		System.out.println("İçeriyor mu?: " + isContains); // Çıktı: true
	}

}
