import java.util.Scanner;

public class WordPuzzlePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanObj = new Scanner(System.in);
		System.out.print("Enter No Of Rows");
		String wordString = scanObj.next();
		int sizeOfInput = wordString.length();
		for(int i =0; i<=(sizeOfInput/2);i++ ){
			if(i+1 == ((sizeOfInput/2)+1)){
				for (int j = 0; j < (sizeOfInput/2); j++) {
					System.out.print(" ");
				}
				System.out.print((wordString.charAt(sizeOfInput/2)));
				System.out.println();
			}else{
				if(i >= 0){				
					for (int space = 0; space < i; space++) {
						System.out.print(" ");
					}
					System.out.print(wordString.charAt(i));
					for (int space = i; space < ((sizeOfInput/2)+1); space++) {
						System.out.print(" ");
					}			
					System.out.println((wordString.charAt((sizeOfInput - 1) -i)));
				}
			}
		}
		
		for(int i =(sizeOfInput/2)-1; i>=0;i-- ){
			
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
