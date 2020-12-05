package telSeznam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TelSeznam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream inp = System.in;
		BufferedReader reader = new BufferedReader(new InputStreamReader(inp));
		TreeMap<String, String> telSeznam = new TreeMap<String, String>();
		String jmeno ="", cislo;
		do {
			try {
				System.out.println("Vyberte z menu:\n"
						+ "1. Vlozeni noveho kontaktu\n"
						+ "2. Hledani kontaktu\n" + "3. Vypis kontaktu\n");
				jmeno = reader.readLine();
				if (jmeno != null)
					switch (jmeno.charAt(0)) {
					case '1':
						//doplòte váš kód!
						//zde se program zepta nejdrive na jmeno, pak na telefonni cislo. Pokud jsou oba retezce OK,
						//pak se vlozi novy zaznam do mapy telSeznam
					case '2':
						//doplòte váš kód!
						//zde se program zepta na jmeno a pak se pokusi najit v telSeznam telefonni cislo.
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
