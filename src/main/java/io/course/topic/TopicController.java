package io.course.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    
	@Autowired
	private TopicService TopicService;
	
	@RequestMapping("/topics")
	public List<TopicBO> getTopics() {
		System.out.println("asdasdasdasdass1111111111111111111111111111111111111111");
		
		return TopicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<TopicBO> getTopic(@PathVariable String id) { 
		return TopicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody TopicBO topic) {
		TopicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody TopicBO topic,@PathVariable String id) {
		TopicService.updateTopic(id,topic);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@RequestBody TopicBO topic,@PathVariable String id) {
		TopicService.deleteTopic(id);
	}
}
