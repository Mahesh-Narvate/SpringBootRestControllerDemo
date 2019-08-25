package io.course.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TopicBO {
	@Id
	private String id;
	private String name;
	private String Description;
	

	
	public TopicBO() {
		super();
		// TODO Auto-generated constructor stub
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

	public TopicBO(String id, String name, String description) {
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
