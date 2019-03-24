
<%@ page language="java"  pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page language="java" import="java.sql.*" %>

<jsp:useBean id="connDbBean" scope="page" class="db.db"/>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>优惠活动记录</title><script language="javascript" src="js/Calendar.js"></script>
    <LINK href="inc/style.css"  type=text/css rel=stylesheet>

  </head>
<script language="javascript">
function check()
{
	
	if(document.form1.biaoti.value==""){alert("请输入标题"); document.form1.biaoti.focus();return false;}
	if(document.form1.neirong.value==""){alert("请输入内容"); document.form1.neirong.focus();return false;}
	if(document.form1.shijian.value==""){alert("请输入发布时间"); document.form1.shijian.focus();return false;}
}
</script>
  <body >
  <%
  String id=request.getParameter("id");
   %>
  <form name="form1" id="form1" method="post" action="huodong_updt_post.jsp?id=<%=id %>">
  修改优惠活动记录:
  <br><br>
  <%
  String sql="select * from  huodong  where id="+id;
     	 		String biaoti = "" ;  
     	 		String neirong = "" ;  
     	 		String shijian = "" ;  
  ResultSet RS_result=connDbBean.executeQuery(sql);
  while(RS_result.next()){
     	 		biaoti = RS_result.getString("biaoti")  ;  
     	 		neirong = RS_result.getString("neirong")  ;  
     	 		shijian = RS_result.getString("shijian")  ;  
  }
   %>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   
   <tr><td>标题：</td><td><input type="text" name='biaoti' value='<%=biaoti%>'  id='biaoti'></input></td></tr>
   <tr><td>内容：</td><td><input type="text" name='neirong' value='<%=neirong%>'  id='neirong'></input></td></tr>
   <tr><td>发布时间：</td><td><input type="text" name='shijian' value='<%=shijian%>'  id='shijian'></input></td></tr>
	 
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


