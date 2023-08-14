package level2;

public class Count_Occurences {
	
	  public static void main(String args[]) 
	  {
	      
	  String input = "ExcelR@123";
	  char search = '@';             // Character to search is '@'.
	  
	  int count=0;
	  for(int i=0; i<input.length(); i++)
	  {
	      if(input.charAt(i) == search)
	      count++;
	  }
	  
	  System.out.println("The Character '"+search+"' appears "+count+" times.");
	  }
	}

