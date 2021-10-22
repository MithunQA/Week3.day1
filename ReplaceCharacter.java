package week3.day1;

public class ReplaceCharacter {

	public static void main(String[] args) {
		
		//Write a Java program to replace a specified character 
		//with another character and add # to the given string.
		//replace 8 to 11 
		//Print the characters from 5 to 14
		
		String sentence = "I am working with Java8";
		
		String replace = sentence.replace("king", "####");
		
		System.out.println(replace);
		
		String subString = sentence.substring(5, 15);
		
		System.out.println(subString);
		
	}

}
