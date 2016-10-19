import java.util.Random;
import java.util.Scanner;

public class CodeChallenge {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Random randomNumber = new Random();
		
		System.out.println("Enter the size of the square: ");
		int size = scan1.nextInt();
		int [][] matrix = new int [size][size];
		
		//determine the elements:
		 
			for (int i = 0; i < matrix.length; i++) {
				 for(int j = 0; j < matrix[i].length; j++){
					 matrix [i][j] = randomNumber.nextInt(100000);
					 					
			 System.out.printf("%4d\t" ,matrix[i][j]); //make sure print f to get the tab
	
		}
				 System.out.println();
	
		} //for loop brackets

		 
					int sumOfDiag = 0;	 
	
					 for (int i = 0; i < size; i++) {
					sumOfDiag = sumOfDiag + matrix [i][i];
					 }
						 
						 System.out.println("the sum is " + sumOfDiag); 
						 
						 int elements = sumOfDiag / matrix.length;
						 
						 // elements is the size
						 System.out.println("the average of the diagonal is " + elements);
		 
		 
			 }
	

	
			 }
	

		
		

	

