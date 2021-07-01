package day04;

public class Ex01 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i+".Hello java");
		}
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			if(ch != 'Z')
				System.out.print(",");
		}
	}
}
