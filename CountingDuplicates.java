//Counting duplicates in the string
import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		
		String str = "malayalam";
		
		List<Character> list = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			
			int count=0;
			
			if(!list.contains(str.charAt(i))) {
			
				list.add(str.charAt(i));
				
				for(int j=0; j<str.length(); j++) {
					
					if(str.charAt(i) == str.charAt(j)) {
						
						count++;
						
					}
					
				}
				
				if(count > 1) {
					
					System.out.println(str.charAt(i) + " repeated " + count + " times." );
					
				}
				
			}	
			
		}
		
	}

}