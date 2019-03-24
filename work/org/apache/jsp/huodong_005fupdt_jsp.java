package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class huodong_005fupdt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>优惠活动记录</title><script language=\"javascript\" src=\"js/Calendar.js\"></script>\r\n");
      out.write("    <LINK href=\"inc/style.css\"  type=text/css rel=stylesheet>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tif(document.form1.biaoti.value==\"\"){alert(\"请输入标题\"); document.form1.biaoti.focus();return false;}\r\n");
      out.write("\tif(document.form1.neirong.value==\"\"){alert(\"请输入内容\"); document.form1.neirong.focus();return false;}\r\n");
      out.write("\tif(document.form1.shijian.value==\"\"){alert(\"请输入发布时间\"); document.form1.shijian.focus();return false;}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("  <body >\r\n");
      out.write("  ");

  String id=request.getParameter("id");
   
      out.write("\r\n");
      out.write("  <form name=\"form1\" id=\"form1\" method=\"post\" action=\"huodong_updt_post.jsp?id=");
      out.print(id );
      out.write("\">\r\n");
      out.write("  修改优惠活动记录:\r\n");
      out.write("  <br><br>\r\n");
      out.write("  ");

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
   
      out.write("\r\n");
      out.write("   <table width=\"100%\" border=\"1\" align=\"center\" cellpadding=\"3\" cellspacing=\"1\" bordercolor=\"#00FFFF\" style=\"border-collapse:collapse\">  \r\n");
      out.write("   \r\n");
      out.write("   <tr><td>标题：</td><td><input type=\"text\" name='biaoti' value='");
      out.print(biaoti);
      out.write("'  id='biaoti'></input></td></tr>\r\n");
      out.write("   <tr><td>内容：</td><td><input type=\"text\" name='neirong' value='");
      out.print(neirong);
      out.write("'  id='neirong'></input></td></tr>\r\n");
      out.write("   <tr><td>发布时间：</td><td><input type=\"text\" name='shijian' value='");
      out.print(shijian);
      out.write("'  id='shijian'></input></td></tr>\r\n");
      out.write("\t \r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("      <td><input type=\"submit\" name=\"Submit\" value=\"提交\" onClick=\"return check();\" />\r\n");
      out.write("      <input type=\"reset\" name=\"Submit2\" value=\"重置\" /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
