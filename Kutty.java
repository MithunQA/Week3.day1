package week3.day1;

public class Kutty {

	public static void main(String[] args) {

		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		
		 //String str3 = "Kutty"; - to get the Same text as o/p
		 //String str4 = "Kutty"; - to get the Same text as o/p
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
		 {
			 System.out.println("Diff text");
			 System.out.println("As == is used, the objects are pointing to different location");
		 }
		 
		 System.out.println("***");
		 
		 
	}

}
