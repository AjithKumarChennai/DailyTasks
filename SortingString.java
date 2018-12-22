//Sorting string
public class FirstClass {

	public static void main(String[] args) {
		
		String str = "ajith";
		
		char[] charArray = str.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			
			for(int j=0; j<charArray.length; j++) {
				
				if(charArray[i] < charArray[j]) {
					
					char temp = charArray[i];
					
					charArray[i] = charArray[j];
					
					charArray[j] = temp;
					
				}
				
			}
			
		}
		
		System.out.println(charArray);
		
	}

}