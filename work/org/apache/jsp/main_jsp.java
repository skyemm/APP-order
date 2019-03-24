package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML><HEAD>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<LINK href=\"css/admin.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" align=center border=0>\r\n");
      out.write("  <TR height=28>\r\n");
      out.write("    <TD background=images/title_bg1.jpg>当前位置: </TD></TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD bgColor=#b1ceef height=1></TD></TR>\r\n");
      out.write("  <TR height=20>\r\n");
      out.write("    <TD background=images/shadow_bg.jpg></TD></TR></TABLE>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"90%\" align=center border=0>\r\n");
      out.write("  <TR height=100>\r\n");
      out.write("    <TD align=middle width=100><IMG height=100 src=\"images/admin_p.gif\" \r\n");
      out.write("      width=90></TD>\r\n");
      out.write("    <TD width=60>&nbsp;</TD>\r\n");
      out.write("    <TD>\r\n");
      out.write("      <TABLE height=100 cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("        \r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD>欢迎进入订餐管理中心！</TD></TR></TABLE></TD></TR>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD colSpan=3 height=10></TD></TR></TABLE>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"95%\" align=center border=0>\r\n");
      out.write("  <TR height=20>\r\n");
      out.write("    <TD></TD></TR>\r\n");
      out.write("  <TR height=22>\r\n");
      out.write("    <TD style=\"PADDING-LEFT: 20px; FONT-WEIGHT: bold; COLOR: #ffffff\" \r\n");
      out.write("    align=middle background=images/title_bg2.jpg> </TD></TR>\r\n");
      out.write("  <TR bgColor=#ecf4fc height=12>\r\n");
      out.write("    <TD></TD></TR>\r\n");
      out.write("  <TR height=20>\r\n");
      out.write("    <TD></TD></TR></TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY></HTML>\r\n");
      out.write("\r\n");
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
