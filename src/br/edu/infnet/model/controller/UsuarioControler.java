package br.edu.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Usuario;


public class UsuarioControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UsuarioControler() {
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("home.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario(request.getParameter("name"), request.getParameter("email"));

		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\">"
				+ "<title>TP1 - Luiz</title>"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">"
				+ "</head>"
				+ "<body>"
				+ "	<div class=\"container\">"
				+ "		<form action=\"usuario\" method=\"get\">"
				+ "			<h3>Usu�rio " + usuario.getNome() + " com o email " + usuario.getEmail() + " cadastrado com sucesso!</h3>"
				+ "			<button class=\"btn btn-danger\" type=\"submit\">Voltar</button>"
				+ "		</form>"
				+ "	</div>"
				+ "</body>"
				+ "</html>");
	}

}
