package model;

public class Type2 {
	private int id;
	private String name;
	private Type t;
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
	public Type2() {
		System.out.println("fewf");
	}
	public Type2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Type getT() {
		return t;
	}
	public void setT(Type t) {
		this.t = t;
	}
	public Type2(Type t) {
		super();
		this.t = t;
	}
	
	
}
