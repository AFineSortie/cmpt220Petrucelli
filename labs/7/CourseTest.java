
public class CourseTest {

	public static void main(String[] args) {
		Course softDev = new Course("Software Development");
		softDev.addStudent("Chris");
		softDev.addStudent("Will");
		softDev.addStudent("Danny");
		softDev.dropStudent("Will");
	
		
		String[] studentsInClass = new String[softDev.getNumberOfStudents()];
		studentsInClass = softDev.getStudents();
		
		for (int i = 0; i < studentsInClass.length; i++) {
			if (studentsInClass[i] != "") {
				System.out.print(studentsInClass[i] + ", ");
			}
		}
	}

}
