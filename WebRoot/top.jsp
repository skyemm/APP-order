

<%@ page contentType="text/html;charset=utf-8" language="java" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<LINK href="css/admin.css" type="text/css" rel="stylesheet">
</HEAD>
<BODY>
<TABLE cellSpacing=0 cellPadding=0 width="100%" 
background="images/header_bg.jpg" border=0>
  <TR height=56>
    <TD width=260><IMG height=56 src="images/header_left.jpg" 
    width=260></TD>
    <TD style="FONT-WEIGHT: bold; COLOR: #fff; PADDING-TOP: 20px" 
      align=middle>当前用户： <%=request.getSession().getAttribute("screen_name")%> &nbsp;&nbsp; 
      <A style="COLOR: #fff"  href=""  target=main onclick="editPassword();">修改口令</A> &nbsp;&nbsp;
      
      <a href="logout.do" target="_parent"  style="COLOR: #fff"  target=_top>退出系统</A> 
    </TD>
    <TD align=right width=268><IMG height=56 
      src="images/header_right.jpg" width=268></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
  <TR bgColor=#1c5db6 height=4>
    <TD></TD></TR></TABLE>
 

<script>

	function editPassword(){
		window.open('updatePassword.jsp',"_blank","height=400,width=500,status=yes,toolbar=no,menubar=no,location=no,top=300,left=300");
	}

</script>
</BODY></HTML>




