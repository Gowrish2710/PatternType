import java.util.Scanner;

public class WordPuzzlePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter No Of Rows");
		String wordString = scanObj.next();
		int sizeOfInput = wordString.length();
		int centerIndex = sizeOfInput/2;
		int spaceDec =0;
		for(int i =0; i<=centerIndex;i++ ){
			if(i == centerIndex){
				for (int j = 0; j <= centerIndex; j++) {
					System.out.print(" ");
				}
				System.out.print((wordString.charAt(centerIndex)));
				System.out.println();
			}else{
				if(i >= 0){	
					for (int space = 0; space < i; space++) {
						System.out.print(" ");
					}
					System.out.print(wordString.charAt(i));
					for (int space = 0; space < (wordString.length())-spaceDec; space++) {
						System.out.print(" ");
					}			
					spaceDec=spaceDec+2;
					System.out.println((wordString.charAt((sizeOfInput - 1) -i)));
				}
			}
		}
		
		for(int i = centerIndex-1; i>=0;i-- ){
			
					for (int space = 0; space < i; space++) {
						System.out.print(" ");
					}
					System.out.print(wordString.charAt(i));
					for (int space = i; space < (wordString.length())-i; space++) {
						System.out.print(" ");
					}			
					System.out.println((wordString.charAt((sizeOfInput - 1) -i)));
				}
				System.out.println();
		}

}
