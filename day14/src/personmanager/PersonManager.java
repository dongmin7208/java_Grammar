package personmanager;

public class PersonManager {
	private static final int DEFAULT_SIZE = 5;
	private Person[] ps;
	private int index;
	private int size;
	private int max;
	
	private void init(int size) {
		this.ps = new Person[size];
		this.size = size;
		this.max = size;
		this.index = 0;
	}
	
	public PersonManager() {
		this.init(DEFAULT_SIZE);
	}
	
	public PersonManager(int size) {
		this.init(size);
	}
	
	public void insert(Person p) {
		if(max == index) return;
		int i = 0;
		for(i = 0; i < index; i++) {
			if(ps[i] == null) {
				ps[i] = p;
				break;
			}
		}
		ps[i] = p;
		index++;
		size++;
	}
	
	public int search(String name) {
		if(size == 0) return -1;
		for(int i = 0; i < index; i++) {
			if(ps[i] != null) {
				if(ps[i].equalName(name)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public int[] searchAll(String name) {
		if(size == 0) return null;
		int[] tmp = new int[size];
		int cnt = 0;
		for(int i = 0; i < index; i++) {
			if(ps[i] != null) {
				if(ps[i].equalName(name)) {
					tmp[i] = i;
					cnt++;
				}
			}
		}
		int[] ret = new int[cnt];
		for(int i = 0; i < tmp.length; i++) {
			if(tmp[i] != 0) {
				ret[--cnt] = tmp[i];
			}
		}
		return ret;
	}
	
	//전체목록
	public void printPerson() {
		for(int i = 0; i < max; i++) {
			if(ps[i] != null)
				System.out.println(i+1+"." + ps[i].getString());
		}
	}
	
	public Person getPerson(int index) {
		return (ps[index] != null) ? ps[index] : null;
	}
}
