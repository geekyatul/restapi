package com.wipro.Rest_Assign_3.controller;

import java.util.List;

import com.wipro.Rest_Assign_3.model.Student;
import com.wipro.Rest_Assign_3.repository.StudentRepo;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentController {
	
	StudentRepo studentRepo=new StudentRepo();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Student> allStudent()
	 {
		 
		 return studentRepo.allStudent();
	 }
	
	@GET
	@Path("/student/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	 public Student student(@PathParam("id") String sid)
	 {
		 
		 return studentRepo.student(sid);
	 }
	
	@GET
	@Path("/marks/{mark}")
	@Produces(MediaType.APPLICATION_JSON)
	 public List<Student> studentGreaterThanMarks(@PathParam("mark") float marks)
	 {
		 
		 return studentRepo.studentGreaterThanMarks(marks);
	 }
	
	 @POST
	 @Path("/student")
	 @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	 @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	 public Student addStudent(@FormParam("id") String id,@FormParam("name") String name,@FormParam("class") String studentClass,
			 @FormParam("marks") float marks)
	 {
		Student student=new Student(id,name,studentClass,marks);	
		studentRepo.addStudent(student);
		return student;
	 }
	
	 
	 @PUT
	 @Path("/student")
	 @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	 public Student updateStudent(Student student)
	 {
		 studentRepo.updateStudent(student);
		 return student;
	 }
	 
	 @DELETE
	 @Path("student/{id}")
	 public Student deleteStudent(@PathParam("id") String id)
	 {
		 return studentRepo.removeStudent(id);
	 }
	
	
	

}
