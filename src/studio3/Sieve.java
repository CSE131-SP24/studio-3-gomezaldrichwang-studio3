package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		//boolean array
		//boolean[] primeOrNot = new boolean[itemSieve];
		//for (int i=0;i<itemSieve;i++)
		//{
		//	primeOrNot[i]= true;
		//}
		// filling sieve w numbers
		Scanner itemSieveIn = new Scanner(System.in);
		System.out.println("What is your n?");
		int itemSieve = itemSieveIn.nextInt();
		int itemSieveColumn = 10;
		int itemSieveRow = itemSieve/10;
		int[][] sieve = new int[itemSieveRow][itemSieveColumn];
		for (int x=0; x<itemSieveRow; x++)
		{	
			for (int y=0;y<itemSieveColumn;y++)
			{
				sieve[x][y]=x*10+y+1;
				System.out.println(sieve[x][y]);
			}
		}

		//

	}

}
