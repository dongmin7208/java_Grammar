package day20;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<Integer, Person> hm = 
				new HashMap<Integer, Person>();
		int count = 0;
		Person p1 = new Person("ȫ�浿1", 21);
		Person p2 = new Person("ȫ�浿2", 22);
		Person p3 = new Person("ȫ�浿3", 23);
		
		hm.put(new Integer(count++), p1);
		hm.put(new Integer(count++), p2);
		hm.put(new Integer(count++), p3);
		
		System.out.println(hm.get(1));
		
		Person p4 = new Person("�̼���", 34);
		hm.put(1, p4);
		
		System.out.println(hm.get(1));
		
		hm.put(count, p4);
		System.out.println(hm.get(3));
		
		
		
	}
}
