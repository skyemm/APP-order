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
 String sql = "insert into  liuyanban (  " + 
         			" biaoti, " +  
         			" neirong, " +  
         			" shijian, " +  
         			" uid, " +  
         			" xingming ) values(' " + 
         			request.getParameter("biaoti") + "','"+ 
         			request.getParameter("neirong") + "','"+ 
         			request.getParameter("shijian") + "','"+ 
         			request.getParameter("uid") + "','"+ 
         			request.getParameter("xingming") + "') ";

	
//  	  	 sql="insert into liuyanban( gonghao,xingming,jiangcheng,shiyou) values('"+gonghao+"','"+xingming+"','"+jiangcheng+"','"+shiyou+"') ";
  	  	
  	  	connDbBean.executeUpdate(sql);
  	  	out.print("<script>alert('添加成功!!');location.href='liuyanban_add.jsp';</script>");
  	  
//	}
//RS_result.close();

 %>
  </body>
</html>

