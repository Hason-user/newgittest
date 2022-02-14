<%--
  Created by IntelliJ IDEA.
  User: clh66
  Date: 2022/1/19
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="http://localhost:8080/javaweb/uploadServlet" method="post" enctype="multipart/form-data">
        上传文件：<input type="file" name="file1">
        <input type="submit" value="上传">
    </form>
</body>
</html>
