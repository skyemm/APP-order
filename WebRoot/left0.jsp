<%@ page contentType="text/html;charset=utf-8" language="java" %>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<LINK href="css/admin.css" type="text/css" rel="stylesheet">
<SCRIPT language=javascript>
	function expand(el)
	{
		childObj = document.getElementById("child" + el);

		if (childObj.style.display == 'none')
		{
			childObj.style.display = 'block';
		}
		else
		{
			childObj.style.display = 'none';
		}
		return;
	}
</SCRIPT>
</HEAD>
<BODY>
<TABLE height="100%" cellSpacing=0 cellPadding=0 width=170 
background=images/menu_bg.jpg border=0>
  <TR>
    <TD vAlign=top align=middle>
      <TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
        
        <TR>
          <TD height=10></TD></TR></TABLE>
      
	  
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg><A 
            class=menuParent onclick=expand(2) 
            href="javascript:void(0);">菜谱管理</A></TD></TR>
            
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child2 style="DISPLAY: none" cellSpacing=0 cellPadding=0  width=150 border=0>
 
 
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD>
          <A class=menuChild  href="foodsEdit.jsp"  target=main>新增菜谱</A>
          </TD>
        </TR>
		
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD>
          <A class=menuChild  href="foodList.do"  target=main>显示所有</A>
          </TD>
        </TR>
        
        
	</TABLE>
	
	 
      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg><A 
            class=menuParent onclick=expand(4) 
            href="javascript:void(0);">订单管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
      <TABLE id=child4 style="DISPLAY: none" cellSpacing=0 cellPadding=0 
      width=150 border=0>
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD>
          <A class=menuChild  href="order.do"  target=main>订单管理</A>
          </TD></TR>
     
	  </TABLE>
	  
	  
	   <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg><A 
            class=menuParent onclick=expand(5) 
            href="javascript:void(0);">优惠活动管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
          
      <TABLE id=child5 style="DISPLAY: none" cellSpacing=0 cellPadding=0  width=150 border=0>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD>
          <A class=menuChild  href="huodong_add.jsp"  target=main>新增优惠活动</A>
          </TD>
        </TR>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD>
          <A class=menuChild  href="huodong_list.jsp"  target=main>优惠活动管理</A>
          </TD></TR>
        
	  </TABLE>
	    
	     <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
        <TR height=22>
          <TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg><A 
            class=menuParent onclick=expand(6) 
            href="javascript:void(0);">留言板管理</A></TD></TR>
        <TR height=4>
          <TD></TD></TR></TABLE>
          
      <TABLE id=child6 style="DISPLAY: none" cellSpacing=0 cellPadding=0  width=150 border=0>
        
        <TR height=20>
          <TD align=middle width=30><IMG height=9 
            src="images/menu_icon.gif" width=9></TD>
          <TD>
          <A class=menuChild  href="liuyanban_list.jsp"  target=main>留言板管理</A>
          </TD></TR>
        
	  </TABLE>
	

</BODY></HTML>


