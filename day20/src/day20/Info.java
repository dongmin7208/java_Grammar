package day20;

public class Info{
	String name;
	int age;
	Info(String name, int age){
		this.name = name; this.age = age;
	}
	
	
//	public int hashCode() {
//		System.out.println("hashCode호출됨");
//		//return super.hashCode();
//		return name.hashCode() + age;
//	}
//	
//	public boolean equals(Object o) {
//		System.out.println("equals호출됨");
//		//return super.equals(o);
//		Info tmp = (Info)o;
//		return (this.name.equals(tmp.name) && this.age == tmp.age) ? true : false;
//	}
//	public String toString() {
//		return "[" + name + ", "+ age + "]";
//	}
	
	//이클립스로 자동추가
	
	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}


//	@Override
//	public int hashCode() {
//		System.out.println("hashCode호출");
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}


	@Override
	public boolean equals(Object obj) {
		System.out.println(this + "와 비교:" + obj);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Info other = (Info) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}