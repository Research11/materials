/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2016-05-25 02:36:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tspan{color: red}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkname(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar name=document.getElementById(\"mname\").value;\r\n");
      out.write("\t\tdocument.getElementById(\"name\").innerHTML=\"\";\r\n");
      out.write("\t\tif(name==null || name.length<=0 || name==\"\"){\r\n");
      out.write("\t\t\tdocument.getElementById(\"name\").innerHTML=\"用户名密码不能为空!\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkage(perage){\r\n");
      out.write("\t\tvar age=perage.value;\r\n");
      out.write("\t\tdocument.getElementById(\"age\").innerHTML=\"\";\r\n");
      out.write("\t\tif(age<=0||age>150||age.length<=0){\r\n");
      out.write("\t\t\tdocument.getElementById(\"age\").innerHTML=\"年龄不合法!\";\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkemail(peremail){\r\n");
      out.write("\t\tvar email=peremail.value;\r\n");
      out.write("\t\tvar filter=/^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\r\n");
      out.write("\t\tif(filter.test(email)){\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction checkbirthday(perbirthday){\r\n");
      out.write("\t\tvar birthday=peremail.value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t if(checkname()){\r\n");
      out.write("\t\t\tdocument.getElementById(\"myform\").submit();\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else{\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\talert(\"输入数据有误!\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\t \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"myform\" action=\"save\" method=\"post\" onsubmit =\"return check();\">\r\n");
      out.write("\t\t姓名：<input type=\"text\" id=\"mname\" name=\"name\" onblur=\"checkname();\"/><span id=\"name\"></span><br/>\r\n");
      out.write("\t\t年龄：<input type=\"text\" name=\"age\" onblur=\"checkage(this)\"/><span id=\"age\"></span><br/>\r\n");
      out.write("\t\t邮箱：<input type=\"text\" name=\"email\" onblur=\"checkemail(this)\"/><span id=\"email\"></span><br/>\r\n");
      out.write("\t\t生日：<input type=\"text\" name=\"birthday\" onblur=\"checkbirthday(this)\"/><span id=\"birthday\"></span><br/>\r\n");
      out.write("\t\t<input type=\"button\" onclick=\"check()\" value=\"保存\"/>\r\n");
      out.write("\t\t<input type=\"button\" onclick=\"history.go(-1)\" value=\"返回\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}