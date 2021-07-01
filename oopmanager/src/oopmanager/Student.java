package oopmanager;

import abstractpackage.Info;

public class Student extends Info{

	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double avg;
	
	
	public Student(int num, String name, int age, int kor, int eng, int mat) {
		super.setNumber(num);
		super.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.calc();
	}
	private void calc(){
		sum = kor + eng + mat;
		avg = sum / 3.0;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calc();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calc();
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		calc();
	}
	public int getSum() {
		return sum;
	}
	
	public double getAvg(){
		return avg;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + mat;
		result = prime * result + sum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (mat != other.mat)
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}
	@Override
	public String toString(){
		String tmpAvg = String.format("%.2f", avg);
		return "["+super.getNumber()+":"+super.name+","+
				super.age+","+kor+","+eng+","+mat+","+sum+","+tmpAvg+"]";
	}
	@Override
	public void infoPrint() {
		System.out.println(toString());
	}
}


