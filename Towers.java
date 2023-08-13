import java.util.Scanner;

public class Towers{
	
	// statcic variable count which initializes the number of moves to 0
	static int count =0;
	
	// doTowers recursive method which increments count after each operation
	public static void doTowers(int n, int startPeg, int auxPeg, int endPeg){
		
	
		if (n > 1) {
			
	    	// Move n - 1 rings from starting peg to auxiliary peg
	    	doTowers(n - 1, startPeg, endPeg, auxPeg);
	      
	    	// Move n - 1 rings from auxiliary peg to ending peg
	    	doTowers(n - 1, auxPeg, startPeg, endPeg);
	    	
		}
		//increment count
		count++;
	}
	
	// main method where we printout number of rings and moves.
	public static void main(String[] args){
	  
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of rings(0 to stop): ");
		
		//takes input from user for number of rings to be moved
		int n = input.nextInt();
		
		//loops while number of rings > 0
		while (n >0){
			
		    System.out.print("Towers of Hanoi with " + n + " rings\n");
		    
		    //calls doTowers method
		    doTowers(n,1,2,3);
		    System.out.println("Number of moves: " + count + "\n");
		    
		    //again asks user from number of rings.
		    System.out.print("Input the number of rings(0 to stop): ");
		    n = input.nextInt();
		    count=0;
		}
	}
}
