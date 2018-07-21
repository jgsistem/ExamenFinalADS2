package examenfinal.student.application.dao;

import java.util.List;



import examenfinal.student.domain.entity.Student;
public interface IStudentDAO {
	
	public List<Student> getStudentIdtipo(Long idtipstudent);
	public List<Student> getallMaestria();
	

}
