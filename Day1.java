class Day1{

	int a = 6, b = 7, sum = a + b,sub = a-b, mul=a*b, div = a / b;
	double c = 4.6, d = 7.4, doublesum = c + d , doublesub = c - d, doublediv = c / d , doublemul = c * d;
	static  byte e = 1 , f = 3;
	static int bytesum = e + f, bytesub = e - f, bytemul = e * f, bytediv = e / f ;
	static float g = 5.56f, h = 3.23f, floatsum = g + h, floatsub = g - h, floatmul = g * h, floatdiv = g / h;

	public static void main (String args[]){

		//short and long in inside main method..

		short a = 23, b = 12; 
		int shortsum = a + b, shortsub = a - b, shortmul = a * b, shortdivision = a / b;
		long c=243567l, d=534268l, longaddition = c + d, longsub = c - d, longmul = c * d, longdivision = c / d;

		//object for integer and double datatype..
		Day1 o = new Day1();

		System.out.println("----------My first java progaram-------");
		System.out.println("----------Integer datatype------");
		System.out.println("Sum : " + o.sum);
		System.out.println("Sub : " + o.sub);
		System.out.println("Mul : " + o.mul);
		System.out.println("Division : " + o.div);
		System.out.println("");
		System.out.println("-----------Double datatype------");
		System.out.println("Doublesum : " + o.doublesum);
		System.out.println("Doublesub : " + o.doublesub);
		System.out.println("DoubleDivision : " + o.doublediv);
		System.out.println("Doublemul : " + o.doublemul);

		System.out.println("");
		System.out.println("-----------short datatype function-------");
		System.out.println("Short datatype addition : " + shortsum);
		System.out.println("Short datatype subtraction : " + shortsub);
		System.out.println("Short datatype multiply : " + shortmul);
		System.out.println("Short datatype division : " + shortdivision);
		System.out.println("");
		System.out.println("-----------Long datatype function-------");
		System.out.println("Long datatype addition : " + longaddition);
		System.out.println("Long datatype subtraction : " + longsub);
		System.out.println("Long datatype multiply : " + longmul);
		System.out.println("Long datatype division : " + longdivision);

		System.out.println("");
		System.out.println("-------Byte daytatype funtion-------");
		System.out.println("Byte datatype addition : " + bytesum);
		System.out.println("Byte datatype subtraction : " + bytesub);
		System.out.println("Byte datatype multiply : " + bytemul);
		System.out.println("Byte datatype division : " + bytediv);

		System.out.println("");
		System.out.println("-------Float datatype funtion-------");  
		System.out.println("Float datatype addition : " + floatsum);  
		System.out.println("Float  datatype subtraction : " + floatsub); 
		System.out.println("Float  datatype multiply : " + floatmul);
		System.out.println("Float  datatype division : " + floatdiv);
				
	}




}





/*output :



----------My first java progaram-------
----------Integer datatype------
Sum : 13
Sub : -1
Mul : 42
Division : 0

-----------Double datatype------
Doublesum : 12.0
Doublesub : -2.8000000000000007
DoubleDivision : 0.6216216216216215
Doublemul : 34.04

-----------short datatype function-------
Short datatype addition : 35
Short datatype subtraction : 11
Short datatype multiply : 276
Short datatype division : 1

-----------Long datatype function-------
Long datatype addition : 777835
Long datatype subtraction : -290701
Long datatype multiply : 130130053956
Long datatype division : 0

-------Byte daytatype funtion-------
Byte datatype addition : 4
Byte datatype subtraction : -2
Byte datatype multiply : 3
Byte datatype division : 0

-------Float datatype funtion-------
Float datatype addition : 8.79
Float  datatype subtraction : 2.33
Float  datatype multiply : 17.9588
Float  datatype division : 1.7213622
*/