package com.Hason.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 处理文件上传数据
 * @author Hason
 * @Description
 * @ProjectName javaweb
 * @createtime 16:09
 */
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletInputStream inputStream = req.getInputStream();
        File file = new File("D:\\javaweb\\test.txt");
        FileOutputStream op = new FileOutputStream(file);
//        ServletOutputStream op = resp.getOutputStream();
        byte[] buffer = new byte[10];

        int len;
        while ((len = inputStream.read(buffer)) != -1){
            op.write(buffer,0,len);
            op.flush();
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get方法进来的！");
    }
}
