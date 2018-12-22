//Checking whether the String is palidrome or not
public class FirstClass {

	public static void main(String[] args) {
		
		String str = "malayalam";
		
		String rev = "";
		
		for(int i=str.length()-1 ; i>=0; i--) {
			
			rev = rev + str.charAt(i);
			
		}
		
		String res = (str.equals(rev)) ? "Palindrome" : "Not a palidrome";
		
		System.out.println(res);
		
	}

}