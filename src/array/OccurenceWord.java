package array;

public class OccurenceWord {
	
	public static void main(String[] args) {
		
		String str = "shivatestingshiva";
		int actualStringLength = str.length();
		System.out.println("Actual Length Of String: "+actualStringLength+"\n");
		int stringLengthAfterReplacement = str.replace("s", "").length();
		System.out.println("String Length After Replacement: "+stringLengthAfterReplacement+"\n");
		int characterCount = actualStringLength-stringLengthAfterReplacement;
		System.out.println("Number Of Times Character Occurence: "+characterCount);
		
		
		//int count = 1;
		
		/*for(int i=0; i<=length-1; i++)
		{
			for(int j=i; j<=length-1; j++)
			{
				
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			System.out.println("Alphabet: "+str.charAt(i)+" Has a Count of: "+count);
		}*/		
	}

}
