package io.course.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TopicService {

	@Autowired(required = true)
	private TopicRepository topicrepository;

	private List<TopicBO> topics = new ArrayList<>(Arrays.asList(new TopicBO("1", "Spirituality", "For inner peace"),
			new TopicBO("2", "medidation", "For inner peace"), new TopicBO("3", "yoga", "For inner peace")));

	public List<TopicBO> getAllTopics() {
		// return topics;
		List<TopicBO> topics = new ArrayList<>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}

	public Optional<TopicBO> getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
      return topicrepository.findById(id);
	}

	public void addTopic(@RequestBody TopicBO topic) {
		// topics.add(topic);
		topicrepository.save(topic);
	}//

	public void updateTopic(String id, TopicBO topic) {

		topicrepository.save(topic);
	}

	public void deleteTopic(String id) {

		topicrepository.deleteById(id);
	}
}
