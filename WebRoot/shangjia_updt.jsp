
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
    
    <title>商家记录</title><script language="javascript" src="js/Calendar.js"></script>
    <LINK href="inc/style.css" type=text/css rel=stylesheet>

  </head>
<script language="javascript">
function check()
{
	
	if(document.form1.yonghuming.value==""){alert("请输入登陆名"); document.form1.yonghuming.focus();return false;}
	if(document.form1.mima.value==""){alert("请输入密码"); document.form1.mima.focus();return false;}
	if(document.form1.mingcheng.value==""){alert("请输入商家名称"); document.form1.mingcheng.focus();return false;}
	if(document.form1.dianhua.value==""){alert("请输入电话"); document.form1.dianhua.focus();return false;}
	if(document.form1.dizhi.value==""){alert("请输入地址"); document.form1.dizhi.focus();return false;}
}
</script>
  <body >
  <%
  String id=request.getParameter("id");
   %>
  <form name="form1" id="form1" method="post" action="shangjia_updt_post.jsp?id=<%=id %>">
  修改商家记录:
  <br><br>
  <%
  String sql="select * from  shangjia  where id="+id;
     	 		String yonghuming = "" ;  
     	 		String mima = "" ;  
     	 		String mingcheng = "" ;  
     	 		String dianhua = "" ;  
     	 		String dizhi = "" ;  
  ResultSet RS_result=connDbBean.executeQuery(sql);
  while(RS_result.next()){
     	 		yonghuming = RS_result.getString("yonghuming")  ;  
     	 		mima = RS_result.getString("mima")  ;  
     	 		mingcheng = RS_result.getString("mingcheng")  ;  
     	 		dianhua = RS_result.getString("dianhua")  ;  
     	 		dizhi = RS_result.getString("dizhi")  ;  
  }
   %>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">  
   
   <tr><td>登陆名：</td><td><input type="text" name='yonghuming' value='<%=yonghuming%>'  id='yonghuming'></input></td></tr>
   <tr><td>密码：</td><td><input type="text" name='mima' value='<%=mima%>'  id='mima'></input></td></tr>
   <tr><td>商家名称：</td><td><input type="text" name='mingcheng' value='<%=mingcheng%>'  id='mingcheng'></input></td></tr>
   <tr><td>电话：</td><td><input type="text" name='dianhua' value='<%=dianhua%>'  id='dianhua'></input></td></tr>
   <tr><td>地址：</td><td><input type="text" name='dizhi' value='<%=dizhi%>'  id='dizhi'></input></td></tr>
	 
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" value="提交" onClick="return check();" />
      <input type="reset" name="Submit2" value="重置" /></td>
    </tr>
  </table>
</form>

  </body>
</html>


