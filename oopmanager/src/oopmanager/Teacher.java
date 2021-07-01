package oopmanager;

import abstractpackage.Info;

public class Teacher extends Info {
	private String subject;
	
	public Teacher(int n){
		super.setNumber(n);
	}
	
	public Teacher(int num, String name, int age, String subject){
		super.setNumber(num);
		super.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(this.hashCode() == o.hashCode()) return true;
		Teacher tmp = (Teacher)o;
		return o.toString().equals(tmp.toString()) ? true : false;
	}
	@Override
	public String toString(){
		return "["+super.getNumber()+":"+name+","+age+","+subject+"]";
	}
	@Override
	public void infoPrint() {
		System.out.println(toString());
	}
}

