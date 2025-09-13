package com.example.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="csesort")
public class SortEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int skills;
	@Column
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSkills() {
		return skills;
	}
	public void setSkills(int skills) {
		this.skills = skills;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
