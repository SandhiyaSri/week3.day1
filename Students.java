package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		
		System.out.println("Student Id is: "+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		
		System.out.println("Student Id is: "+id+" and name is "+name);
	}
	public void getStudentInfo(int id,String name,String email)
	{
		
		System.out.println("Student Id is: "+id+" and name is "+name+". Emaild id of student is "+email);
	}
	public void getStudentInfo(int id,String name,String email,long phoneNumber)
	{
		
		System.out.println("Student Id is: "+id+" and name is "+name+". Emaild id of student is "+email+". The phone number is "+phoneNumber);
	}

public static void main(String[] args) {
	Students stu=new Students();
	stu.getStudentInfo(101);
	stu.getStudentInfo(101, "Sandhiya");
	stu.getStudentInfo(101, "Sandhiya", "email@email.com");
	stu.getStudentInfo(101, "Sandhiya", "email@email.com",1234567890);
}
}
