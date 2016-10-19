import java.util.Random;
import java.util.Scanner;

public class CodeChallenge {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Random randomNumber = new Random();
		
		System.out.println("Enter size of square:");
		int size = scan1.nextInt();
		int [][] matrix = new int [size][size]; // determines dimensions of square matrix
		
		for (int i = 0; i< matrix.length; i++){
			for (int j = 0; j<matrix.length; j++){
				
			matrix [i][j] = randomNumber.nextInt(100000); // or whatever random number between 1 through top random.
			System.out.println(matrix [i][j]);
			
			}
			
		}
			
	}
}


		
		

	

