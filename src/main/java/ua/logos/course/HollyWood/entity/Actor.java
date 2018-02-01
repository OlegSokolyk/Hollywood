package ua.logos.course.HollyWood.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor extends BaseEntity{
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")	
	private String lastName;
	
	@Column(name = "date_of_birth")	
	private String dateOfBirth;
	
	@Column(name = "create_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date creationDate;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@ManyToMany
	@JoinTable(name = "actor_id", joinColumns = @JoinColumn(name = "film_id"))
	private List<Film> films = new ArrayList<>();

	public Actor() {
	}

	public Actor(String firstName, String lastName, String dateOfBirth,
			Date creationDate, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.creationDate = creationDate;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Actor [firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", creationDate="
				+ creationDate + ", gender=" + gender + "]";
	}
	
	
	
}
