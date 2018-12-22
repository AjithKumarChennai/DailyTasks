//Formatted String
import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float fval = sc.nextFloat();
		
		String formattedString = String.format("%.05f", fval);
		
		System.out.println(formattedString);
		
	}

}