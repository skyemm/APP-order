<%@ page language="java"  pageEncoding="utf-8" import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
request.setCharacterEncoding("utf-8"); 
response.setCharacterEncoding("utf-8"); 
%>
<jsp:useBean id="connDbBean" scope="page" class="db.db"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'adminyanzheng.jsp' starting page</title>
  </head>
  <body>
  <% 


String id = request.getParameter("id");
String sql="update   shangjia set " +
   				" yonghuming ='" + request.getParameter("yonghuming") + "' ," + 
   				" mima ='" + request.getParameter("mima") + "' ," + 
   				" mingcheng ='" + request.getParameter("mingcheng") + "' ," + 
   				" dianhua ='" + request.getParameter("dianhua") + "' ," + 
   				" dizhi ='" + request.getParameter("dizhi") +  "' where id=" + request.getParameter("id");

connDbBean.executeUpdate(sql);
out.print("<script>alert('修改成功!!');location.href='shangjia_list.jsp';</script>");
%>
  </body>
</html>


