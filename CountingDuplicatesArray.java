//Counting the number of duplicates in an array
import java.util.*;

public class FirstClass {

	public static void main(String[] args) {
		
		int[] ival = {10, 10, 20, 30, 20, 40, 50, 50, 50, 50, 50, 10, 30};
		
		List<Integer> list = new ArrayList<>();
	
		for(int i=0; i<ival.length; i++) {
			
			int count = 0;
			
			if(!list.contains(ival[i])) {
				
				for(int j=0; j<ival.length; j++) {
					
					if(ival[i] == ival[j]) {
						
						count++;
						
					}
					
				}
				
			}
			
			if(count > 1) {
				
				list.add(ival[i]);
				
				System.out.println(ival[i] + " repeated " + count + " times ");
				
			}
			
		}
		
	}

}
