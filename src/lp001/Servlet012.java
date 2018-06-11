package lp001;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet012")
public class Servlet012 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private int hitCount;

    public void init()
    {
        // 重置点击计数器
        hitCount = 0;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hitCount++;
        PrintWriter out = response.getWriter();
        out.println("点击量:" + "<h1>" + hitCount + "</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
