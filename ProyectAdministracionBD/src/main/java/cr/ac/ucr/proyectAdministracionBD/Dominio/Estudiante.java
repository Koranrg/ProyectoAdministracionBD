package cr.ac.ucr.proyectAdministracionBD.Dominio;

public class Estudiante {

	String cedula,nombre,apellidos;
 int edad;
public Estudiante(String cedula, String nombre, String apellidos, int edad) {
	super();
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
}
public Estudiante() {

}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
}
 
 
}
