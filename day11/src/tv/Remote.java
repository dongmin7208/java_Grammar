package tv;

public class Remote {
	TV tv;
	void setTV(TV t){
		tv = t;
	}
	void intf(int sel){
		tv.intf(sel);
	}
}
