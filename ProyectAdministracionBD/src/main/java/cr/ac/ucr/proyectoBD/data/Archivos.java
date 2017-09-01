package cr.ac.ucr.proyectoBD.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

	public void Archivos() {

	}

	public void LeerArchivo() {

		BufferedReader br = null;
		String line = "";

		try {
			br = new BufferedReader(new FileReader("archivo.csv"));
			while ((line = br.readLine()) != null) {
				String[] datos = line.split(",");

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
