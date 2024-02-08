package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner itemSieveIn = new Scanner(System.in);
		System.out.println("What is your n?");
		int itemSieve = itemSieveIn.nextInt();
		int itemSieveColumn = 10;
		int itemSieveRow = itemSieve/10;
		int[][] sieve = new int[itemSieveRow][itemSieveColumn];
		//boolean array
		boolean[][] primeOrNot = new boolean[itemSieveRow][itemSieveColumn];
		for (int i=0;i<itemSieve;i++)
			for (int x=0; x<itemSieveRow; x++)
			{	
				for (int y=0;y<itemSieveColumn;y++)
				{
					primeOrNot[x][y]=true;

				}
			}
		// filling sieve w numbers
		
		for (int x=0; x<itemSieveRow; x++)
		{	
			for (int y=0;y<itemSieveColumn;y++)
			{
				sieve[x][y]=x*10+y+1;
				System.out.println(sieve[x][y]);
			}
		}

		//Sieve Method
		for (int i=1; i<itemSieve;i++)
		{
			for (int j=1;j<itemSieve/i;j++)
			{
				primeOrNot[i][j]=false;
				
				
			}
		}

	}

}
