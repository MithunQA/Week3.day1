package week3.day1;

public class CompareStrings {

	public static void main(String[] args) {

		String str1 ="I am Learning Java";
		String str2 ="I am learning java"; 
		
		if(str1.equals(str2))
		{
			System.out.println("String-1 equals String-2");
		}
		else if(str1==str2)
		{
			System.out.println("String-1 == String-2");
		}
		else if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("String-1 equal ignore case String-2");
		}
		
	}

}
