package io.course.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import io.course.topic.TopicBO;

@Entity
public class CourseBO {
	@Id
	private String id;
	private String name;
	private String Description;
	
	@ManyToOne
	private TopicBO topic;
	
	public TopicBO getTopic() {
		return topic;
	}

	public void setTopic(TopicBO topic) {
		this.topic = topic;
	}

	public CourseBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseBO(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.topic = new TopicBO(topicId,"","");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public CourseBO(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	

}
