package week3.day1;

public class Students {

	public void getStudentInfo(int ID)
	{
		System.out.println("Student ID is : " +ID);
	}
	
	public void getStudentInfo(int ID, String Name)
	{
		System.out.println("Student ID is : " +ID);
		System.out.println("Student Name is : " +Name);
	}
	
	public void getStudentInfo(String Email, String PhoneNumber )
	{
		System.out.println("Student Email is : " +Email);
		System.out.println("Student PhoneNumber is : " +PhoneNumber);
	}
	
	
	public static void main(String[] args) {

		Students stud = new Students();
		
		stud.getStudentInfo(101);
		stud.getStudentInfo(201, "Tesla");
		stud.getStudentInfo("abc@gmail.com", "9000000001");

	}

}
