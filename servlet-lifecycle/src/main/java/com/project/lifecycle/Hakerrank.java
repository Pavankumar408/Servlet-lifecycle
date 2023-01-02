package com.project.lifecycle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hakerrank extends HttpServlet {
public Hakerrank() {
	System.out.println("objact is created"+this.getClass().getName());
}
@Override
	public void init() throws ServletException {
		System.out.println("Hakerrank.init()");
	}
//@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Hakerrank.service()");
	//System.out.println("invoked service method(),,,,,,,,,,");
	//}
//@Override
	//public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	//	System.out.println("Hakerrank.service(),child method.............");
	//}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hakerrank.doGet()");
		
	}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hakerrank.doPost()");
	}
@Override
	public void destroy() {
	System.out.println("invoked destroy method()");
	}
}
