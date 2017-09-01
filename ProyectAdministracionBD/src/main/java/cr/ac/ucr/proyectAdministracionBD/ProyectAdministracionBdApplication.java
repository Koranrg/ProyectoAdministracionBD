package cr.ac.ucr.proyectAdministracionBD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cr.ac.ucr.proyectAdministracionBD.Data.EstudianteDao;

@SpringBootApplication
public class ProyectAdministracionBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectAdministracionBdApplication.class, args);
		EstudianteDao ed = new EstudianteDao();
		ed.leerArchivo();
	}
}
