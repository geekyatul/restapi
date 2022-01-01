package com.wipro.Rest_Assign_3.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wipro.Rest_Assign_3.model.Student;

public class StudentRepo {
   
	   List<Student> students;
	
	   public StudentRepo()
	   {
		   
		   students=new ArrayList<>();
		   Student s1=new Student("S001","atul patel","15th",90);
		   Student s2=new Student("S002","rahul patel","14th",95);
		   
		   Student s3=new Student("S003","saching singh","13th",98);
		   
		   Student s4=new Student("S004","ajay yadav","11th",97);
		   
		   Student s5=new Student("S005","amit yadav","19th",88);
		     
		   students.add(s1);
		   students.add(s2); 
		   students.add(s3);
		   students.add(s4);
		   students.add(s5);  
		   
	   }
	   
	   //get all the student 
	   public List<Student> allStudent()
	   {
		   return students;
	   }
	   
	   // get the student by id 
	   public Student student(String id)
	   {
		   for(Student student:students)
		   {
			   if(id.equalsIgnoreCase(student.getStudentId()))
				    return student;
		   }
		   return null;
	   }
	
	   //this is used all the student marks greate than marks
	   public List<Student> studentGreaterThanMarks(float marks)
	   {  
		   List<Student> studentMarksGreaterList=new ArrayList<>();
		   for(Student student:students)
		   {
			   if(marks<student.getStudentTotalMarks())
			   {
				   studentMarksGreaterList.add(student);
			   }
		   }
		   return studentMarksGreaterList;
	   }
	   
	   
	   //this is used to add the student
	   public void addStudent(Student student)
	   {
		    System.out.println("before adding the student"+students);
		    students.add(student); 
		   
		    System.out.println("after adding the student"+students);
	   }
	   
	   //This is used for update the student
	   public void updateStudent(Student student)
	   {
		   //update at particular point 
		   //first find index then add 
		  
		   //remove the current object id 
		   
		   Iterator iterator=students.iterator();
		   
		   System.out.println("before updating "+students);
		   
		   while(iterator.hasNext())
		   {
			   
	          Student s=(Student)iterator.next();
	          if(s.getStudentId().equalsIgnoreCase(student.getStudentId()))
	          {
	        	  iterator.remove();
	          }
			   
			   
		   }
		   
		   System.out.println("after removing element  updating "+students);
		   
		   students.add(student);
		   
		   System.out.println("after updating "+students);
			  
		   
		  
		   
	   }
	   
	   //this is used for delete the student 
	   public Student removeStudent(String id)
	   {
		  Student student=null;
		  int flag=0;
		  Iterator iterator=students.iterator();
		   
		   System.out.println("before deleting "+students);
		   
		   while(iterator.hasNext())
		   {
			   
	          Student s=(Student)iterator.next();
	          if(s.getStudentId().equalsIgnoreCase(student.getStudentId()))
	          {
	        	  iterator.remove();
	        	  flag=1;
	        	  break;
	          }
			   
			   
		   }
		   
		   return flag==1?student:null;
		  
		   
	   }
	   
}
