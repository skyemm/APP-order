package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updatePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"zh-cn\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>修改密码</title>\r\n");
      out.write("<link href=\"common/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>   \r\n");

	String result = ""; 
	if(request.getAttribute("result") != null){
		result = request.getAttribute("result").toString();
	}

	if(result.equals("0")){
		result = "原密码错误.";
	}
	if(result.equals("1")){


      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\talert('修改密码成功.');\r\n");
      out.write("\t\twindow.close();\r\n");
      out.write("</script>\r\n");

		return;
	}

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("\r\n");
      out.write("\t<form method=\"post\" id=\"demo\"  action=\"updatePassword.do\" >\r\n");
      out.write("\t\t<br></br>\r\n");
      out.write("\t\t<label>");
      out.print(result);
      out.write("</label>\r\n");
      out.write("\t\t<p>\t原密码\t<input name=\"oldPassword\" id=\"oldPassword\" type=\"password\"  /> </p>\r\n");
      out.write("\t\t<p>\t新密码\t<input name=\"newPassword\" id=\"newPassword\" type=\"password\" /> </p>\r\n");
      out.write("\t\t<p>\t重复新密码\t<input name=\"secondPassword\" dataType=\"Repeat\" to=\"newPassword\" msg=\"两次输入的密码不一致\"  type=\"password\"  />  </p>\r\n");
      out.write("\t\t<p>\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input name=\"Submit\" type=\"submit\" value=\"确定\" onclick=\"return onSubmit();\"/>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"关闭\" onclick=\"javascript:window.close()\"/>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction onSubmit(){\r\n");
      out.write("\t\t\tif(document.getElementById('oldPassword').value == ''){\r\n");
      out.write("\t\t\t\talert('请输入原密码');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(document.getElementById('newPassword').value != document.getElementById('secondPassword').value){\r\n");
      out.write("\t\t\t\talert('新密码和二次输入的新密码不一致');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t}\t\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
