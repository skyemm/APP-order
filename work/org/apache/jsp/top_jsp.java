package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<LINK href=\"css/admin.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" \r\n");
      out.write("background=\"images/header_bg.jpg\" border=0>\r\n");
      out.write("  <TR height=56>\r\n");
      out.write("    <TD width=260><IMG height=56 src=\"images/header_left.jpg\" \r\n");
      out.write("    width=260></TD>\r\n");
      out.write("    <TD style=\"FONT-WEIGHT: bold; COLOR: #fff; PADDING-TOP: 20px\" \r\n");
      out.write("      align=middle>当前用户： ");
      out.print(request.getSession().getAttribute("screen_name"));
      out.write(" &nbsp;&nbsp; \r\n");
      out.write("      <A style=\"COLOR: #fff\"  href=\"\"  target=main onclick=\"editPassword();\">修改口令</A> &nbsp;&nbsp;\r\n");
      out.write("      \r\n");
      out.write("      <a href=\"logout.do\" target=\"_parent\"  style=\"COLOR: #fff\"  target=_top>退出系统</A> \r\n");
      out.write("    </TD>\r\n");
      out.write("    <TD align=right width=268><IMG height=56 \r\n");
      out.write("      src=\"images/header_right.jpg\" width=268></TD></TR></TABLE>\r\n");
      out.write("<TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("  <TR bgColor=#1c5db6 height=4>\r\n");
      out.write("    <TD></TD></TR></TABLE>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction editPassword(){\r\n");
      out.write("\t\twindow.open('updatePassword.jsp',\"_blank\",\"height=400,width=500,status=yes,toolbar=no,menubar=no,location=no,top=300,left=300\");\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</BODY></HTML>\r\n");
      out.write("\r\n");
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
