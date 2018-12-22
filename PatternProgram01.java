/*
Input:
------
A
C
7

Output:
-------
ACCCCCC
AACCCCC
AAACCCC
AAAACCC
AAAAACC
AAAAAAC
*/
import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char charOne = sc.next().charAt(0);
		
		char charTwo = sc.next().charAt(0);
		
		int noOfRows = sc.nextInt();
		
		for(int i=1; i<=noOfRows; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(charOne);
				
			}
			
			for(int k=i+1; k<=noOfRows; k++) {
				
				System.out.print(charTwo);
				
			}
			
			System.out.println();
			
		}
		
	}

}