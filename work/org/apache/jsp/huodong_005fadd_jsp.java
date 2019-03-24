package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class huodong_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      db.db connDbBean = null;
      synchronized (_jspx_page_context) {
        connDbBean = (db.db) _jspx_page_context.getAttribute("connDbBean", PageContext.PAGE_SCOPE);
        if (connDbBean == null){
          connDbBean = new db.db();
          _jspx_page_context.setAttribute("connDbBean", connDbBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>优惠活动</title><LINK href=\"inc/style.css\"  type=text/css rel=stylesheet>\r\n");
      out.write("    <script language=\"javascript\" src=\"js/Calendar.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("\tif(document.form1.biaoti.value==\"\"){alert(\"请输入标题\"); document.form1.biaoti.focus();return false;}\r\n");
      out.write("\tif(document.form1.neirong.value==\"\"){alert(\"请输入内容\"); document.form1.neirong.focus();return false;}\r\n");
      out.write("\tif(document.form1.shijian.value==\"\"){alert(\"请输入发布时间\"); document.form1.shijian.focus();return false;}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("  \r\n");
      out.write("  <form name=\"form1\" id=\"form1\" method=\"post\" action=\"huodong_add_post.jsp\">\r\n");
      out.write("  添加优惠活动:\r\n");
      out.write("  <br><br>\r\n");
      out.write("   <table width=\"100%\" border=\"1\" align=\"center\" cellpadding=\"3\" cellspacing=\"1\" bordercolor=\"#00FFFF\" style=\"border-collapse:collapse\">    \r\n");
      out.write("   \r\n");
      out.write("\t\t   <tr><td>标题：</td><td>\r\n");
      out.write("\t\t\t<input type=\"text\" name='biaoti'  id='biaoti'   ></input>\r\n");
      out.write("   \t\t\t</td></tr>\r\n");
      out.write("\t\t   <tr><td>内容：</td><td>\r\n");
      out.write("\t\t\t<input type=\"text\" name='neirong'  id='neirong'   ></input>\r\n");
      out.write("   \t\t\t</td></tr>\r\n");
      out.write("\t\t   <tr><td>发布时间：</td><td>\r\n");
      out.write("\t\t\t<input type=\"text\" name='shijian'  id='shijian'  readonly='readonly' onClick=\"getDate(document.form1.shijian,'2')\" need='1'   ></input>\r\n");
      out.write("   \t\t\t</td></tr>\r\n");
      out.write("   \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("      <td><input type=\"submit\" name=\"Submit\" value=\"提交\" />\r\n");
      out.write("      <input type=\"reset\" name=\"Submit2\" value=\"重置\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
