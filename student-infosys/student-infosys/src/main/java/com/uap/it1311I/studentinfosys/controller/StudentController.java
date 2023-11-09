package com.uap.it1311I.studentinfosys.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it1311I.studentinfosys.model.Request;
import com.uap.it1311I.studentinfosys.model.Response;

@RestController
public class StudentController {
	
		//@Autowired
//		StudentGradeRepo studentGradeRepo;
		
	@PostMapping("/student/grade")
    public Response grade(@RequestBody Request request) {
			return new Response(request);
    }
    
//    @GetMapping("/students")
//    public List<Attendee> getAllAttendees() {
//        List<Attendee> attendees = registrationRepo.findAll(); 
//        return attendees;
    }
//}
