package javaObjectOriented;

public abstract class Employee {
	public int id;
	public String name;
	public int yearsOfExperience;
	
	public abstract int computeSalary();

	public Employee(int id, String name, int yearsOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public void details() {
		System.out.println("Name " + name);
	}

}
