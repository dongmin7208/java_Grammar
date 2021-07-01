package personmanager;

public class Person {
	private String name;
	private int age;
	
	public Person(Person p) {
		this(p.name, p.age);
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public boolean equalName(String name) {
		return (this.name.equals(name))? true : false;
	}
	
	public String getString() {
		return "[" + name + ", " + age + "]";
	}
	
}
