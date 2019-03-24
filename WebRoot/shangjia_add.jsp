
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
    
    <title>商家</title><LINK href="inc/style.css" type=text/css rel=stylesheet>
    <script language="javascript" src="js/Calendar.js"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	    <script type="text/javascript">
	    function up(tt)
	    {
	        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:300,height:50});
            pop.setContent("contentUrl","upload.jsp?Result="+tt);
            pop.setContent("title","文件上传");
            pop.build();
            pop.show();
	    }
	</script>
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
  
  <form name="form1" id="form1" method="post" action="shangjia_add_post.jsp">
  添加商家:
  <br><br>
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF" style="border-collapse:collapse">    
   
   
		   <tr><td>登陆名：</td><td>
			<input type="text" name='yonghuming'  id='yonghuming'  size='100'    ></input>
			
   			</td></tr>
		
		   <tr><td>密码：</td><td>
			<input type="text" name='mima'  id='mima'  size='100'    ></input>
			
   			</td></tr>
		
		   <tr><td>商家名称：</td><td>
			<input type="text" name='mingcheng'  id='mingcheng'  size='100'    ></input>
			
   			</td></tr>
		
		   <tr><td>电话：</td><td>
			<input type="text" name='dianhua'  id='dianhua'  size='100'    ></input>
			
   			</td></tr>
		
		   <tr><td>地址：</td><td>
			<input type="text" name='dizhi'  id='dizhi'  size='100'    ></input>
			
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

