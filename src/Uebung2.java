
public class Uebung2 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		int[] punkte = new int [4]; //erzeugt ein Integer Aray mit der "Länge" 4;
		punkte[0] =17;
		punkte[1] =42;
		punkte[2] =99;
		punkte[3] =86;
		
		int[] punkte2 = {8,15,32,47,11};
		String[] hunde = {"Susi","Strolchi","Rex","Tari","Arya"};
		
		int pos = 0;
		
		for (int i: punkte2)
		{
			System.out.println(i + " " + hunde[pos]);			
			pos++;
		}
		
		for (String a: hunde)
		{
			System.out.println(a);
		}
	}

}
