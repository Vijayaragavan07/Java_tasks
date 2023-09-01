import java.lang.Math;

class MathExample{

	public static void main(String args[]){

	System.out.println("abs() :" + Math.abs(-12.2));

	System.out.println("cbrt() :" + Math.cbrt(27));

	System.out.println("sqrt() :" + Math.sqrt(27));

	System.out.println("signum() :" + Math.signum(12.2));

	System.out.println("rint() :" + Math.rint(-12.6));
	
	System.out.println("ceil() :" + Math.ceil(-12.0));

	System.out.println("floor() :" + Math.floor(12.4));

	System.out.println("random() :" + Math.random());

	System.out.println("pow() :" + Math.pow(5,2));

	System.out.println("max() :" + Math.max(-2,2));

	System.out.println("min() :" + Math.min(-2,2));

	System.out.println("copySign() :" + Math.copySign(-5,2));

	System.out.println("exp() :" + Math.exp(2));
	
	System.out.println("expm1() :" + Math.expm1(2));
	
	System.out.println("getExponent() :" + Math.getExponent(1234.5678));

	System.out.println("hypot() :" + Math.hypot(3,2));

	System.out.println("IEEEremainder() :" + Math.IEEEremainder(6,16));

	System.out.println("nextAfter() :" + Math.nextAfter(2,5));

	System.out.println("nextUp() :" + Math.nextUp(2));

	System.out.println("round() :" + Math.round(6.7));

	System.out.println("cos() :" + Math.cos(2.5));

	System.out.println("acos() :" + Math.acos(2.5));

	System.out.println("asin() :" + Math.asin(2.5));

	System.out.println("atan2() :" + Math.atan2(2,5));

	System.out.println("cos() :" + Math.cos(13));

	System.out.println("cosh() :" + Math.cosh(3));

	System.out.println("log() :" + Math.log(10));

	System.out.println("log10() :" + Math.log10(10));

	System.out.println("log1p() :" + Math.log1p(10));

	System.out.println("sin() :" + Math.sin(2));

	System.out.println("sinh() :" + Math.sinh(2));

	System.out.println("tan() :" + Math.tan(2.5));

	System.out.println("tanh() :" + Math.tanh(2.5));

	System.out.println("toDegrees() :" + Math.toDegrees(Math.PI/4));

	System.out.println("toRadians() :" + Math.toRadians(45));

	System.out.println("ulp() :" + Math.ulp(1234.567));

	}
}