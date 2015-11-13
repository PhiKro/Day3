
public class Uebung5 {

	public static void main(String[] args) {
		int[] zahlen1 = {1,5,8,9,12,33,17,25,14,11};
		
		int ergebniss =0; // Ergebniss auf 0 setzen. 
		for (int a=0;a < zahlen1.length; a++) // Schleifensteuerung. Variable / Exitbedingung/ Modifikator je Run 
		{
			ergebniss = ergebniss + zahlen1[a]; //Alle im Array enthaltenen Zahlen zusammenzählen und in die Ergebnissvariable speichern.  
		}
		System.out.println(ergebniss); // Ergebniss ausgeben. 
	//zu suchende Zahl definieren 
	int vergleichsZahl=6;
	// Ergebniss Variable setzen und variablen an das Unterprogramm übergeben
	boolean nEnthalten = check(zahlen1,vergleichsZahl);
	
	System.out.println(nEnthalten);
	}
	public static boolean check(int[] zahlen1, int n) //Prüfprogramm für den Vergleich 
	{
		for (int b = 0; b < zahlen1.length; b++ ) // Beginn der Schleife
		{
			if (zahlen1[b] == n) // Vergleich der Aktuellen Zahl im Array mit der gesuchten Zahl. 
			{
				return true; // Erfolgreich, Methode wird mit Erfolg beendet 
			}
			else 
			{
				continue; // Once more from the Top
			}
		} // Ende der Schleife 
		
		return false; // Fehlschlag die Zahl ist nicht enthalten und der lauf wird beendet. 
	}
}
