package day08;

public class Ex05 {
	public static void main(String[] args) {
		int[] num = {4,8,2,7,6};
		
		for(int i = 0; i < num.length-1; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + ",");
		}
	}
}
