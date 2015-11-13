// For schleifen und deren Steuerung 
// Break und Continue Steuerbefehle.
public class Uebung1 
{
	public static void main(String[] args)
	{
		
		//Von 1-10 in der for Schleife.
		for (int i =1;i<=10; i++)
			{
				System.out.println("Durchlauf: "+i);
			}
		
		//nur jede 5. Zahl ausgeben
		
		for (int i =20; i >=20 && i<=90; i+=5)
			{
				System.out.println(i);
			} 
	
		
		// Nach 10 Gefundenen Zahlen Abbrechen
		int z = 1;
		for (int i =1; i >=1 && i<=100; i++)
			{
				if ((i % 3) == 0)
					{
						System.out.println(i + " Das ist die "+z+" gefundene Zahl");
						z++;
					}
				if (z > 10)
					{
						System.out.println((z-=1)+" Zahlen gefunden, Programm wird beendet!");
						break;
					}
			}
		//werte die durch 5 Teilbar sind oder zwischen 40 - 70 Liegen ignorieren 
		for (int i =1;i<=100; i++)
		{
			if ((i%5)==0 || (i>=40 && i<=70))
			{
				continue;
			}
			System.out.println(+i);
		}
		
	}
		
		
}
