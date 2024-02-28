package java_start;

import java.util.Arrays;
import java.util.List;

public class A03_ForLoop {

	public static void main(String[] args){
		byte by = 'a';
		System.out.println(by);
		
		for (byte byt='a'; byt<='z' ; byt++){
			System.out.println((char)byt + " -> " + byt);
		}
		
		List<Integer> nums = Arrays.asList(1,2,3,4);
		List<String> names = Arrays.asList("abhi","shubh","jais");
	}
	
	
	
}
