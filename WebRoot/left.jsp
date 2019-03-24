<%@ page contentType="text/html;charset=utf-8" language="java" %>

 <%
	if( request.getSession().getAttribute("type") !=null   ){
		String type = request.getSession().getAttribute("type").toString() ;
		if( type.equals("5") ){
  			response.sendRedirect("left0.jsp");
  			return;
		}else if( type.equals("0") ){
	 // 管理员
  			response.sendRedirect("left1.jsp"); 
  			return;
		}
	} 
	// 管理员
	response.sendRedirect("left1.jsp");
%>

