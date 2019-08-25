package io.course.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TopicRepository extends CrudRepository<TopicBO, String>{
	

}
