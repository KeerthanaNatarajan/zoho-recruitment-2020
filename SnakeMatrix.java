
public class SnakeMatrix {

	public static void main(String[] args) {
		int[][] input ={ { 1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}	};
		int length = input.length;
		int range = length * ((length*2)-1);
		while(range>0) {
			for(int i = 0; i< length; i++) {
				int space = 1;
				int count = 0;
				while(length-space-i > 0) {
					System.out.print("_    ");
					space++;
					count++;
					range = range-1;
				}
				if(i%2 == 0) {
					for(int j = 0; j < input[0].length; j++) {
						System.out.print(input[i][j] + "    ");
						range = range - 1;
						count++;
					}
				}else {
					for(int j = input[0].length - 1; j >= 0; j--) {
						System.out.print(input[i][j] + "    ");
						range = range - 1;
						count++;
					}
				}
				while(count < (length*2)-1) {
					System.out.print("_    ");
					count++;
					range = range - 1;
				}
				System.out.println();
			}
		}
	}
}
