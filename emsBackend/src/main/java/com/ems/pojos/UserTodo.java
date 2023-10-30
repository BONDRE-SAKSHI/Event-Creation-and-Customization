package com.ems.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;





@Entity
@Table(name="user_todo")
public class UserTodo extends BaseEntity{
	
	@Column(length = 200)
private String todo;
	@Column(length = 20)
private String status;
	
	public UserTodo() {
		
	}
	
	public UserTodo(String todo, String status) {
		
		this.todo = todo;
		this.status = status;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
