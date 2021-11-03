package javaConcepts.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountVowelsandConsonents {

	public static void main(String[] args) {
		String str = "Hello World";
		Set<Character> set = new HashSet();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		str = str.toLowerCase();
		int vowels=0;
		int consonents=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i)) && set.contains(str.charAt(i))){
				vowels++;
			} else if(Character.isAlphabetic(str.charAt(i))) {
				consonents++;
			}
		}
System.out.println("vowels = "+vowels);
System.out.println("consonents = "+consonents);

	}

}
