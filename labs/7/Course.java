
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		for (int i = 0; i < students.length; i++) {
			students[i] = "";
		}
	}
	
	public void addStudent(String student) {
		if (numberOfStudents > students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == "") {
				students[i] = student;
				numberOfStudents++;
				break;
			}
		}
	}
	
	public String[] getStudents() {
		String[] studentsInClass = new String[numberOfStudents + 1];
		for (int i = 0; i < studentsInClass.length; i++) {
			studentsInClass[i] = students[i];
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
		for (int i = 0; i < students.length; i++) {
			if (student == students[i]) {
				students[i] = "";
				numberOfStudents--;
			}
		}
	}
	
	public void clear() {
		for (int i = 0; i < students.length; i++) {
			students[i] = "";
		}
	}
}
