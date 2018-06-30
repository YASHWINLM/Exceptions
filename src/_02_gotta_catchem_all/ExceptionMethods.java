package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double x, double y) {
		
	double z=x/y;
		if (y==0) {
			throw new IllegalArgumentException();
			
		}
		return z;
		
		
		
	}
	
	public String reverseString(String s) {
		char[] Array= s.toCharArray();
		String x="";
		
		
		for (int i = Array.length-1; i >=0 ; i--) {
			x+=Array[i];
		}
		
		if (s.equals("")) {
			throw new IllegalStateException();
			
			
		}
		
		return x;
		
		
		
	}
}
