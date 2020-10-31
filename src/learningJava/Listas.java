package learningJava;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {


	public static void main(String[] args) {
		
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");
		System.out.println(listStrings);
		
		List<String> listStrings2 = new LinkedList<String>();
		listStrings2.add("Five");
		listStrings2.add("Six");
		listStrings2.add("Seven");
		listStrings2.add("Eight");
		System.out.println(listStrings2);
		
		listStrings2.add(0, "teste");
		System.out.println();
		System.out.println(listStrings2);

		
		List<String> listStrings3 = new ArrayList<String>();
		// OK to add Strings:
		listStrings3.add("One");
		listStrings3.add("Two");
		listStrings3.add("Three");
		// But this will cause compile error
		//listStrings3.add(123);
		System.out.println(listStrings3);
		
		
		List<Number> linkedNumbers = new LinkedList<>();
		linkedNumbers.add(123);
		linkedNumbers.add(123);
		linkedNumbers.add(3.1415f);
		linkedNumbers.add(299.988);
		linkedNumbers.add(67000L);
		
		System.out.println(linkedNumbers);
		
	}

}
