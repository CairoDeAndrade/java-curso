package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double wage;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, Double wage) {
		this.id = id;
		this.name = name;
		this.wage = wage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWage() {
		return wage;
	}

	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", wage=" + wage;
	}

	public void increaseWage(Integer increasePercentage) {
		wage *= (increasePercentage / 100);
	}
}
