/**
 * 
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author <jCarlos:Mendoza/>
 * 
 * Proyecto: database
 * Código: Conexion.java
 * Fecha: 19/04/2017
 *
 */
public class Conexion 
{
	private String driver = "org.gjt.mm.mysql.Driver";
	private String dbname = "db_escuela";
	private String host	  = "jdbc:mysql://localhost:3306/"+dbname;
	private String user	  = "root";
	private String pw	  = "";
	private Connection conexion;
	
	public Connection getConnection()
	{
		try 
		{
			Class.forName(this.driver);
			conexion = DriverManager.getConnection(this.host, this.user, this.pw);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			conexion = null;
		}
		
		return conexion;
	}

}
