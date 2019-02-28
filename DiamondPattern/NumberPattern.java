import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter No Of Rows");
		int row = scanObj.nextInt();
		int space = 0;
		int temp = 0;
		int minus;
		//Ascending order
		for (int i = 1; i <= row; i++) {
			minus = 0;
			space = row - i;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			temp = (i*(i+1))/2 ; //partial sum
			for (int k = 1; k <= i; k++) {
				System.out.print(temp-minus);
				minus ++;
			}
			System.out.println();
		}
		//descending order		
		for (int i = row; i >= 1; i--) {
			minus = 0;
			space = row - i;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			temp = (i*(i+1))/2 ;
			for (int k = 1; k <= i; k++) {
				System.out.print(temp-minus);
				minus ++;
			}
			System.out.println();
		}
	}

}
