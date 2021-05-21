import java.io.*; 
public class FileCount 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		File f = new File("F:\\9918004080\\file1.txt"); 
		FileInputStream fin = new FileInputStream(f); 
		InputStreamReader input = new InputStreamReader(fin); 
		BufferedReader reader = new BufferedReader(input); 
		String line; 
		
		int countWord = 0; 
		int sentenceCount = 0; 
		int characterCount = 0; 
		int paragraphCount = 1; 
		int whitespaceCount = 0; 
						
		while((line = reader.readLine()) != null) 
		{ 
			if(line.equals("")) 
			{ 
				paragraphCount++; 
			} 
			if(!(line.equals(""))) 
			{ 
				
				characterCount += line.length(); 
				String[] wordList = line.split("\\s+"); 
				
				countWord += wordList.length; 
				whitespaceCount += countWord -1; 
				
				String[] sentenceList = line.split("[!?.:]+"); 
				
				sentenceCount += sentenceList.length; 
			} 
		} 
		
		System.out.println("Total word count = " + countWord); 
		System.out.println("Total number of sentences = " + sentenceCount); 
		System.out.println("Total number of characters = " + characterCount); 
		System.out.println("Number of paragraphs = " + paragraphCount); 
		System.out.println("Total number of whitespaces = " + whitespaceCount); 
	} 
} 
