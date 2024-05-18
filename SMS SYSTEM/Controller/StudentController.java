package com.techymeet.SMS.Controller;
import com.techymeet.SMS.Service.Student;
import com.techymeet.SMS.Service.Studentserviceimpl;
public class StudentController {
	public static void main(String args[]) {
		introduction();
		
        Student studentObj=new Studentserviceimpl();
        
		studentObj.createStudent();
		studentObj.viewStudent();
		studentObj.listStudent();
		studentObj.deleteStudent();
		studentObj.editStudent();
		studentObj.searchStudent();
		
	}
	public static void introduction() {
	 System.out.println("Welcome to Student SMS Management System");
	}
}

	    
	    
	  
	    

	    
	








	
	

	