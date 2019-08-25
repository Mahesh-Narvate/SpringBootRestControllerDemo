package io.course.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CourseService {

	@Autowired(required = true)
	private CourseRepository courserepository;

	public List<CourseBO> getAllCourses(String topicId) {
		List<CourseBO> courses = new ArrayList<>();
		courses=courserepository.findByTopicId(topicId);
		return courses;
	}

	public Optional<CourseBO> getCourse(String id) {
      return courserepository.findById(id);
	}

	public void addCourse(@RequestBody CourseBO course) {
		// topics.add(topic);
		courserepository.save(course);
	}//

	public void updateCourse(CourseBO course) {

		courserepository.save(course);
	}

	public void deleteCourse(String id) {

		courserepository.deleteById(id);
	}
}
