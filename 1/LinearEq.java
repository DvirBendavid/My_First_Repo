class LinearEq {
	public static void main(String[] args) {
		
		// get the 3 numbers to set in the equation
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		
		//prints the equation pre-calculation and then after calc 
		System.out.println( a + " * x + " + b + " = " + c);
		System.out.println("x = " + (c-b)/a);
	
	
	
	}
}