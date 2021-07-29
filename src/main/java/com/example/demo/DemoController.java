
// Map request  to JSON and send the response to Tomacat server.
package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping(value = "print")
	private String Print() {
		return "Hellow World";
	}
	
	@GetMapping(value = "showStudent")
	private Student showStudent() {
		Student stu = new Student();
		stu.setName("Udara");
		stu.setAddress("Minuwangoda");
		return stu;
		
	}

	@GetMapping(value = "toatlScore")
	private TotalScoreResponseDTO totalScore() {
	 TotalScoreResponseDTO  totalScoreDto = new TotalScoreResponseDTO();
	 totalScoreDto.setAssetId("c14c78ac-990b-4ccc-9a1d-dc0cd02d756");
	 totalScoreDto.setTitle("28_10_course_5605637135 - 28-10-20 - 199961");
	 totalScoreDto.setStatus("PAST_DUE");
	 totalScoreDto.setCourseSectionId("5f9940e8d1d3de001a08da39");
	return totalScoreDto;
	}
	
	/*
	 * @PostMapping("/addStudent")
	 * 
	 * @ResponseStatus(HttpStatus.CREATED) private Student addNew (@RequestBody
	 * Student stu1) { Student stu = new Student(); return stu.addStudent(stu1); }
	 */
	

}
