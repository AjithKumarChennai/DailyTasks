//Valid parentheses
import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int center = str.length() / 2;
		
		boolean isValid = false;
		
		if((str.length()%2) == 0) {
		
		for(int i=0, j=str.length()-1; i<center; i++, j--) {
			
			if(str.charAt(i)=='(' && str.charAt(j)==')' || str.charAt(i)=='{' && str.charAt(j)=='}' || str.charAt(i)=='[' && str.charAt(j)==']') {
				
				isValid = true;
				
			}else {
				
				isValid = false;
				
				break;
				
			}
			
		}
		
		}
		
		String res = isValid ? "Valid" : "Not Valid";
		
		System.out.println(res);
		
	}

}