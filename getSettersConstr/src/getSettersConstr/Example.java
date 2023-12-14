package getSettersConstr;

public class Example {
	
	private String name;
	private int age;
	private boolean permission;
	
	public Example(String name, int age, boolean permission) {
		super();
		this.name = name;
		this.age = age;
		this.permission = permission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isPermission() {
		return permission;
	}

	public void setPermission(boolean permission) {
		this.permission = permission;
	}
	
	
	public String toString() {
		
		return "Name: " + name  + ", " +
		"Age: " + age + ", " +
		"Permission: " + permission;
		
	}
	
	
	

}
