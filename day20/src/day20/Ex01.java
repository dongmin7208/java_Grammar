package day20;

import java.util.ArrayList;
import java.util.Iterator;


public class Ex01 {
	public static void main(String[] args) {
		Info[] arr = new Info[3];
		arr[0] = new Info("ȫ�浿1", 20);
		arr[1] = new Info("ȫ�浿2", 20);
		arr[2] = new Info("ȫ�浿3", 20);
		
		ArrayList<Info> ls = new ArrayList<Info>();
		ls.add(arr[0]);
		ls.add(arr[1]);
		ls.add(arr[2]);
		
		for(Info tmp : ls) {
			System.out.println(tmp);
		}
		Info tmp = arr[1];
		Info tmp2 = new Info("ȫ�浿2", 20);
		System.out.println("tmp2��ü:" + tmp2);
		//boolean contains(E e);
		//System.out.println(ls.contains(tmp2));
		if(ls.contains(tmp2)) {
			int index = ls.indexOf(tmp2);
			Info temp = ls.get(index);
			System.out.println("�˻����:" + temp);
		}
		System.out.println("=====================");
		ArrayList ls2 = new ArrayList();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());

		System.out.println(i1.equals(i2));
		System.out.println(i1 == i2);
		
		ls2.add(i1);
		ls2.add(10);
		System.out.println(ls2.contains(new Integer(10)));
		System.out.println("=====================");
		
		ArrayList ls3 = new ArrayList();
		String s1 = new String("10");
		String s2 = new String("10");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		ls3.add(s1);
		ls3.add("10");
		System.out.println(ls3.contains(new String("10")));
		System.out.println("=====================");

		//�̷��� ���� ���ô�~ ����Ʈ�� �ִ� �޼��带 �̿��غ���
		for(int i = 0; i < ls.size(); i++) {
			Info t = ls.get(i);
			
			if(new Info("ȫ�浿", 20).equals(t)) {
				System.out.println("����");
			}
		}
	}
}





