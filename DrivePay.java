import java.util.Scanner;

class DrivePay {
    public static void main(String args[]) {
		
		// create a scanner to use user input
        Scanner obj = new Scanner(System.in);
        System.out.println("Type the number of the area you live in:");
        String[] Areas = {"1.Eilat" , "2.Arava" , "3.Negev" , "4.Jerusalem" , "5.Central District" , "6.Sharon" , "7.North West" , "8.North East"};
		int arrlength = Areas.length;
		int i = 0;
		
		// print the areas arr for the user to see
		while(i < arrlength)
		{
			System.out.println(Areas[i]);
			i++;
		}
		
		
        String livingArea = obj.nextLine();
        int toNum = Integer.parseInt(livingArea);
        
		//check if the input matches the list of areas and print the choice to the user 
        if(toNum > 8 || toNum < 1)
		{
			System.out.println("The number you entered is not on the list. Please enter a valid number.");
			livingArea = obj.nextLine();
			toNum = Integer.parseInt(livingArea);
		}
		System.out.println("You chose " + Areas[toNum - 1]);
		
		// repeat the proccess for the duty area 
		System.out.println("Type the number of the area you serve in:");
		while(i < arrlength)
		{
			System.out.println(Areas[i]);
			i++;
		}
        String dutyArea = obj.nextLine();
		int dutyNum = Integer.parseInt(dutyArea);
		
		if(dutyNum > 8 || dutyNum < 1)
		{
			System.out.println("The number you entered is not on the list. Please enter a valid number.");
			dutyArea = obj.nextLine();
			dutyNum = Integer.parseInt(dutyArea);
		}
		
		System.out.println("You chose " + Areas[dutyNum - 1]);
		
		// check how many days the user served and the type of the base accomodation
		System.out.println("Which type of base do you serve in?");
		System.out.println("1.Open");
		System.out.println("2.Closed");
		String baseType = obj.nextLine();
		int baseTypeNum = Integer.parseInt(baseType);
		
		// checks if valid again
		if(baseTypeNum > 2 || baseTypeNum < 1)
		{
			System.out.println("Please enter a valid number");
			baseType = obj.nextLine();
			baseTypeNum = Integer.parseInt(baseType);
		}
		
		System.out.println("How many days did you serve?");
		String days = obj.nextLine();
		int dayCount = Integer.parseInt(days);
		if(dayCount < 0)
		{
			System.out.println("Please enter a valid number");
			days = obj.nextLine();
			dayCount = Integer.parseInt(days);
		}
		double payment = 0; 
		
		//redefining dayCount depends on base type
		if(baseTypeNum == 1)
		{
			
			dayCount = dayCount*2; 
			
		}
		
		// if the base is closed, the user deserve a certain amount of home drives. let's check 
		if(baseTypeNum == 2 && dayCount >  7)
		{
			if (dayCount < 14)
				dayCount = 4;
			if (dayCount > 14 && dayCount < 23)
				dayCount = 6; 
			if (dayCount > 23)
				dayCount = 8;
		}
		else if (baseTypeNum == 2 && dayCount <  7)
		{
			dayCount = 2; 
		}
		
		if (toNum == 1)
		{
			
			if (dutyNum == 1)
					payment = dayCount*4.6;
			if (dutyNum == 2)
					payment = dayCount*44;
			if (dutyNum == 3)
					payment = dayCount*63;
			if (dutyNum == 4)
					payment = dayCount*78;	
			if (dutyNum == 5)
					payment = dayCount*78;	
			if (dutyNum == 6)
					payment = dayCount*78;	
			if (dutyNum == 7)
					payment = dayCount*78;	
			else if (dutyNum == 8)
				payment = dayCount*110;
				
		}
		
		if (toNum == 2)
		{
			
			if (dutyNum == 1)
					payment = dayCount*44;
			if (dutyNum == 2)
					payment = dayCount*30;
			if (dutyNum == 3)
					payment = dayCount*41;
			if (dutyNum == 4)
					payment = dayCount*47;	
			if (dutyNum == 5)
					payment = dayCount*47;	
			if (dutyNum == 6)
					payment = dayCount*47;	
			if (dutyNum == 7)
					payment = dayCount*78;	
			else if (dutyNum == 8)
					payment = dayCount*89;
				
		}
		
		if (toNum == 3)
		{
			
			if (dutyNum == 1)
					payment = dayCount*63;
			if (dutyNum == 2)
					payment = dayCount*41;
			if (dutyNum == 3)
					payment = dayCount*20;
			if (dutyNum == 4)
					payment = dayCount*35;	
			if (dutyNum == 5)
					payment = dayCount*22;	
			if (dutyNum == 6)
					payment = dayCount*37;	
			if (dutyNum == 7)
					payment = dayCount*54;	
			else if (dutyNum == 8)
					payment = dayCount*57;
				
		}
		
		if (toNum == 4)
		{
			
			if (dutyNum == 1)
					payment = dayCount*78;
			if (dutyNum == 2)
					payment = dayCount*47;
			if (dutyNum == 3)
					payment = dayCount*35;
			if (dutyNum == 4)
					payment = dayCount*12;	
			if (dutyNum == 5)
					payment = dayCount*21;	
			if (dutyNum == 6)
					payment = dayCount*28;	
			if (dutyNum == 7)
					payment = dayCount*52;	
			else if (dutyNum == 8)
					payment = dayCount*44;
				
		}
		
		if (toNum == 5)
		{
			
			if (dutyNum == 1)
					payment = dayCount*78;
			if (dutyNum == 2)
					payment = dayCount*47;
			if (dutyNum == 3)
					payment = dayCount*22;
			if (dutyNum == 4)
					payment = dayCount*21;	
			if (dutyNum == 5)
					payment = dayCount*12;	
			if (dutyNum == 6)
					payment = dayCount*21;	
			if (dutyNum == 7)
					payment = dayCount*35;	
			else if (dutyNum == 8)
					payment = dayCount*44;
				
		}
		
		
		
		if (toNum == 6)
		{
			
			if (dutyNum == 1)
					payment = dayCount*78;
			if (dutyNum == 2)
					payment = dayCount*47;
			if (dutyNum == 3)
					payment = dayCount*37;
			if (dutyNum == 4)
					payment = dayCount*28;	
			if (dutyNum == 5)
					payment = dayCount*21;	
			if (dutyNum == 6)
					payment = dayCount*16;	
			if (dutyNum == 7)
					payment = dayCount*30;	
			else if (dutyNum == 8)
					payment = dayCount*40;
				
		}
		
		System.out.println(payment);
		
		if (toNum == 7)
		{
			
			if (dutyNum == 1)
					payment = dayCount*78;
			if (dutyNum == 2)
					payment = dayCount*78;
			if (dutyNum == 3)
					payment = dayCount*54;
			if (dutyNum == 4)
					payment = dayCount*52;	
			if (dutyNum == 5)
					payment = dayCount*35;	
			if (dutyNum == 6)
					payment = dayCount*30;	
			if (dutyNum == 7)
					payment = dayCount*17;	
			else if (dutyNum == 8)
					payment = dayCount*33;
				
		}
		
		
		
		if (toNum == 8)
		{
			
			if (dutyNum == 1)
					payment = dayCount*110;
			if (dutyNum == 2)
					payment = dayCount*89;
			if (dutyNum == 3)
					payment = dayCount*57;
			if (dutyNum == 4)
					payment = dayCount*44;	
			if (dutyNum == 5)
					payment = dayCount*44;	
			if (dutyNum == 6)
					payment = dayCount*40;	
			if (dutyNum == 7)
					payment = dayCount*33;	
			else if (dutyNum == 8) 
					payment = dayCount*28;
		}
		
		
		System.out.println("You deserve a payment of " + payment + " shekels");
		
		
    }
}