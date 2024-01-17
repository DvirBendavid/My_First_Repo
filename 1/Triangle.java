class Triangle{
	public static void main(String args[]){
		
		// get 3 values for the triangle sides
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		// define a bool that returns true if the sides can form a triangle or flase if not
		boolean IsTriangle = ((a+b) >= c && (a+c) >= b && (b+c) >= a);
		
		//Prints the result
		System.out.println(a +", " + b + ", " + c +": " + IsTriangle);

	}
}
