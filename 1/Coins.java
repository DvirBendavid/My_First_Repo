class Coins{
	public static void main(String args[]){
		//geta n input of the total coins the user has
		int totalcoins = Integer.parseInt(args[0]);
		
		//calculates the quarters and cents change
		int quarters = totalcoins / 25;
		int cents = totalcoins % 25;
		
		// prints the quarters and cents count 
		System.out.println("Use " + quarters + " quarters and " + cents + " cents.");
	}
}