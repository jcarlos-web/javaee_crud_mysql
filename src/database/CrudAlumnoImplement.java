/**
 * 
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.AlumnoModel;


/**
 * @author <jCarlos:Mendoza/>
 * 
 * Proyecto: database
 * Código: CrudAlumnoImplement.java
 * Fecha: 19/04/2017
 *
 */
public class CrudAlumnoImplement implements CrudAlumno
{
	private Conexion mysql;
	private Connection conexion;
	private String sql;
	private int result;
	private int count = 0;
	

	public CrudAlumnoImplement() {
		mysql = new Conexion();
		conexion = mysql.getConnection();
	}

	/* (non-Javadoc)
	 * @see database.CrudAlumno#readAll()
	 */
	@Override
	public List<AlumnoModel> readAll() {
		List<AlumnoModel> list = new ArrayList<AlumnoModel>();
		try 
		{
			sql = "SELECT * FROM alumno";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				AlumnoModel model = new AlumnoModel();
				model.setId(rs.getInt("id"));
				model.setNombre(rs.getString("nombre"));
				model.setAp_pat(rs.getString("ap_pat"));
				model.setAp_mat(rs.getString("ap_mat"));
				model.setGenero(rs.getString("genero"));
				model.setSemestre(rs.getString("semestre"));
				
				list.add(model);
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}


	/* (non-Javadoc)
	 * @see database.CrudAlumno#getAlumnoById(int)
	 */
	@Override
	public AlumnoModel getAlumnoById(int id) {
		AlumnoModel model = new AlumnoModel();
		try 
		{
			sql = "SELECT * FROM alumno WHERE id=?";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				model.setId(rs.getInt("id"));
				model.setNombre(rs.getString("nombre"));
				model.setAp_pat(rs.getString("ap_pat"));
				model.setAp_mat(rs.getString("ap_mat"));
				model.setGenero(rs.getString("genero"));
				model.setSemestre(rs.getString("semestre"));
			}
			rs.close();
			pst.close();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return model;
		
	}

	/* (non-Javadoc)
	 * @see database.CrudAlumno#createAlumno(model.AlumnoModel)
	 */
	@Override
	public boolean createAlumno(AlumnoModel model) {
		// TODO Auto-generated method stub
		try 
		{
			sql = "INSERT INTO alumno(nombre, ap_pat, ap_mat, genero, semestre)"+
				  "VALUES(?,?,?,?,?)";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, model.getNombre());
			pst.setString(2, model.getAp_pat());
			pst.setString(3, model.getAp_mat());
			pst.setString(4, model.getGenero());
			pst.setString(5, model.getSemestre());
			
			result = pst.executeUpdate();
			if(result != 0)
				return true;
			else
				return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}

	}

	/* (non-Javadoc)
	 * @see database.CrudAlumno#updateAlumno(model.AlumnoModel)
	 */
	@Override
	public boolean updateAlumno(AlumnoModel model) {
		// TODO Auto-generated method stub
		try 
		{
			sql = "UPDATE alumno SET nombre=?, ap_pat=?, ap_mat=?, genero=?, semestre=? WHERE id=?";
			
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, model.getNombre());
			pst.setString(2, model.getAp_pat());
			pst.setString(3, model.getAp_mat());
			pst.setString(4, model.getGenero());
			pst.setString(5, model.getSemestre());
			pst.setInt(6, model.getId());
			
			result = pst.executeUpdate();
			if(result != 0)
				return true;
			else
				return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}

	/* (non-Javadoc)
	 * @see database.CrudAlumno#deleteAlumno(int)
	 */
	@Override
	public boolean deleteAlumno(int id) {
		// TODO Auto-generated method stub
		try 
		{
			sql = "DELETE FROM alumno WHERE id=?";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setInt(1, id);
			result = pst.executeUpdate();
			if(result != 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}

}
