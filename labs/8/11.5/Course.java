import java.util.ArrayList;
public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList(100);
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}
		
	public String[] getStudents() {
		String[] studentsInClass = new String[numberOfStudents + 1];
		for (int i = 0; i < studentsInClass.length; i++) {
			studentsInClass[i] = students.get(i);
		}
		return studentsInClass;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < students.size(); i++) {
			if (student == students.get(i)) {
				students.set(i, null);
				numberOfStudents--;
			}
		}
	}
	
	public void clear() {
		for (int i = 0; i < students.size(); i++) {
			students.set(i, null);
		}
	}
}


