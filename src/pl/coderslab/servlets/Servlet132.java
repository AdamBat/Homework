package pl.coderslab.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet132
 */
@WebServlet("/Servlet032")
public class Servlet132 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String products[] = { "Asus Transformr;2999.99", "iPhone 6';3499.18", "Converse Sneakers;125.00",
			"LG OLED55B6P OLED TV;6493.91", "Samsung HT-J4100;800.99", "Alpine Swiss Dress Belt;99.08",
			"60 Watt LED;1.50", "Arduino Nano;3.26", };

	public Servlet132() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		try {

			int id = Integer.parseInt(request.getParameter("id"));
			writer.append(products[id].toString());

		} catch (Exception e) {
			writer.append("Product not found");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
