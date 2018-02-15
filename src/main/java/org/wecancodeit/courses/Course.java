package org.wecancodeit.courses;

public class Course {
	
	private String description;
	private String name;
	private String id;

	public Course(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "[" + id +"] " + "Name: " + name + " -" + description;
	}
}
