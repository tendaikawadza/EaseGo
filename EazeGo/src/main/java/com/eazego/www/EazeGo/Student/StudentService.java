package com.eazego.www.EazeGo.Student;

import java.util.List;

import org.jvnet.hk2.annotations.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
	private final StudentRepo studentRepo;
	
	
	@Autowired
	public StudentService(StudentRepo studentRepo) {
		
		this.studentRepo=studentRepo;
		
	}
	
	public Student addStudent(Student student) {		
		
		return studentRepo.save(student);
	}
	
public List<Student>findAllStudents(){
	
	return studentRepo.findAll();
	
}
	
	
	


public Student updateStudent(Student student) {
	return studentRepo.save(student);	
	
}	

//public Optional<Student> findStudentById  (Long id) {
//	
//	return studentRepo.findById(id);
//}

public Student findstudentById(Long id) {
	
	return studentRepo.findById(id).get();
	
	
}



public  void deleteStudent  (Long id) {
	
	  studentRepo.deleteStudentById(id);
	
}




}
