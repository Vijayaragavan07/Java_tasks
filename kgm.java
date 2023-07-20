class kgm{

	public static void main(String args[])
	{
	System.out.println("");
	System.out.println("-----Write a Java program to print the result of the following operations-----");
	int a = -5, b = 8, c = 6, calculation = a + (b * c);
	System.out.println("");
	System.out.println("Calculation of three numbers is : " + calculation);
	System.out.println("");
	int d = 55, e = 9, cal2 = (d + e) % e;
	System.out.println("Modulus of two values is : " + cal2);
	System.out.println("");
	int f = 20, g = -3, h = 5, cal3 = f +(-3 * 5) / b;
	System.out.println("Calculation of four values is : " + cal3);
	System.out.println("");
	int p = 5, q = 15, r = 3, s = 2, calll3 = p + ((q / r) * s) - (b % r);
	System.out.println("Calculation of five values is : " + calll3);
	}

}

/*Output :


C:\Users\91638\OneDrive\Desktop\KGM\Java_tasks>javac kgm.java

C:\Users\91638\OneDrive\Desktop\KGM\Java_tasks>java kgm

-----Write a Java program to divide two numbers and print on the screen.-----

 of two numbers is : 16






Test Data:

a. -5 + 8 * 6

b. (55+9) % 9

c. 20 + -3*5 / 8

d. 5 + 15 / 3 * 2 - 8 % 3 */
