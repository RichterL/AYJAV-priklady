package prvocisla;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args)
	{
		Integer limit = 100;
		if (args.length > 0) {			
			limit = Integer.parseInt(args[0]);			
		}
		boolean[] pole = new boolean[limit];
	
		pole[0] = pole[1] = true;
		for (int i = 2; i < Math.sqrt(limit); i++) {
			if (pole[i] == true) continue;
			for (int j = i * 2; j < pole.length; j += i ) {		
				pole[j] = true;				
			}
		}
		
		for(int i=0; i<pole.length; i++) {
			if (pole[i] == false) System.out.print(i + " ");
		}	
		
		System.out.println(" ");
		printStepByStep(limit);
	}
	
	
	/**
	 * Alternativni pristup 
	 */
	public static void printStepByStep(int limit) 
	{	
		ArrayList<Integer> pole = new ArrayList<Integer>();
		
		for (int i = 2; i < limit; i++) {
			pole.add(i);
		}

		for(int i=0; i < Math.sqrt(pole.size()); i++) {
			for (int j=i+1; j < pole.size(); j++) {
				if (pole.get(j) % pole.get(i) == 0) {
					pole.remove(j);
				}
			}
		}
		for(int i=0; i < pole.size(); i++) {
			System.out.print(pole.get(i) + " ");
		}
	}

}
