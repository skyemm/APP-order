package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left0_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML><HEAD>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<LINK href=\"css/admin.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("\tfunction expand(el)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tchildObj = document.getElementById(\"child\" + el);\r\n");
      out.write("\r\n");
      out.write("\t\tif (childObj.style.display == 'none')\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tchildObj.style.display = 'block';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tchildObj.style.display = 'none';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=170 \r\n");
      out.write("background=images/menu_bg.jpg border=0>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD vAlign=top align=middle>\r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        \r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD height=10></TD></TR></TABLE>\r\n");
      out.write("      \r\n");
      out.write("\t  \r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>\r\n");
      out.write("        <TR height=22>\r\n");
      out.write("          <TD style=\"PADDING-LEFT: 30px\" background=images/menu_bt.jpg><A \r\n");
      out.write("            class=menuParent onclick=expand(2) \r\n");
      out.write("            href=\"javascript:void(0);\">菜谱管理</A></TD></TR>\r\n");
      out.write("            \r\n");
      out.write("        <TR height=4>\r\n");
      out.write("          <TD></TD></TR></TABLE>\r\n");
      out.write("      <TABLE id=child2 style=\"DISPLAY: none\" cellSpacing=0 cellPadding=0  width=150 border=0>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("        <TR height=20>\r\n");
      out.write("          <TD align=middle width=30><IMG height=9 \r\n");
      out.write("            src=\"images/menu_icon.gif\" width=9></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("          <A class=menuChild  href=\"foodsEdit.jsp\"  target=main>新增菜谱</A>\r\n");
      out.write("          </TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("\t\t\r\n");
      out.write("        <TR height=20>\r\n");
      out.write("          <TD align=middle width=30><IMG height=9 \r\n");
      out.write("            src=\"images/menu_icon.gif\" width=9></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("          <A class=menuChild  href=\"foodList.do\"  target=main>显示所有</A>\r\n");
      out.write("          </TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\t</TABLE>\r\n");
      out.write("\t\r\n");
      out.write("\t \r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>\r\n");
      out.write("        <TR height=22>\r\n");
      out.write("          <TD style=\"PADDING-LEFT: 30px\" background=images/menu_bt.jpg><A \r\n");
      out.write("            class=menuParent onclick=expand(4) \r\n");
      out.write("            href=\"javascript:void(0);\">订单管理</A></TD></TR>\r\n");
      out.write("        <TR height=4>\r\n");
      out.write("          <TD></TD></TR></TABLE>\r\n");
      out.write("      <TABLE id=child4 style=\"DISPLAY: none\" cellSpacing=0 cellPadding=0 \r\n");
      out.write("      width=150 border=0>\r\n");
      out.write("        <TR height=20>\r\n");
      out.write("          <TD align=middle width=30><IMG height=9 \r\n");
      out.write("            src=\"images/menu_icon.gif\" width=9></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("          <A class=menuChild  href=\"order.do\"  target=main>订单管理</A>\r\n");
      out.write("          </TD></TR>\r\n");
      out.write("     \r\n");
      out.write("\t  </TABLE>\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t   <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>\r\n");
      out.write("        <TR height=22>\r\n");
      out.write("          <TD style=\"PADDING-LEFT: 30px\" background=images/menu_bt.jpg><A \r\n");
      out.write("            class=menuParent onclick=expand(5) \r\n");
      out.write("            href=\"javascript:void(0);\">优惠活动管理</A></TD></TR>\r\n");
      out.write("        <TR height=4>\r\n");
      out.write("          <TD></TD></TR></TABLE>\r\n");
      out.write("          \r\n");
      out.write("      <TABLE id=child5 style=\"DISPLAY: none\" cellSpacing=0 cellPadding=0  width=150 border=0>\r\n");
      out.write("        \r\n");
      out.write("        <TR height=20>\r\n");
      out.write("          <TD align=middle width=30><IMG height=9 \r\n");
      out.write("            src=\"images/menu_icon.gif\" width=9></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("          <A class=menuChild  href=\"huodong_add.jsp\"  target=main>新增优惠活动</A>\r\n");
      out.write("          </TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        \r\n");
      out.write("        <TR height=20>\r\n");
      out.write("          <TD align=middle width=30><IMG height=9 \r\n");
      out.write("            src=\"images/menu_icon.gif\" width=9></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("          <A class=menuChild  href=\"huodong_list.jsp\"  target=main>优惠活动管理</A>\r\n");
      out.write("          </TD></TR>\r\n");
      out.write("        \r\n");
      out.write("\t  </TABLE>\r\n");
      out.write("\t    \r\n");
      out.write("\t     <TABLE cellSpacing=0 cellPadding=0 width=150 border=0>\r\n");
      out.write("        <TR height=22>\r\n");
      out.write("          <TD style=\"PADDING-LEFT: 30px\" background=images/menu_bt.jpg><A \r\n");
      out.write("            class=menuParent onclick=expand(6) \r\n");
      out.write("            href=\"javascript:void(0);\">留言板管理</A></TD></TR>\r\n");
      out.write("        <TR height=4>\r\n");
      out.write("          <TD></TD></TR></TABLE>\r\n");
      out.write("          \r\n");
      out.write("      <TABLE id=child6 style=\"DISPLAY: none\" cellSpacing=0 cellPadding=0  width=150 border=0>\r\n");
      out.write("        \r\n");
      out.write("        <TR height=20>\r\n");
      out.write("          <TD align=middle width=30><IMG height=9 \r\n");
      out.write("            src=\"images/menu_icon.gif\" width=9></TD>\r\n");
      out.write("          <TD>\r\n");
      out.write("          <A class=menuChild  href=\"liuyanban_list.jsp\"  target=main>留言板管理</A>\r\n");
      out.write("          </TD></TR>\r\n");
      out.write("        \r\n");
      out.write("\t  </TABLE>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</BODY></HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
