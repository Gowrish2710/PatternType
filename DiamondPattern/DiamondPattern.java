import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args){
		Scanner ScannerObject = new Scanner(System.in);
		System.out.println("Enter Input :");
		int Value = ScannerObject.nextInt();
		int space = 0;
		int TotalStar = (Value * 2)- 1;
		int rowStar = 0;
		//Ascending loop
		for (int rowLoop = 1; rowLoop <= Value; rowLoop++) {
			rowStar = (rowLoop * 2)- 1;
			space = (TotalStar - rowStar) / 2;				
			if(rowStar != (Value * 2)- 1){				
				for (int j = 0; j < space; j++) {
					System.out.print(" ");
				}
			}
			for (int k = 0; k < rowStar; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//descending loop
		for (int rowLoop = Value - 1 ; rowLoop > 0; rowLoop--) {
			rowStar = (rowLoop * 2)- 1;
			space = (TotalStar - rowStar) / 2;				
			if(rowStar != (Value * 2)- 1){				
				for (int j = 0; j < space; j++) {
					System.out.print(" ");
				}
			}
			for (int k = 0; k < rowStar; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
