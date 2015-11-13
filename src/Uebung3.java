
public class Uebung3 {
	public static void main(String[] args) 
	{
		int[] zahlen1 = {8,15,32};
		int[] zahlen2 = {17,47,11};
		
		int i = 0; 
		
		while (i<zahlen1.length)
		{
			System.out.print("+" + (zahlen1[i] + zahlen2[i])+",");
			i++;
		}
		System.out.println("");
		int a=0;
		while (a<zahlen1.length)
		{
		System.out.print("*" + zahlen1[a] * zahlen2[a]+",");
		a++;
		}
	}
}
