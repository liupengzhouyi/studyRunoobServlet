package lp001;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


@WebServlet(name = "Servlet004")
public class Servlet004 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置自动刷新时间 5秒
        response.setIntHeader("Refresh", 1);
        response.setContentType("text/html;charset=UTF-8");
        //使用默认时区和语言环境 获得一个时间
        Calendar calendar = Calendar.getInstance();
        //将Calendar转换成一个时间
        Date date = calendar.getTime();
        //设置时间输出的格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        PrintWriter out = response.getWriter();
        //得到一定格式的时间
        String time = simpleDateFormat.format(date);
        out.println("<h1>" + time + "</h1>");

    }
}
