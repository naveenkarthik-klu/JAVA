class DigSum 
{ 
	public static void main (String[] args) 
	{ 
		
		String str = "12abc20yz8"; 
		String temp = ""; 
		System.out.println("Given string "+str);
		int sum = 0; 
		for(int i = 0; i < str.length(); i++) 
		{ 
			char ch = str.charAt(i); 
			
			if (Character.isDigit(ch)) 
				temp += ch; 
	
			else
			{ 
				sum += Integer.parseInt(temp); 
	
				temp = "0"; 
			} 
		} 
	
		int r = sum + Integer.parseInt(temp); 
	
		System.out.println("Sum of digits in given string is "+r); 
		
	} 
} 
