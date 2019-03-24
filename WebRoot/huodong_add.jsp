
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
    
    <title>优惠活动</title><LINK href="inc/style.css"  type=text/css rel=stylesheet>
    <script language="javascript" src="js/Calendar.js"></script>

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
  
  <form name="form1" id="form1" method="post" action="huodong_add_post.jsp">
  添加优惠活动:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">    
   
		   <tr><td>标题：</td><td>
			<input type="text" name='biaoti'  id='biaoti'   ></input>
   			</td></tr>
		   <tr><td>内容：</td><td>
			<input type="text" name='neirong'  id='neirong'   ></input>
   			</td></tr>
		   <tr><td>发布时间：</td><td>
			<input type="text" name='shijian'  id='shijian'  readonly='readonly' onClick="getDate(document.form1.shijian,'2')" need='1'   ></input>
   			</td></tr>
   
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>

