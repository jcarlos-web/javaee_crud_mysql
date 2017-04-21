/**
 * 
 */
package database;

import java.util.List;
import model.AlumnoModel;
/**
 * @author <jCarlos:Mendoza/>
 * 
 * Proyecto: database
 * Código: Crud.java
 * Fecha: 19/04/2017
 *
 */
public interface CrudAlumno 
{
	public List<AlumnoModel> readAll();
	public AlumnoModel getAlumnoById(int id);
	public boolean createAlumno(AlumnoModel model);
	public boolean updateAlumno(AlumnoModel model);
	public boolean deleteAlumno(int id);
}
