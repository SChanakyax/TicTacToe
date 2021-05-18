
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
	
	//Array list to check the already taken positions
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>(){};
	static ArrayList<Integer> cpuposition = new ArrayList<Integer>() {};
	
	
	//print the board
	public static void printboard(char[][] gameboard) {
		for(char[] row : gameboard) {
			for(char c : row) {
				System.out.print(c);
			}
		System.out.println();
		}
	}
	
	//user input catagorization
	public static void player(char[][] gameboard, int userInput ,String usr) {
		char symbol = ' ';
		
		if(usr.equals("player")) {
			symbol = 'X';
		}else if(usr.equals("cpu")) {
			symbol = 'O';
		}
	
		//draw the symbol
		switch(userInput) {
			case 1:
				gameboard[0][0] = symbol;
				break;
				
			case 2: 
				gameboard[0][2] =symbol;
				break;
				
			case 3: 
				gameboard[0][4] =symbol;
				break;
			case 4: 
				gameboard[2][0] =symbol;
				break;
			case 5: 
				gameboard[2][2] =symbol;
				break;
			case 6: 
				gameboard[2][4] =symbol;
				break;
			case 7: 
				gameboard[4][0] =symbol;
				break;
			case 8: 
				gameboard[4][2] =symbol;
				break;
			case 9: 
				gameboard[4][4] =symbol;
				break;	
			default:
				break;
		}	
	}
	
	
	public static void main(String[] args) {
		
		char[][] gameboard = {
				{' ','|',' ','|',' ' },
				{'-','+','-','+','-' },
				{' ','|',' ','|',' ' },
				{'-','+','-','+','-' },
				{' ','|',' ','|',' ' }			
		};

		//print game board
		printboard(gameboard);
		
		while(true) {
		//Getting user inputs
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number (0-9)");
		int userInput = scan.nextInt();
		if(userInput >= 10 || userInput <= 0) {
			System.out.println("Invalid number!");
		}
	//	while(userInput.contain())
		
		player(gameboard,userInput ,"player");
		
		//Get cpu inputs
		Random rand = new Random();
		int cpuInput = rand.nextInt(9)+ 1;
		
		player(gameboard,cpuInput ,"cpu");
		
		//print game board
		printboard(gameboard);
		}
		
		
	}//*

}//*
