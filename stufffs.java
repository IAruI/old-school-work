package achu;

import java.util.Scanner;
public class stufffs {
	public static void main (String args[]){
		
	
	Scanner achu = new Scanner(System.in);
 System.out.println("add in your choice");
	int choice = achu.nextInt() ; 

	if (choice==1){
		int rock = 0;
		rock = rock + 1;
	} else if (choice == 2){
		int soul = 0;
		soul = soul+1;
	} else if (choice == 3){
		int pop=0;
		pop = pop+1;
	} else if (choice ==4){
		int jazz=0;
		jazz = jazz+1;
	} else if(choice ==5 ){
		int classical = 0;
		classical = classical+1;
		int counter= 0;
		int classicalname[] = new int[1500];
		System.out.println("input name");
		int name = achu.nextInt() ; 

		classicalname[counter] = name;
		counter++;

	}
	
	
	
	}
}
