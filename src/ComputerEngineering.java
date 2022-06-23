import java.util.ArrayList;
import java.util.List;

public class ComputerEngineering implements Faculty_ofEngineering {


	private int numberof_students;
	public List<Student> students= new ArrayList<Student>(); 
	
	@Override
	public String departmentName() {
	
		return "Computer Engineering";
	}
	
	@Override
	public void printStudents(List<Student> studentList) {
		for(int i=0;i<studentList.size();i++) {
			System.out.println("Name: "+ studentList.get(i).getName()+'\n'+ "Surname: "+ studentList.get(i).getSurName()+'\n'+
		    "Number: "+studentList.get(i).getStudentNo()+'\n');
		}
		
	}
	
	@Override
	public void addStudent(Student studentInformations) {
	
		boolean flag=true;
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getStudentNo()==studentInformations.getStudentNo()) {
				flag=false;
				
			}
		}
		if(flag==true) {
			students.add(studentInformations);
			numberof_students++;
		}
		else {
			System.err.print("There are students at this number !");
		}
			
	}	
	public int countStudent() {
		
		return numberof_students;
	}

	@Override
	public void printLessons() {
		System.out.println("Object Oriented");
		System.out.println("Artificial Neural Networks");
		System.out.println("Computer Graphics");
		System.out.println("Image and Video Processing \n");
	}


}
