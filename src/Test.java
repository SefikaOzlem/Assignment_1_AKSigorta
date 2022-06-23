import java.util.Scanner;

public class Test {
	static Scanner scan = new Scanner(System.in);
	static String studentName;
	static String studentSurName;
	static int studentNumber;
	static Student student;
	public static void main(String[] args) {
		
		ComputerEngineering deuceng=new ComputerEngineering();
		MechanicalEngineering deumeng=new MechanicalEngineering();
		MiningEngineering deumineng=new MiningEngineering();
		ElectricalEngineering deuEEeng=new ElectricalEngineering();
		 
		userInputs();
		
		int selection=scan.nextInt();
		 
		 while(selection!=0) 
		{
			 
			 if(selection==1) {
				student=new Student();
				studentInputs();				
				deuceng.addStudent(student);
			 }
			 else if(selection==2) {
				 System.out.println(deuceng.departmentName());
				 System.out.println(deuceng.campus);
				 System.out.println(deuceng.countStudent());
				 System.out.println("Department Courses: ");
				 deuceng.printLessons();
				 System.out.println("Students in the Department: ");
				 deuceng.printStudents(deuceng.students);
				 
			 }
			 else if(selection==3) {
				 student=new Student();
				 studentInputs();
				 deumeng.addStudent(student);
			 }
			 else if(selection==4) {
				 System.out.println(deumeng.departmentName());
				 System.out.println(deumeng.campus);
				 System.out.println(deumeng.countStudent());
				 System.out.println("Department Courses: ");
				 deumeng.printLessons();
				 System.out.println("Students in the Department: ");
				 deumeng.printStudents(deumeng.students); 
			 }
			 else if(selection==5) {
				 student=new Student();
				 studentInputs();
				 deumineng.addStudent(student); 
			 }
			 else if(selection==6) {
				 System.out.println(deumineng.departmentName());
				 System.out.println(deumineng.campus);
				 System.out.println(deumineng.countStudent());
				 System.out.println("Department Courses: ");
				 deumineng.printLessons();
				 System.out.println("Students in the Department:");
				 deumineng.printStudents(deumineng.students);
			 }
			 else if(selection==7) {
				 student=new Student();
				 studentInputs();
				 deuEEeng.addStudent(student); 
			 }
			 else if(selection==8) {
				 System.out.println(deuEEeng.departmentName());
				 System.out.println(deuEEeng.campus);
				 System.out.println(deuEEeng.countStudent());
				 System.out.println("Department Courses: ");
				 deuEEeng.printLessons();
				 System.out.println("Students in the Department:");
				 deuEEeng.printStudents(deuEEeng.students);
			 }
			 
			 selection=scan.nextInt();
		 }
		 

	}
	static void studentInputs() {
		 Scanner sc = new Scanner(System. in );
		  
		System.out.println("Student Name: ");
		studentName=sc.nextLine();
		
		System.out.println("Student Surname: ");
		studentSurName=sc.nextLine();
		
		System.out.print("Student Number: ");
		studentNumber=sc.nextInt();
		
		
		student.setName(studentName);
		student.setSurName(studentSurName);
		student.setStudentNo(studentNumber);
	}
	static void userInputs() {
		System.out.println("Press 1 to add a student to Computer Engineering");
		 System.out.println("Press 2 to information about Computer Engineering");
		 System.out.println("Press 3 to add a student to Mechanical Engineering");
		 System.out.println("Press 4 to information about Mechanical Engineering");
		 System.out.println("Press 5 to add a student to Mining Engineering");
		 System.out.println("Press 6 to information about Mining Engineering");
		 System.out.println("Press 7 to add a student to Electrical Engineering");
		 System.out.println("Press 8 to information about Electrical Engineering");
		 System.out.println("Press 0 to Exit");
		 
	}

}
