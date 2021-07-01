

public class Ex01 {
	public static void main(String[] args) {
		int[][][][] arr = new int[2][3][4][5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					for(int h = 0; h < arr[i][j][k].length; h++) {
						arr[i][j][k][h] = h;
					}
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					for(int h = 0; h < arr[i][j][k].length; h++) {
						System.out.print(arr[i][j][k][h] + ",");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
