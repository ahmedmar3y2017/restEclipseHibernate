package Entities;
// Generated Aug 1, 2017 4:24:49 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Topics generated by hbm2java
 */
@Entity
@Table(name = "topics", catalog = "test")
public class Topics implements java.io.Serializable {

	private String id;
	private String description;
	private String username;
	private Set<Course> courses = new HashSet<Course>(0);

	public Topics() {
	}

	public Topics(String id) {
		this.id = id;
	}
	

	public Topics(String id, String description, String username) {
		super();
		this.id = id;
		this.description = description;
		this.username = username;
	}

	public Topics(String id, String description, String username, Set<Course> courses) {
		this.id = id;
		this.description = description;
		this.username = username;
		this.courses = courses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "topics")
	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
