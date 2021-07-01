package doll;

public class MainUse {
	public static void main(String[] args) {
		SpeekDoll sd = new SpeekDoll();
		
		Battery baa = new Battery();
		baa.capacity = 100;
		baa.type = "AA";
		
		sd.SpeekMessage();
		sd.setBattery(baa);
		
		Battery baaa = new Battery();
		baaa.capacity = 100;
		baaa.type = "AAA";
		
		sd.setBattery(baaa);
		sd.SpeekMessage();
		System.out.println(baaa.getCapacity());
		
		sd.setMessage("달링 알라뷰!");
		sd.SpeekMessage();
		System.out.println(baaa.getCapacity());
		
		sd.setMessage("달링 헤잇유!");
		sd.SpeekMessage();
		System.out.println(baaa.getCapacity());

		sd.setMessage("참 쉽죠?");		
		sd.SpeekMessage();
		System.out.println(baaa.getCapacity());
		
		sd.SpeekMessage();
		System.out.println(baaa.getCapacity());
		
		Battery baaa2 = new Battery();
		baaa2.capacity = 100;
		baaa2.type = "AAA";
		
		baaa = sd.removeBattery();
		sd.SpeekMessage();
		
		sd.setBattery(baaa2);
		sd.SpeekMessage();
		System.out.println(baaa2.getCapacity());
		System.out.println(baaa.getCapacity());
	}
}
