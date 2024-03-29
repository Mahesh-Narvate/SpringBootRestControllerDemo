package io.course.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.course.topic.TopicBO;

@RestController
public class CourseController {
    
	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<CourseBO> getAllCourses(@PathVariable String id) {
		
		List<CourseBO> result = CourseService.getAllCourses(id);
		return result;
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<CourseBO> getCourse(@PathVariable String id) { 
		
		return CourseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody CourseBO course,@PathVariable String topicId) {
		course.setTopic(new TopicBO(topicId,"",""));
		CourseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody CourseBO course,@PathVariable String topicId,@PathVariable String id) {
		course.setTopic(new TopicBO(topicId,"",""));
		CourseService.updateCourse(course);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@RequestBody CourseBO course,@PathVariable String id) {
		CourseService.deleteCourse(id);
	}
}
