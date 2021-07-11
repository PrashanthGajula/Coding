package javaObjectOriented;

public class JavaDeveloper extends Employee{

	public JavaDeveloper(int id, String name, int yearsOfExperience) {
		super(id, name, yearsOfExperience);
	}

	@Override
	public int computeSalary() {
		if(yearsOfExperience>5) return 20000;
		else return 10000;
	}

}
