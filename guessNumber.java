import java.util.*;

// Guesser will guess a number.
class Guesser{
	int guessNum;     // variable to store a guessed number
	
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser, guess a number: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player{
	int guessNum;
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player, guess a number: ");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Umpire{
	//Umpire has:
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	//Umpire can do:
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser(); // object for guesser, to invoke his activity
		numFromGuesser = g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1 = new Player();
		numFromPlayer1 = p1.guessNum();
		
		Player p2 = new Player();
		numFromPlayer2 = p2.guessNum();
		
		Player p3 = new Player();
		numFromPlayer3 = p3.guessNum();
	}
	void compare() 
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All Players guessed correctly and won the game.");
			}
			else if (numFromGuesser==numFromPlayer2) 
			{
				System.out.println("Player-1 & Player-2 guessed correctly and won the game.");
			}
			else if (numFromGuesser==numFromPlayer3) 
			{
				System.out.println("Player-1 & Player-3 guessed correctly and won the game.");
			}
			else
			{
				System.out.println("Player 1 guessed correctly.");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if (numFromGuesser==numFromPlayer3) 
			{
				System.out.println("Player-2 & Player-3 guessed correctly and won the game.");
			}
			else
			{
			System.out.println("Player 2 guessed correctly.");
		}
		}
		else if (numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game.");
		}
		else 
		{
			System.out.println("No one has guessed the correct number; Try Again!");
		}
	}
}

//Main Program
public class guessNumber {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
	}
}
