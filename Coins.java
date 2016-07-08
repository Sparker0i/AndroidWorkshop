import java.util.*;
import java.io.*;


public class Coins
{
	public static void main(String args[])
	{
		int T;
		Scanner scn = new Scanner(System.in);
		T = scn.nextInt();
		int i = -1;
		int E[] = new int[T], F[] = new int[T] , FW[] = new int[T] , min = 0;
		int j = -1;
		while (++j < T)
		{
			min = 0;
			E[j] = scn.nextInt();
			F[j] = scn.nextInt();
			FW[j] = F[j] - E[j];
			int N;
			N = scn.nextInt();
			int k = -1;
			int P[] = new int[N] , W[] = new int[N];
			while (++k < N)
			{
				P[k] = scn.nextInt();
				W[k] = scn.nextInt();
			}
			int a , Num[] = new int[N];
			for (a = 0; a < N; ++a)
			{
				Num[a] = FW[j] % W[a];
				if (Num[a] == 0)
					min = P[a] * FW[j] / W[a];
			}
			for (a = 0; a < N; ++a)
			{
				if (Num[a] == 0)
				{
					int amount = P[a] * FW[j] / W[a];
					if (amount < min)
						min = amount;
				}
			}
			if (min == 0)
				System.out.print("This is Impossible\n");
			else
				System.out.print("The Minimum Amount Is : " + min + "\n");
		}
	}
}
