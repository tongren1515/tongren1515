package model;

import javax.annotation.PostConstruct;

public class Type{
	private int id;
	private String name;
	
	@PostConstruct
	public void init() {
		System.out.println("�ḻ");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("ִ�з���");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type() {
		
	}
	public Type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
