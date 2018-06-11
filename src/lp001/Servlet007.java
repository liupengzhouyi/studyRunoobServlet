package lp001;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet(name = "Servlet007")
public class Servlet007 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie name = new Cookie("name", URLEncoder.encode(request.getParameter("name")));
        Cookie password = new Cookie("password",URLEncoder.encode(request.getParameter("password")));

        name.setMaxAge(60*60*24);
        password.setMaxAge(60*60*24);

        response.addCookie(name);
        response.addCookie(password);

        PrintWriter out = response.getWriter();

        out.println(request.getParameter("name"));
        out.println("<br>");
        out.println(request.getParameter("password"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
