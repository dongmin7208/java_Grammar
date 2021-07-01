package doll;

public class Battery {
	int capacity;
	String type;
	
	public int getCapacity() {
		return capacity;
	}
	public void use(int spkUseWatt) {
		capacity -= spkUseWatt;
		if(capacity < 0) {
			capacity = 0;
		}
	}
	public String getType() {
		return type;
	}
	
}
