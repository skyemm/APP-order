package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class shangjia_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>商家记录</title><LINK href=\"inc/style.css\" type=text/css \r\n");
      out.write("rel=stylesheet>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body >\r\n");
      out.write("  <p>已有商家记录列表：</p>\r\n");
      out.write("  <form name=\"form1\" id=\"form1\" method=\"post\" action=\"\">\r\n");
      out.write("   搜索:   &nbsp; \r\n");
      out.write("\t登陆名：<input name=\"yonghuming\" type=\"text\" id=\"yonghuming\" /> \r\n");
      out.write("\t商家名称：<input name=\"mingcheng\" type=\"text\" id=\"mingcheng\" /> \r\n");
      out.write("     <input type=\"submit\" name=\"Submit\" value=\"查找\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"1\" align=\"center\" cellpadding=\"3\" cellspacing=\"1\" bordercolor=\"00FFFF\" style=\"border-collapse:collapse\">  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"30\" align=\"center\" bgcolor=\"CCFFFF\">序号</td>\r\n");
      out.write("    \r\n");
      out.write("        \t<td bgcolor='#CCFFFF'>登陆名</td>  \r\n");
      out.write("        \t<td bgcolor='#CCFFFF'>密码</td>  \r\n");
      out.write("        \t<td bgcolor='#CCFFFF'>商家名称</td>  \r\n");
      out.write("        \t<td bgcolor='#CCFFFF'>电话</td>  \r\n");
      out.write("        \t<td bgcolor='#CCFFFF'>地址</td>  \r\n");
      out.write("    \r\n");
      out.write("    <td width=\"60\" align=\"center\" bgcolor=\"CCFFFF\">操作</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");

  String sql="";
  sql="select * from   shangjia  where 1=1";
				  if(request.getParameter("yonghuming")=="" ||request.getParameter("yonghuming")==null )
				  {}
				  else
				  {
				  	sql=sql+" and yonghuming like '%"+ request.getParameter("yonghuming") +"%'";
				  }
				  if(request.getParameter("mingcheng")=="" ||request.getParameter("mingcheng")==null )
				  {}
				  else
				  {
				  	sql=sql+" and mingcheng like '%"+ request.getParameter("mingcheng") +"%'";
				  }
 
  sql=sql+" order by id desc";
  
 ResultSet RS_result=connDbBean.executeQuery(sql);
 String id="";
  
  								
 int i=0;
 
 while(RS_result.next()){
	 i=i+1;
	 id=RS_result.getString("id");  

      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"30\" align=\"center\">");
      out.print(i );
      out.write("</td>\r\n");
      out.write("        \t<td>");
      out.print(RS_result.getString("yonghuming"));
      out.write("</td> \r\n");
      out.write("        \t<td>");
      out.print(RS_result.getString("mima"));
      out.write("</td> \r\n");
      out.write("        \t<td>");
      out.print(RS_result.getString("mingcheng"));
      out.write("</td> \r\n");
      out.write("        \t<td>");
      out.print(RS_result.getString("dianhua"));
      out.write("</td> \r\n");
      out.write("        \t<td>");
      out.print(RS_result.getString("dizhi"));
      out.write("</td> \r\n");
      out.write("    \r\n");
      out.write("    <td width=\"60\" align=\"center\"><a href=\"shangjia_updt.jsp?id=");
      out.print(id);
      out.write("\">修改</a>  <a href=\"del.jsp?id=");
      out.print(id );
      out.write("&tablename=shangjia\" onClick=\"return confirm('真的要删除？')\">删除</a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \t");

  }
   
      out.write("\r\n");
      out.write("</table><br>\r\n");
      out.write("以上数据共");
      out.print(i );
      out.write("条,<a style=\"cursor:hand\" onClick=\"javascript:window.print();\">打印本页</a>\r\n");
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
