package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CrudAlumnoImplement;
import model.AlumnoModel;

@WebServlet("/Alumno")
public class Alumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LIST = "/ListadoAlumno.jsp";
	private static final String GATE = "/Alumno.jsp";
	
	private CrudAlumnoImplement crud;

    public Alumno() 
    {
    	crud = new CrudAlumnoImplement();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String forward = "";
		String action  = request.getParameter("action");
		
		if(action.equalsIgnoreCase("create") )
		{
			forward = GATE;
		}
		else if(action.equalsIgnoreCase("update") )
		{
			forward = GATE;
			int id = Integer.parseInt(request.getParameter("id"));
			AlumnoModel alumno = crud.getAlumnoById(id);
			request.setAttribute("enlace", alumno);
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			forward = LIST;
			int id = Integer.parseInt(request.getParameter("id"));
			crud.deleteAlumno(id);
			request.setAttribute("enlaces", crud.readAll());
		}
		else
		{
			forward = LIST;
			request.setAttribute("enlaces", crud.readAll());
		}
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		AlumnoModel model = new AlumnoModel();
		model.setNombre(request.getParameter("nombre"));
		model.setAp_pat(request.getParameter("ap_pat"));
		model.setAp_mat(request.getParameter("ap_mat"));
		model.setGenero(request.getParameter("genero"));
		model.setSemestre(request.getParameter("semestre"));
		
		String id = request.getParameter("id");
		if(id == null | id.isEmpty())
		{
			if(crud.createAlumno(model))
				out.println("<div class='alert alert-info'>Alumno creado correctamente.</div>");
			else
				out.println("<div class='alert alert-info'>Alumno no creado.</div>");
		}
		else
		{
			
			model.setId(Integer.parseInt(request.getParameter("id")));
			
			if(crud.updateAlumno(model))
				out.println("<div class='alert alert-info'>Alumno editado correctamente.</div>");
			else
				out.println("<div class='alert alert-info'>Alumno no editado.</div>");
		}
		
		RequestDispatcher view = request.getRequestDispatcher(LIST);
		request.setAttribute("enlaces", crud.readAll());
		view.forward(request, response);

	}
	
	

}
