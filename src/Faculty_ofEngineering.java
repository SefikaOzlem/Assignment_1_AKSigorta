import java.util.List;

public interface Faculty_ofEngineering {
	
	String departmentName();
		
	final String campus="Týnaztepe Campus";
	
	void printStudents(List<Student> studentList);
	
	void printLessons();
	
	void addStudent(Student studentInformations);
	
	int countStudent();
	
	
}
