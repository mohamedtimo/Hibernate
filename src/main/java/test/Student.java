package test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="student_table")
public class Student {
	
	@Id
	private int id;
	private StudentName name;
	private String color;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
	

}
