import java.util.Scanner;
class StringMethodExample{

	public static void main(String args[]){
	
	String str1 = "Batch-17 is toxic";
	
	//To check whether the string object contains given value or not. 	
	System.out.println("contains(): " + str1.contains("toxic"));

	//To check whether the string object equals given value or not. 	
	System.out.println("equals(): " + str1.equals("Batch-17 is toxic"));

	//To check whether the string object equals given value or not. 	
	System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase("Batch-17 is Toxic"));

	//To check whether the string object equals given value or not. 
	System.out.println("concat(): " + str1.concat(", but sometimes \"Sweet!\""));

	//To check whether the string object equals given value or not. 
	System.out.println("toUpperCase(): " + str1.toUpperCase());

	//To check whether the string object equals given value or not. 
	System.out.println("toLowerCase(): " + str1.toLowerCase());

	//To check whether the string object equals given value or not. 
	System.out.println("length(): " + str1.length());

	//To check whether the string object equals given value or not. 
	System.out.println("charAt(): " + str1.charAt(9)); 
	
	//To check whether the string object equals given value or not. 
	System.out.println("compareTo(): " + str1.compareTo("batch-17 is toxic")); 
	
	//To check whether the string object equals given value or not. 
	System.out.println("compareToIgnoreCase(): " + str1.compareToIgnoreCase("Batch-17 is toxic")); 

	//To check whether the string object equals given value or not. 
	System.out.println("indexOf(): " + str1.indexOf('B')); 

	//To check whether the string object equals given value or not. 
	System.out.println("isEmpty(): " + str1.isEmpty()); 

	//To check whether the string object equals given value or not. 
	System.out.println("replace(): " + str1.replace("toxic", "Sweet")); 

	//To check whether the string object equals given value or not. 
	System.out.println("substring(): " + str1.substring(2, 7)); 

	//To check whether the string object equals given value or not. 
	System.out.println("trim(): " + str1.trim()); 

	//To check whether the string object equals given value or not. 
	System.out.println("hashCode(): " + str1.hashCode()); 

	//To check whether the string object equals given value or not. 
	System.out.println("format(): " + String.format("%d",5)); 

	//To check whether the string object equals given value or not. 
	System.out.println("join(): " + String.join("*","Vijay","Mithun","Kamali","Jereena")); 

	//To check whether the string object equals given value or not. 
	System.out.println("replaceAll(): " + str1.replaceAll("i", "A")); 

	//To check whether the string object equals given value or not. 
	//System.out.println("split(): " + str1.split()); 

	

	








}
}