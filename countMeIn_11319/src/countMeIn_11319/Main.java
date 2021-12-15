package countMeIn_11319;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	private static Set<Character> VOWELS;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt;
		String str = null;
		List<String> strList = new ArrayList<String>();
		
		makeVowelSet();
		
		Scanner sc = new Scanner(System.in);		
		cnt = Integer.parseInt(sc.nextLine());		

		for(int i=0;i<cnt;i++) {
			str = sc.nextLine();
			strList.add(processor(str.replace(" ", "")));
		}
		
		for(String s : strList) {
			System.out.println(s);
		}
		
		sc.close();
	}
	
	private static String processor(String str) {
		String result = "";
		
		int constant = 0;
		int vowel = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(chkVowel(str.charAt(i))) {
				vowel++;
				continue;
			}
			constant++;			
		}
		result = constant + " " + vowel;
		
		return result;
	}
	
	private static boolean chkVowel(char c) {
		
		if(VOWELS.contains(c)) {
			return true;
		}
		
		return false;
	}
	
	private static void makeVowelSet() {
		VOWELS = new HashSet<Character>();
		
		VOWELS.add('A');
		VOWELS.add('E');
		VOWELS.add('I');
		VOWELS.add('O');
		VOWELS.add('U');
		VOWELS.add('a');
		VOWELS.add('e');
		VOWELS.add('i');
		VOWELS.add('o');
		VOWELS.add('u');
	}
}
