package day19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		HashSet<Integer> lottoNum = new HashSet<Integer>();
		Random ran = new Random();
		for(int i = 0; i < 10; i++) {
			while(lottoNum.size() < 6) {
				lottoNum.add(ran.nextInt(45) + 1);
			}
		
			Integer[] nums = 
					(Integer[]) lottoNum.toArray(new Integer[0]);
			Arrays.sort(nums);	//????
			
			for(Integer n : nums) {
				System.out.print("" + n + " ");
			}
			System.out.println();
			lottoNum.clear();
		}
	}
}
