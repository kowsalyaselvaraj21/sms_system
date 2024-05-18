package com.techymeet.SMS.Service;
import java.util.Scanner;
import com.techymeet.SMS.BO.StudentBO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Studentserviceimpl implements Student{
	  int studentId;
	  String studentName;
      String EmailId;
      String Password;
      long Mobileno;
	  String Address;
	  String City;
	  String Country;
	 List<StudentBO>StudentBOList=new ArrayList<StudentBO>();
	@Override
	public void createStudent() {
	// TODO Auto-generated method stub
	 Scanner scannerobj = new Scanner(System.in);
	 StudentBO stdobj=new StudentBO();
	 System.out.println("!!!*STUDENT MANAGEMENT SYSTEM*!!!");
		System.out.println("PLEASE  ENTER STUDENT DETAILS");
		System.out.println("Enter studentId:");
		int studentId=0;
		boolean studentIdstatus=true;
		try {
			while(studentIdstatus) {
				studentId=scannerobj.nextInt();
				if(0<studentId) {
				stdobj.setStudentId(studentId);
				studentIdstatus=false;
				scannerobj.nextLine();
			}else {
				System.out.println("!Please Enter valid StudentId!");
			}
		}
			}catch(Exception e) {
			System.out.println(e);
		}
			

	    System.out.println("Enter studentName:");
	    String studentName=null;
	    boolean studentNamestatus=true;
	    try {
	    	while(studentNamestatus) {
	    		studentName=scannerobj.nextLine();
	    		if(!studentName.isEmpty()) {
	    			stdobj.setStudentName(studentName); 
	    			studentNamestatus=false;
	    			}else {
	    				System.out.println("!Please Enter valid StudentName!");
	    			}
	    }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	   
	    
	  
	    System.out.println("Enter studentEmailId:");
	    String EmailId=null;
	    boolean EmailIdstatus=true;
	    try {
	    	while(EmailIdstatus) {
	    		EmailId=scannerobj.nextLine();
	    		if(!EmailId.isEmpty()) {
	    			stdobj.setEmailId(EmailId); 
	    			EmailIdstatus=false;
	    			}else {
	    				System.out.println("!Please Enter valid StudentEmailId!");
	    			}
	    }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    
	    
	    System.out.println("Enter studentPassword:");
	    String password=null;
	    boolean passwordstatus=true;
	    try {
	    	while(passwordstatus) {
	    		password=scannerobj.nextLine();
	    		if(!password.isEmpty()) {
	    			stdobj.setPassword(password); 
	    			passwordstatus=false;
	    			}else {
	    				System.out.println("!Please Enter valid StudentPassword!");
	    			}
	    }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    
	    
	   
	    System.out.println("Enter studentMobileNumber:");
	    long Mobileno=0;
	    boolean Mobilenostatus=true;
	    try {
	    	while(Mobilenostatus) {
	    		Mobileno=scannerobj.nextLong();
	    		if(0<Mobileno) {
	    			stdobj.setMobileno(Mobileno); 
	    			Mobilenostatus=false;
	    			scannerobj.nextLine();
	    			}else {
	    				System.out.println("!Please Enter valid StudentMobileno!");
	    			}
	    }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    
	    
	    System.out.println("Enter studentAddress:");
	    String Address=null;
	    boolean Addressstatus=true;
	    try {
	    	while(Addressstatus) {
	    		Address=scannerobj.nextLine();
	    		if(!Address.isEmpty()) {
	    			stdobj.setAddress(Address); 
	    			Addressstatus=false;
	    			}else {
	    				System.out.println("!Please Enter valid StudentAdress!");
	    			}
	    }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    
	    
	    System.out.println("Enter studentCity:");
	    String City=null;
	    boolean Citystatus=true;
	    try {
	    	while(Citystatus) {
	    		City=scannerobj.nextLine();
	    		if(!City.isEmpty()) {
	    			stdobj.setCity(City); 
	    			Citystatus=false;
	    			}else {
	    				System.out.println("!Please Enter valid StudentCity!");
	    			}
	    }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    
	    
	    System.out.println("Enter studentCountry");
	    String Country="";
	    boolean Countrystatus=true;
	    try {
	    	while(Countrystatus) {
	    		Country=scannerobj.nextLine();
	    		if(!Country.isEmpty()) {
	    			stdobj.setCountry(Country); 
	    			Countrystatus=false;
	    			}else {
	    				System.out.println("!Please Enter valid StudentCountry!");
	    			}
	    }
	    	}catch(Exception e) {
	    		System.out.println(e);
	    	}
	    
	    System.out.println("Student Information Has Been Created Successfully");
	    
	    StudentBOList.add(stdobj);
	    System.out.println("Redirecting to Login");
	    studentLogin(stdobj.getEmailId(),stdobj.getPassword());
	}
	
	public void studentLogin(String userName,String password) {
		System.out.println("!!Welcome To The Login!!");
		Scanner obj=new Scanner(System.in);
		boolean studentloginstatus=true;
		try {
			while(studentloginstatus) {
				System.out.println("Please Enter Your Username:");
				String uName=obj.nextLine();
				System.out.println("Please Enter Your Password:");
				String pass=obj.nextLine();
				if(userName.equals(uName) && password.equals(pass)) {
				 System.out.println("!!You Have Successfully Logged-In!!");
				 studentloginstatus=false;
				 System.out.println("Please Choose Anyone Option:");
				 System.out.println("Type:1-viewStudent");
				 System.out.println("Type:2-listStudent");
				 System.out.println("Type:3-deleteStudent");
				 System.out.println("Type:4-editStudent");
				 
				 int optionNumber=obj.nextInt();
				 switch(optionNumber) {
				 case 1:
					 viewStudent();
				     break;
				 case 2:
						listStudent();
						break;
					case 3:
						deleteStudent();
						break;
					case 4:
						editStudent();
						break;
				 default:
					 System.out.println("Please Give valid Option");
				 }
				}else {
					System.out.println("!!Please Check Your Credentials!!");
				}
			}
		}catch(Exception e) {
			System.out.println(e);
			}
	}

	
     private void Exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewStudent() {
		// TODO Auto-generated method stub
		System.out.println("!!!Welcome to View Student Details!!!");
		System.out.println("Please Enter StudentId:");
		Scanner scannerobj=new Scanner(System.in);
		int studentId=scannerobj.nextInt();
		for(StudentBO StudentBO : StudentBOList) {
			System.out.println("studentId is:"+StudentBO.getStudentId());
			System.out.println("studentName is:"+StudentBO.getStudentName());
			System.out.println("studentEmailId is:"+StudentBO.getEmailId());
			System.out.println("studentPassword is:"+StudentBO.getPassword());
			System.out.println("studentMobileNumber is:"+StudentBO.getMobileno());
			System.out.println("studentPassword is:"+StudentBO.getAddress());
			System.out.println("studentCity is:"+StudentBO.getCity());
			System.out.println("studentCountry is:"+StudentBO.getCountry());
			
		}	
		     System.out.println("~~~~~List Of Student~~~~~");
		     
			 System.out.println("Type:1-EditStudent");
			 System.out.println("Type:2-ListStudent");
			 System.out.println("Type:3-DeleteStudent");
			 System.out.println("Type:4-CreateStudent");
			 
			 int optionvalue=scannerobj.nextInt();
				 switch(optionvalue) {
				 case 1:
					 editStudent();
					 break;
				 case 2:
					 listStudent();
					 break;
				 case 3:
					 deleteStudent();
					 break;
				 case 4:
					 createStudent();
					 break;
				default:
					System.out.println("Please give Valid Option");
				 }
     }
     
	@Override
	public void listStudent() {
		
		
		// TODO Auto-generated method stub
		System.out.println("~~~~~List Of Students~~~~~");
		
		for(StudentBO student :StudentBOList) {
			System.out.println("StudentId is:"+student.getStudentId());
			System.out.println("StudentName is:"+student.getStudentName());
			System.out.println("StudentEmailId is:"+student.getEmailId());
			System.out.println("StudentPassword is:"+student.getPassword());
			System.out.println("StudentMobileno is:"+student.getMobileno());
			System.out.println("StudentAddress is:"+student.getAddress());
			System.out.println("StudentCity is:"+student.getCity());
			System.out.println("StudentCountry is:"+student.getCountry());
		}
		 System.out.println("~~~~~List of Student~~~~~");
		 
		System.out.println("Type 1:View Student");
		System.out.println("Type 2:Edit Student");
		System.out.println("Type 3:Delete Student");
		System.out.println("Type 4:Create Student");
		
		Scanner scannerobj=new Scanner(System.in);
		int optionmenu=scannerobj.nextInt();
		switch(optionmenu) {
		case 1:
			viewStudent();
			break;
		case 2:
			editStudent();
			break;
		case 3:
			deleteStudent();
			break;
		case 4:
			createStudent();
			break;
		default:
			System.out.println("Please Give Valid Optionmenu");
		}
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Delete Student");
		Scanner scannerobj=new Scanner(System.in);
		System.out.println("Please Enter StudentId:");
		int studentId=scannerobj.nextInt();
		Iterator<StudentBO>iteratorobj=StudentBOList.iterator();
		while(iteratorobj.hasNext()) {
			StudentBO stdobj=iteratorobj.next();
			if(studentId==stdobj.getStudentId()) {
				iteratorobj.remove();
				System.out.println("Student Has Been Deleted Successfully");
			}
		}
		System.out.println("Redirecting to List Student");
		listStudent();
	}
	@Override
	public void searchStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editStudent() {
		// TODO Auto-generated method stub
		System.out.println("!!Welcome To Edit Student!!");
		Scanner scannerobj=new Scanner(System.in);
		StudentBO stdBO=new StudentBO();
		System.out.println("Please Enter StudentId:");
		int editstudentId=scannerobj.nextInt();
		scannerobj.nextLine();
		for(StudentBO studentBO : StudentBOList) {
			if(studentBO.getStudentId()==editstudentId) {
				System.out.println("Please Enter StudentName:");
				String studentName=null;
				boolean studentNamestatus=true;
				try {
				while(studentNamestatus) {
			    studentName = scannerobj.nextLine();
				if(!studentName.isEmpty()) {
					stdBO.setStudentName(studentName);
					studentNamestatus=false;
				}else {
					System.out.println("Please Enter Valid StudentName");
				}
			 }
				}
			catch(Exception e) {
				System.out.println(e);
			}
		
				System.out.println("Please Enter StudentEmailId");
				String EmailId=null;
				boolean EmailIdstatus=true;
				try {
					while(EmailIdstatus) {
					EmailId=scannerobj.nextLine();
				    if(!EmailId.isEmpty()) {
				    stdBO.setEmailId(EmailId);	
				    EmailIdstatus=false;
				}else {
					System.out.println("Please Enter Valid StudentEmailId");
				}
					}
				}catch(Exception e) {
					System.out.println(e);
				}
				
				System.out.println("Please Enter StudentPassword:");
				String Password=null;
				boolean Passwordstatus=true;
				try {
					while(Passwordstatus) {
				    Password=scannerobj.nextLine();
				    if(!Password.isEmpty()) {
					stdBO.setPassword(Password);
					Passwordstatus=false;
				}else {
					System.out.println("Please Enter Valid StudentPassword");
				 }
				}
			}catch(Exception e) {
				System.out.println(e);
			}
				
				System.out.println("Please Enter StudentMobileNumber:");
				long Mobileno=0;
				boolean Mobilenostatus=true;
				try {
					while(Mobilenostatus) {
					Mobileno=scannerobj.nextLong();
				    if(0<Mobileno) {
				    stdBO.setMobileno(Mobileno);
				    Mobilenostatus=false;
				}else {
					System.out.println("Please Enter Valid StudentMobileNumber");
				}
					}
		}catch(Exception e) {
			System.out.println(e);
		}
				
			scannerobj.nextLine();
			System.out.println("Please Enter StudentAddress:");
			String Address=null;
		    boolean Addressstatus=true;
		    try {
		    	while(Addressstatus) {
			    Address=scannerobj.nextLine();
			    if(!Address.isEmpty()) {
				stdBO.setAddress(Address);
				Addressstatus=false;
			}else {
				System.out.println("Please Enter Valid StudentAddress");
			}
		    	}
		    }catch(Exception e) {
		    	System.out.println(e);
		    }
		
		System.out.println("Please Enter StudentCity");
		String City=null;
		boolean Citystatus=true;
		try {
			while(Citystatus) {
				City=scannerobj.nextLine();
		        if(!City.isEmpty()) {
			    stdBO.setCity(City);
			    Citystatus=false;
		}else {
			System.out.println("Please Enter Valid StudentCity");
		      }
		}
	      }catch(Exception e) {
		        System.out.println(e);
			}
		
		System.out.println("Please Enter StudentCountry");
		String  County=null;
		boolean Countrystatus=true;
		try {
			while(Countrystatus) {
		      Country=scannerobj.nextLine();
		      if(!Country.isEmpty()) {
			  stdBO.setCountry(Country);
			  Countrystatus=false;
		}else {
			System.out.println("Please Enter Valid StudentCountry");
		  }
		}
			}catch(Exception e) {
				System.out.println(e);
		}
		}
		}
		
			
		StudentBOList.add(stdBO);
		System.out.println("~~~~~List Of Students~~~~~");
        System.out.println("Student Information Has Been Edited Successfully");
	    System.out.println("Redirecting to Login");
	    listStudent();
    }
}

  


 

 
	