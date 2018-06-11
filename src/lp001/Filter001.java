package lp001;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "Filter001")
public class Filter001 implements Filter {
    public void destroy() {
        System.out.println("销毁过滤器!");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        //将Servlet对象，转化成HttpServlet对象
        HttpServletResponse httpServletResponse = (HttpServletResponse)resp;
        HttpServletRequest httpServletRequest = (HttpServletRequest)req;
        String name = httpServletRequest.getParameter("name");
        if ("liupeng".equals(name)) {
            System.out.println("遇到刘鹏！");
            chain.doFilter(httpServletRequest, httpServletResponse );
        } else {
            chain.doFilter(httpServletRequest, httpServletResponse );
        }
        // 放行 (去到Servlet)
        // 如果有下一个过滤器，进入下一个过滤器，否则就执行访问servlet
                // 把请求传回过滤链

    }

    public void init(FilterConfig config) throws ServletException {
        String name = config.getInitParameter("name");
        System.out.println("name = " + name + ".");
    }

}
