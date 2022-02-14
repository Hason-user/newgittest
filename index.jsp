<%--
  Created by IntelliJ IDEA.
  User: clh66
  Date: 2022/1/15
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>jsp页面</title>
  </head>
  <body>
  <%
    for(int i = 0;i < 100;i++) {
      out.println("Hello,word!");
  %>
  <br>
  <% } %>
  <%="Hello,word!!" %>
  </body>
</html>
