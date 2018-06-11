package lp001;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet005")
public class Servlet005 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //response.setCharacterEncoding("UTF-8");
        //request.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        name = new String(name.getBytes("ISO8859-1"),"UTF-8");
        System.out.println("name:" + name);

        //String newName = request.

        out.println("<h1>" + name + "</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
