package com.Hason.jspTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Hason
 * @Description
 * @ProjectName javaweb
 * @createtime 22:29
 */
public class PringHtml extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
//        通过响应回传html也没数据
        PrintWriter writer = resp.getWriter();

        writer.write("<!DOCTYPE html>\r\n");
        writer.write("<html>\r\n");
        writer.write("<head>\r\n");
        writer.write("<meta charset=\"utf-8\">\r\n");
        writer.write("<title>标题</title>\r\n");
        writer.write("</head>\r\n");
        writer.write("<body>\r\n");
        writer.write("<h1>回传的HTML页面</h1>");
        writer.write("</body>\r\n");
        writer.write("</html>\r\n");

    }
}
