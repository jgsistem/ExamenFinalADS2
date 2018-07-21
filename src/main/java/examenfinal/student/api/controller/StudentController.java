package examenfinal.student.api.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import examenfinal.common.api.controller.ResponseHandler;
import examenfinal.student.application.StudentApplicationService;
import examenfinal.student.application.dto.StudentDto;
import examenfinal.student.domain.entity.Student;

@RestController
@RequestMapping("api/Student/")
public class StudentController {
	
	@Autowired
	ResponseHandler responseHandler;
	
	@Autowired
	StudentApplicationService studentApplicationService;
		
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method = RequestMethod.GET, value = "/GetIdStudent/{typeStudent}")
	public List<Student> getAllCustomer(@PathVariable(value="typeStudent") Long idtipstudent,StudentDto studentDto) throws Exception{		
		   return studentApplicationService.getidmaestria(idtipstudent,studentDto);
	}
		
	
	@CrossOrigin(origins = "*")		  
    @RequestMapping(method = RequestMethod.GET, value = "/GetAllStudent")
	public List<Student> getAllCustomer(StudentDto studentDto) throws Exception{		
	   return studentApplicationService.getallMaestria(studentDto);
	}
	
	
	
}
