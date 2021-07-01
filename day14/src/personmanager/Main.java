package personmanager;

public class Main {
	public static void main(String[] args) {
		PersonManager pm = 
				new PersonManager();
		
		pm.insert(new Person("ȫ�浿2", 21));
		pm.printPerson();
		pm.insert(new Person("ȫ�浿1", 22));
		pm.insert(new Person("ȫ�浿2", 23));
		pm.insert(new Person("ȫ�浿4", 24));
		pm.insert(new Person("ȫ�浿3", 25));
		pm.printPerson();
		
		System.out.println(pm.search("ȫ�浿"));
		System.out.println(pm.search("ȫ�浿2"));
		
		int[] sarr = pm.searchAll("ȫ�浿2");
		for(int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + ",");
		}
		System.out.println();
		
		System.out.println(pm.getPerson(pm.search("ȫ�浿4")).getName());

	}
}
