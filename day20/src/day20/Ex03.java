package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] {
				5,7,2,4,3,6,5,8,4,9
		};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int a : arr) {
			set.add(a);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>(set);
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)+ ",");
		}
		System.out.println("\n====================");		
	}
}
