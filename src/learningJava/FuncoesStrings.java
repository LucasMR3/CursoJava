package learningJava;

public class FuncoesStrings {

	public static void main(String[] args) {

//		Formatar: toLowerCase(), toUpperCase(), trim()
//		Recortar: substring(inicio), substring(inicio, fim)
//		Substituir: Replace(char, char), Replace(string, string)
//		Buscar: IndexOf, LastIndexOf
//		str.Split(" ")
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		System.out.println("Original: -" + original + "-");
		
		String s01 = original.toLowerCase();
		System.out.println("toLowerCase: -" + s01 + "-");
		
		String s02 = original.toUpperCase();
		System.out.println("toUpperCase: -" + s02 + "-");
		
		String s03 = original.trim();
		System.out.println("trim: -" + s03 + "-");
		
		String s04 = original.substring(2); 
		System.out.println("substring: -" + s04 + "-");
		
		String s05 = original.substring(2, 9);
		System.out.println("substring: -" + s05 + "-");
		
		String s06 = original.replace('a', 'x');
		System.out.println("replace: -" + s06 + "-");
		
		String s07 = original.replace("abc", "xy");
		System.out.println("replace: -" + s07 + "-");
		
		int i = original.indexOf("bc");
		System.out.println("Index of bc: " + i);

		int j = original.lastIndexOf("bc");
		System.out.println("lastIndex of bc: " + j);

		String originalWord = "potato apple lemon orange";
		
		String[] vect = originalWord.split(" "); 
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
