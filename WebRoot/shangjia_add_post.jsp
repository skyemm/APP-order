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
 String sql = "insert into  shangjia (  " + 
         			" yonghuming, " +  
         			" mima, " +  
         			" mingcheng, " +  
         			" dianhua, " +  
         			" dizhi ) values( '" + 
         			request.getParameter("yonghuming") + "','"+ 
         			request.getParameter("mima") + "','"+ 
         			request.getParameter("mingcheng") + "','"+ 
         			request.getParameter("dianhua") + "','"+ 
         			request.getParameter("dizhi") + "') ";

	
//  	  	 sql="insert into shangjia( gonghao,xingming,jiangcheng,shiyou) values('"+gonghao+"','"+xingming+"','"+jiangcheng+"','"+shiyou+"') ";
  	  	
  	  	connDbBean.executeUpdate(sql);
  	  	out.print("<script>alert('添加成功!!');location.href='shangjia_add.jsp';</script>");
  	  
//	}
//RS_result.close();

 %>
  </body>
</html>

