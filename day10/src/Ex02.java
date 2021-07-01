import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = null;
		System.out.println("행 수:");
		int row = Integer.parseInt(in.nextLine());
		arr = new int[row][];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+"번째 행의 열 수:");
			int col = Integer.parseInt(in.nextLine());
			arr[i] = new int[col];
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
