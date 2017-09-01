package cr.ac.ucr.proyectAdministracionBD.Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EstudianteDao {

	
	//leer archivo
	public void leerArchivo() {
		
		BufferedReader br = null;
		String line = "";
		//Se define separador ","
		String cvsSplitBy = ";";
		System.out.println("hola");
		try {
	    br = new BufferedReader(new FileReader("C:/Users/Diana/git/ProyectoAdministracionBD/archivo.csv"));
		    while ((line = br.readLine()) != null) {                
		        String[] datos = line.split(cvsSplitBy);
		       System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] + ", " + datos[3] + ", " + datos[4] + ", " + datos[5]);
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
