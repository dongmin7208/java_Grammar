package tv;

public class TV{
	boolean power;
	int channel;
	int volume;
	
	void power(){
		power = !power;
		if(power){
			view();
		}
	}
	void channel(int ch){	//1이면 증가 2면 감소
		if(!power) return ;
		switch(ch){
		case 1:channel++;break;
		case 2:channel--;break;
		}
		if(channel < 0) channel = 0;
		view();
	}
	void volume(int vol){	//1이면 증가 2면 감소
		if(!power) return ;
		switch(vol){
		case 1:volume++;break;
		case 2:volume--;break;
		}
		if(volume < 0) volume = 0;
		view();
	}
	void intf(int sel){
		switch(sel){
		case 1:power();break;
		case 2:channel(1);break;
		case 3:channel(2);break;
		case 4:volume(1);break;
		case 5:volume(2);break;
		}
	}
	void view(){
		if(power){
			System.out.printf("%-10s\n","┌───────────┐");
			System.out.printf("│ch %-7d │\n", channel);
			System.out.printf("│vol %-6d │\n", volume);
			System.out.printf("%-10s\n","│           │");
			System.out.printf("%-10s\n","│ 방송	    │");
			System.out.printf("%-10s\n","└───────────┘");
		}
		else{
			System.out.printf("%-10s\n","┌───────────┐");
			System.out.printf("%-10s\n","│           │");
			System.out.printf("%-10s\n","│           │");
			System.out.printf("%-10s\n","│           │");
			System.out.printf("%-10s\n","│           │");
			System.out.printf("%-10s\n","└───────────┘");
		}
	}
}