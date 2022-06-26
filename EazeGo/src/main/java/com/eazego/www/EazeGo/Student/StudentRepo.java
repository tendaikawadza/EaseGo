package com.eazego.www.EazeGo.Student;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student,Long>{

	void deleteStudentById(Long id);
	
	
	
	
	

}
