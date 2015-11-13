
public class Uebung5 {

	public static void main(String[] args) {
		int[] zahlen1 = {1,5,8,9,12,33,17,25,14,11};
		
		int ergebniss =0;
		for (int a=0;a < zahlen1.length; a++)
		{
			ergebniss = ergebniss + zahlen1[a];
		}
		System.out.println(ergebniss);
	
	int vergleichsZahl=6;

	boolean nEnthalten = check(zahlen1,vergleichsZahl);
	
	System.out.println(nEnthalten);
	}
	public static boolean check(int[] zahlen1, int n)
	{
		for (int b = 0; b < zahlen1.length; b++ )
		{
			if (zahlen1[b] == n)
			{
			return true;
			}
			else 
			{
				continue;
			}
		}
		return false;
	}
}
