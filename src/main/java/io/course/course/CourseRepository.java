package io.course.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends CrudRepository<CourseBO, String>{
	
  public List<CourseBO> findByTopicId(String topicId);
}
