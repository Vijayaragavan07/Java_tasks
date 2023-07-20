import java.util.Scanner;

class Day2{

	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		

		System.out.println("");
		System.out.println("-----1.Java program to print 'Hello world!' on screen.-----");
		System.out.println("");
		System.out.println("Hello world");
		System.out.println("");

		System.out.println("-----2.Java program to print the sum of two numbers-----");
		System.out.println("");
		System.out.print("Enter first Number : " );
		int firstnum = s.nextInt();
		System.out.println("");
		System.out.print("Enter second Number : ");
		int secondnum = s.nextInt();
		firstnum += secondnum;
		System.out.println("");
		System.out.print("Addition of your two numbers is : " + firstnum);
		System.out.println("");
		System.out.println("");

		System.out.println("-----3.Java program that takes 2 numbers & display the product of numbers-----");
		System.out.println("");
		System.out.print("Enter your first number : ");
		int mulnum1 = s.nextInt();
		System.out.println("");
		System.out.print("Enter your second number : " );
		int mulnum2 = s.nextInt();
		mulnum1 *= mulnum2;
		System.out.println("");
		System.out.print("Multiple of your two numbers is : " +mulnum1);
		System.out.println("");

		System.out.println("");
		System.out.println("-----4.Java program to print the sum, multiply, subtract, divide, remainder of two numbers.-----");
		System.out.println("");
		System.out.print("Sum of two numbers is : " + firstnum);
		System.out.println("");
		System.out.print("Multiply of two numbers is : " + mulnum1);
		System.out.println("");
		int totalsub = firstnum - secondnum;
		System.out.println("");
		System.out.print("Subtract of two numbers is : " + totalsub);
		System.out.println("");
		int totaldiv = firstnum / secondnum;
		System.out.println("");
		System.out.print("Division of two numbers is : " + totaldiv);
		System.out.println("");
		float totalmod = firstnum % secondnum;
		System.out.println("");
		System.out.println("Modulus of two numbers is : " + totalmod);
		System.out.println("");

		System.out.println("");
		System.out.println("-----5.Java program that takes as input to calculate and print the average of the numbers.-----");
		System.out.println("");
		System.out.println("Enter five numbers : " );
		int fn1 = s.nextInt();
		int fn2 = s.nextInt();
		int fn3 = s.nextInt();
		int fn4 = s.nextInt();
		int fn5 = s.nextInt();
		float avg = (fn1 + fn2 + fn3 + fn4 + fn5) / 5;
		System.out.println("");
		System.out.println("Average of Five numbers is : " + avg);
		System.out.println("");

		System.out.println("");
		System.out.println("-----6.Java program to find area of circle.-----");
		System.out.println("");
		System.out.print("Enter the radius of circle : ");
		int rad = s.nextInt();
		System.out.println("");
		double radius = 3.14 * (rad * rad);
		System.out.println("");
		System.out.println("The area of circle is : " + radius);
		System.out.println("");

		System.out.println("");
		System.out.println("-----7.Java program to find area of rectangle.-----");
		System.out.println("");
		System.out.print("Enter the width : ");
		int rectwidth = s.nextInt();
		System.out.println("");
		System.out.print("Enter the height : ");
		int rectheight = s.nextInt();
		double rectarea = rectwidth * rectheight;
		System.out.println("");
		System.out.print("Area of rectangle is : " +rectarea);
		System.out.println("");

		System.out.println("");
		System.out.println("-----8.Java program to find area of triangle.-----");
		System.out.println("");
		System.out.print("Enter base value : ");
		double base = s.nextDouble();
		System.out.println("");
		System.out.print("Enter height value : ");
		double height = s.nextDouble();
		double triangle = (base * height) / 2;
		System.out.println("");
		System.out.println("Area of triangle is : " + triangle);
		System.out.println("");

		System.out.println("");
		System.out.println("-----9.Java program to find area of equilateral triangle.-----");
		System.out.println("");
		System.out.print("Enter the edge length of triangle : ");
		int edge = s.nextInt();
		double area = (1.732/4) * (edge * edge);
		System.out.println("");
		System.out.print("Area of equilateral triangle is : " + area);
		System.out.println("");

		System.out.println("");
		System.out.println("-----10.Java program to find area of rhombus.-----");
		System.out.println("");
		System.out.print("Enter longer diagnal value : ");
		int ldiagnal = s. nextInt();
		System.out.println("");
		System.out.print("Enter shorter diagnal value : ");
		int sdiagnal = s. nextInt();
		double rhombus = (ldiagnal * sdiagnal)/2;
		System.out.println("");
		System.out.print("Area of rhombus is : " + rhombus);
		System.out.println("");

		System.out.println("");
		System.out.println("-----11.Java program to find area of parallelogram.-----");
		System.out.println("");
		System.out.print("Enter the height : ");
		int paraheight = s.nextInt();
		System.out.println("");
		System.out.print("Enter the base : ");
		int parabase = s.nextInt();
		double paraarea = paraheight * parabase;
		System.out.println("");
		System.out.print("Area of parallelogram is : " +paraarea);
		System.out.println("");

		System.out.println("");
		System.out.println("-----12.Java program to find area of pentagonal prism(Total Surface).-----");
		System.out.println("");
		System.out.print("Enter the value of pent_a : ");
		int pent_a = s.nextInt();
		System.out.println("");
		System.out.print("Enter the pent_b : ");
		int pent_b = s.nextInt();
		System.out.println("");
		System.out.print("Enter the height : ");
		int pheight = s.nextInt();
		double pentprism= (5 * pent_a * pent_b) + (5 * pent_b * pheight);
		System.out.println("");
		System.out.print("Area of prism is : " +pentprism);

		System.out.println("-----13.Java program to find volume of sphere-----");
		System.out.println("");
		System.out.print("Enter the radius of sphere : ");
		double srad = s.nextInt();
		System.out.println("");
		double sradius = (4 / 3) * 3.14 * (srad * srad *srad);
		System.out.println("");
		System.out.println("The volume of sphere is : " + sradius);
		System.out.println("");

		System.out.println("-----14.Java program to find volume of cylinder-----");
		System.out.println("");
		System.out.print("Enter the radius of cylinder : ");
		int crad = s.nextInt();
		System.out.println("");
		System.out.print("Enter the height of cylinder : ");
		int cheight = s.nextInt();
		System.out.println("");
		double cradius = 3.14 * ((crad * crad ) * cheight);
		System.out.println("");
		System.out.println("The volume of  is : " + cradius);
		System.out.println("");

		System.out.println("-----15.Java program to concatenate two strings-----");
		Scanner s1 = new Scanner(System.in);

		System.out.println("");
		System.out.print("Enter first word : " );
		String firstword = s1.nextLine();
		System.out.println("");
		System.out.print("Enter second word : ");
		String secondword = s1.nextLine();
		String fullword = firstword + secondword;
		System.out.println("");
		System.out.print("Concatenation of two words is : " + fullword);
		System.out.println("");


}
}


/*Output :


C:\Users\91638\OneDrive\Desktop\KGM\Java_tasks>javac Day2.java

C:\Users\91638\OneDrive\Desktop\KGM\Java_tasks>java Day2

-----1.Java program to print 'Hello world!' on screen.-----

Hello world

-----2.Java program to print the sum of two numbers-----

Enter first Number : 2s

Enter second Number : 3

Addition of your two numbers is : 5

-----3.Java program that takes 2 numbers & display the product of numbers-----

Enter your first number : 4

Enter your second number : 5

Multiple of your two numbers is : 20

-----4.Java program to print the sum, multiply, subtract, divide, remainder of two numbers.-----

Sum of two numbers is : 5

Multiply of two numbers is : 20

Subtract of two numbers is : 2

Division of two numbers is : 1

Modulus of two numbers is : 2.0


-----5.Java program that takes as input to calculate and print the average of the numbers.-----

Enter five numbers :
2
3
4
5
6

Average of Five numbers is : 4.0

-----6.Java program to find area of circle.-----

Enter the radius of circle : 6


The area of circle is : 113.04


-----7.Java program to find area of rectangle.-----

Enter the width : 7

Enter the height : 3

Area of rectangle is : 21.0

-----8.Java program to find area of triangle.-----

Enter base value : 8

Enter height value : 4

Area of triangle is : 16.0

-----9.Java program to find area of equilateral triangle.-----

Enter the edge length of triangle : 5

Area of equilateral triangle is : 10.825

-----10.Java program to find area of rhombus.-----

Enter longer diagnal value : 8

Enter shorter diagnal value : 4

Area of rhombus is : 16.0

-----11.Java program to find area of parallelogram.-----

Enter the height : 8

Enter the base : 7

Area of parallelogram is : 56.0

-----12.Java program to find area of pentagonal prism(Total Surface).-----

Enter the value of pent_a : 8

Enter the pent_b : 3

Enter the height : 6

Area of prism is : 210.0-----13.Java program to find volume of sphere-----

Enter the radius of sphere : 4


The volume of sphere is : 200.96

-----14.Java program to find volume of cylinder-----

Enter the radius of cylinder : 6

Enter the height of cylinder : 9


The volume of  is : 1017.36

-----15.Java program to concatenate two strings-----

Enter first word : hi

Enter second word :  vijay

Concatenation of two words is : hi vijay*/









