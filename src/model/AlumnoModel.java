/**
 * 
 */
package model;

/**
 * @author <jCarlos:Mendoza/>
 * 
 * Proyecto: model
 * Código: AlumnoModel.java
 * Fecha: 19/04/2017
 *
 */
public class AlumnoModel 
{
	private int id;
	private String nombre;
	private String ap_pat;
	private String ap_mat;
	private String genero;
	private String semestre;
	
	public AlumnoModel() {
		super();
	}

	public AlumnoModel(int id, String nombre, String ap_pat, String ap_mat, String genero, String semestre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ap_pat = ap_pat;
		this.ap_mat = ap_mat;
		this.genero = genero;
		this.semestre = semestre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_pat() {
		return ap_pat;
	}

	public void setAp_pat(String ap_pat) {
		this.ap_pat = ap_pat;
	}

	public String getAp_mat() {
		return ap_mat;
	}

	public void setAp_mat(String ap_mat) {
		this.ap_mat = ap_mat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	
	
	

}
