package javaBasics;

public class VariablenBasics {

	public static void main(String[] args) {
		//wahr/falsch
		//boolean 1bit
		boolean wahr_oder_falsch;
		
		wahr_oder_falsch = true;
		System.out.println(wahr_oder_falsch);

		wahr_oder_falsch = false;
		System.out.println(wahr_oder_falsch);
		System.out.println(" ");
		
		//byte
		byte zahl=1;
		System.out.println(zahl);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(" ");
		
		//short - 2byte
		short ganz_kleine_Zahl = 120;
		System.out.println(ganz_kleine_Zahl);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(" ");
		
		//int - 4 byte
		int kleine_Zahl = 123456;
		System.out.println(kleine_Zahl);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(" ");
		
		
		
	}

}
