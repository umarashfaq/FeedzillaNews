package com.umarashfaq.sample;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/", "/list"})
public class ListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Source src = new DummySource();
		List<Item> items = src.fetch();
		
		req.setAttribute("items", items);
		
		req.getRequestDispatcher("/WEB-INF/index.jsp")
			.forward(req, resp);
	}
}
