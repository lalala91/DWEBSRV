package practica5;


public interface StudenDAO {

	Student getStudent(Student student);
	void removeStudent(Student student);
	void addStudent(Student student);
	void contractStudent(Student student);
}
