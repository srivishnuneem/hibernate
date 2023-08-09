package com.demo.hibernate;

	import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(name="STUDENT_INFORMATION")
	public class Student_Info 
	{ 
		
	   @Id//setting primary key
		private int rollNo;
		private String name;
		
		public int getRollNo() 
		{
			return rollNo;
		}
			
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return +this.rollNo+" : " +this.name+"";
	}
	

	}


