package level2;
import java.util.ArrayList;
import java.util.List;
public class Lambra_Expression {
	
	   public static void main(String[] args) {
	      ArrayList<String>arrayList = new ArrayList<String>();
	      arrayList.add("100");
	      arrayList.add("200");
	      arrayList.add("300");
	      arrayList.add("400");
	      arrayList.add("500");
	      arrayList.add("600");
	      arrayList.add("700");
	      arrayList.add("800");
	      arrayList.add("900");
	      arrayList.add("1000");
	      System.out.println("ArrayList...");
	      for (String s: arrayList)
	         System.out.println(s);//lamda Expression
	      ArrayList<String>list = arrayList;
	      System.out.println("Iterating...");
	      list.stream().forEach(elem -> System.out.println(elem));
	   }
	}

