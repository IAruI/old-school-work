
package achu;
import java.util.Scanner;

public class dksaldas {
public static void main(String args[]){
	int testone[] = new int[21];
	Scanner achu = new Scanner(System.in);

	for(int counter =0; counter < 20; counter++){
	System.out.println("Put a number between 1-20");
		int choice = achu.nextInt() ; 
testone[choice] = testone[choice]++ ;

}	
	
	for (int counter =0; counter < 20; counter++){
	System.out.println("The number of people that got " + counter +" is " + testone[counter]);
	}
	}
}

