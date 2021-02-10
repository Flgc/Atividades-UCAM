package com.ead.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(urlPatterns = { "/validacao" }, initParams = { @WebInitParam(name = "user", value = "admin"),
		@WebInitParam(name = "pwd", value = "admin") })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		String nome = (String)session.getAttribute("jusuario");

		PrintWriter out  = response.getWriter();
		if (nome == null) {
			response.sendRedirect("login.jsp");
		} else {
			out.print("Parabéns Usuário validado: " + nome);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Obter os parametros de inicialização
		String sloguser = this.getServletConfig().getInitParameter("user");
		String slogpwd = this.getServletConfig().getInitParameter("pwd");

		// Obter valores do formulário
		String slognome = request.getParameter("nome");
		String slogsenha = request.getParameter("senha");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (sloguser.equals(slognome) && slogpwd.equals(slogsenha)) {
			HttpSession session = request.getSession();
			session.setAttribute("jusuario", slognome);
			out.print("Parabéns Usuário validado!");
		} else {
			out.print("Usuário ou senha inválido");
		}

	}

}
