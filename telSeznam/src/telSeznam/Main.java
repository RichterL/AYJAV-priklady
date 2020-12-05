package telSeznam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		InputStream inp = System.in;
		BufferedReader reader = new BufferedReader(new InputStreamReader(inp));
		TreeMap<String, String> telSeznam = new TreeMap<String, String>();
		String jmeno ="", cislo;
		do {
			try {				
				System.out.println("\n"
						+ "Vyberte z menu:\n"
						+ "1. Vlozeni noveho kontaktu\n"
						+ "2. Hledani kontaktu\n" + "3. Vypis kontaktu\n");
				String volba = reader.readLine();
				if (volba != null)
					switch (volba.charAt(0)) {
					case '1':
						System.out.print("Jmeno: ");
						jmeno = reader.readLine();
						System.out.print("Cislo: ");
						cislo = reader.readLine();
						telSeznam.put(jmeno, cislo);
						break;
					case '2':
						System.out.print("Hledany kontakt: ");
						jmeno = reader.readLine();
						if (telSeznam.containsKey(jmeno)) {
							System.out.println("Nalezeno telefonni cislo " + telSeznam.get(jmeno));
						} else {
							System.out.println("Kontakt nenalezen");
						}
						break;
					case '3':
						for (Entry<String, String> s : telSeznam.entrySet()) {
							System.out.println(s.getKey() + ", " + s.getValue());
						}
						break;
					default:
						System.out.println("Nespravna volba\n");
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (jmeno != null);
	}

}
