package abstractpackage;

public abstract class Info {
	private int number;
	protected String name;
	protected int age;
	public void setNumber(int n){
		number = n;
	}
	public int getNumber(){
		return this.number;
	}
	public abstract void infoPrint();
}


