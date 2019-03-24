package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/commons/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>管理系统后台</title>\r\n");
      out.write("<LINK href=\"css/admin.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/js.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");

if(request.getAttribute("s") != null){


      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\talert('用户名或者密码错误!');\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<BODY onload=document.LogonForm.name.focus();>\r\n");
      out.write("<TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" bgColor=#002779  border=0>\r\n");
      out.write("  <TR>\r\n");
      out.write("    <TD align=middle>\r\n");
      out.write("      <div align=\"center\">\r\n");
      out.write("      <div style=\"font-family:宋体; color:#FFFFFF; filter:Glow(Color=#000000,Strength=2); WIDTH: 100%; FONT-WEIGHT: bold; FONT-SIZE: 19pt; margin-top:5pt\">\r\n");
      out.write("          <div align=\"center\" class=\"STYLE5\"> <br /> 管理系统  <br />  <br /> <br />\t</div>\r\n");
      out.write("        </div>    \r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=468 border=0>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><IMG height=23 src=\"images/login_1.jpg\" \r\n");
      out.write("          width=468></TD></TR>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><IMG height=147 src=\"images/login_2.jpg\" \r\n");
      out.write("            width=468></TD></TR></TABLE>\r\n");
      out.write("            \r\n");
      out.write("            <form id=\"LogonForm\" method=\"post\" action=\"login.do\"  >\r\n");
      out.write("            \r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=468 bgColor=#ffffff border=0>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD width=16><IMG height=122 src=\"images/login_3.jpg\" \r\n");
      out.write("            width=16></TD>\r\n");
      out.write("          <TD align=middle>\r\n");
      out.write("            <TABLE cellSpacing=0 cellPadding=0 width=230 border=0>\r\n");
      out.write("              \r\n");
      out.write("\t\t\t  <TR height=5>\r\n");
      out.write("                <TD width=5></TD>\r\n");
      out.write("                <TD width=56></TD>\r\n");
      out.write("                <TD></TD></TR>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("              <TR height=26>\r\n");
      out.write("                <TD></TD>\r\n");
      out.write("                <TD>用户名</TD>\r\n");
      out.write("                <TD>\r\n");
      out.write("                <INPUT \r\n");
      out.write("                  style=\"BORDER-RIGHT: #000000 1px solid; BORDER-TOP: #000000 1px solid; BORDER-LEFT: #000000 1px solid; BORDER-BOTTOM: #000000 1px solid\" \r\n");
      out.write("                  maxLength=30 size=24 name='name' dataType=\"Require\" msg=\"不能为空\" ></TD></TR>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("              <TR height=26>\r\n");
      out.write("                <TD>&nbsp; </TD>\r\n");
      out.write("                <TD>密　码</TD>\r\n");
      out.write("                <TD><INPUT \r\n");
      out.write("                  style=\"BORDER-RIGHT: #000000 1px solid; BORDER-TOP: #000000 1px solid; BORDER-LEFT: #000000 1px solid; BORDER-BOTTOM: #000000 1px solid\" \r\n");
      out.write("                  type=password  name='password' maxLength=30 size=24 dataType=\"Require\" msg=\"不能为空\" >\r\n");
      out.write("\t\t\t \r\n");
      out.write("                </TD></TR>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("              <TR height=26>\r\n");
      out.write("                <TD>&nbsp; </TD>\r\n");
      out.write("                <TD>类型</TD> \r\n");
      out.write("                <TD>\r\n");
      out.write("\t\t\t\t\t<select name=\"type\">\r\n");
      out.write("\t\t\t\t\t\t<option  value=\"管理员\">管理员</option>\r\n");
      out.write("\t\t\t\t\t\t<option  value=\"商家\">商家</option> \r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("                </TD></TR>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("              <TR height=5>\r\n");
      out.write("                <TD colSpan=3></TD></TR>\r\n");
      out.write("              <TR>\r\n");
      out.write("                <TD>&nbsp;</TD>\r\n");
      out.write("                <TD>&nbsp;</TD>\r\n");
      out.write("                <TD>  \t\r\n");
      out.write("                <INPUT type=image height=18 width=70  src=\"images/bt_login.gif\">\r\n");
      out.write("                  \r\n");
      out.write("                  </TD></TR></FORM></TABLE></TD>\r\n");
      out.write("          <TD width=16>\r\n");
      out.write("          <IMG height=122 src=\"images/login_4.jpg\"  width=16  onclick=\"form_submit()\" >\r\n");
      out.write("          </TD></TR></TABLE>\r\n");
      out.write("            \r\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=468 border=0>\r\n");
      out.write("        <TR>\r\n");
      out.write("          <TD><IMG height=16 src=\"images/login_5.jpg\" \r\n");
      out.write("          width=468></TD></TR></TABLE>\r\n");
      out.write("  \t\t</TD></TR></TABLE>\r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("\t\t<!--\t<img src=\"images/cz.gif\" width=\"57\" height=\"20\" onclick=\"form_reset()\"> -->\r\n");
      out.write("\t\t\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction form_submit(){\r\n");
      out.write(" \r\n");
      out.write("\t\t\tLogonForm.submit(); \t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction form_reset(){\r\n");
      out.write("\t\tLogonForm.reset();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /commons/taglibs.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /commons/taglibs.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    }
    return false;
  }
}
