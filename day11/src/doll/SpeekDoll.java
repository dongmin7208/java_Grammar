package doll;

public class SpeekDoll {
	Battery batt;
	String battType = "AAA";
	
	String message;
	int recUseWatt = 20;
	int spkUseWatt = 13;
	
	
	Battery removeBattery() {
		Battery tmpBatt = batt;
		batt = null;
		return tmpBatt;
	}
	
	void setBattery(Battery b) {
		if(!b.getType().equals(battType)) {
			System.out.println("Type 맞지 않음");
			return;
		}
		batt = b;
	}
	
	void setMessage(String msg) {
		if(batt == null) {
			System.out.println("건전지 없음");
			return;
		}
		else if(batt.getCapacity() - recUseWatt >= 0) {
			batt.use(recUseWatt);
			message = msg;
		}
	}
	
	String SpeekMessage() {
		if(batt == null) {
			System.out.println("건전지 없음");
			return "";
		}
		else if(batt.getCapacity() - spkUseWatt >= 0) {
			batt.use(spkUseWatt);
			System.out.println("Speek:" + message);
		}
		return message;
	}
}
