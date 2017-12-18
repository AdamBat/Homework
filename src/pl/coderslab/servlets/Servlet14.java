package pl.coderslab.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet14
 */
@WebServlet("/Servlet14")
public class Servlet14 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet14() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Integer> numbers = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(100));
		}
		List<Integer> sorted = new ArrayList<>(numbers);
		Collections.sort(sorted);
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.append("<table border='solid'>");
		for (int i = 0; i < sorted.size(); i++) {
			writer.append("<tr><td>" + numbers.get(i) + "</td><td>" + sorted.get(i) + "</td></tr>");
		}
		writer.append("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
