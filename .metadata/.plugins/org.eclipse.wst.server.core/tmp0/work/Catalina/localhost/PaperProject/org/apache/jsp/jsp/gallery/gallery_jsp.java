/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-06-25 04:59:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/jsp/common/footer.jsp", Long.valueOf(1545120384000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1534732106000L));
    _jspx_dependants.put("/jsp/common/navi.jsp", Long.valueOf(1545630452000L));
    _jspx_dependants.put("jar:file:/C:/Users/LEEYUJIN/Documents/대외활동/시도/종이내음%20-%20복사본/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/PaperProject/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>종이내음</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/home-style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- navi -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/login.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("   src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js\"></script>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/home-style.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   $(document).ready(function() {\r\n");
      out.write("      $('a.login-window').click(function() {\r\n");
      out.write("\r\n");
      out.write("         // Getting the variable's value from a link \r\n");
      out.write("         var loginBox = $(this).attr('href');\r\n");
      out.write("\r\n");
      out.write("         //Fade in the Popup and add close button\r\n");
      out.write("         $(loginBox).fadeIn(300);\r\n");
      out.write("\r\n");
      out.write("         //Set the center alignment padding + border\r\n");
      out.write("         var popMargTop = ($(loginBox).height() + 24) / 2;\r\n");
      out.write("         var popMargLeft = ($(loginBox).width() + 24) / 2;\r\n");
      out.write("\r\n");
      out.write("         $(loginBox).css({\r\n");
      out.write("            'margin-top' : -popMargTop,\r\n");
      out.write("            'margin-left' : -popMargLeft\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         // Add the mask to body\r\n");
      out.write("         $('body').append('<div id=\"mask\"></div>');\r\n");
      out.write("         $('#mask').fadeIn(300);\r\n");
      out.write("\r\n");
      out.write("         var email = $(\"#username\").val();\r\n");
      out.write("         var pw = $(\"#password\").val();\r\n");
      out.write("\r\n");
      out.write("         //로그인 이메일과 비밀번호 오류시 나타나는 유효성체크\r\n");
      out.write("         $(function() {\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         return false;\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      // When clicking on the button close or the mask layer the popup closed\r\n");
      out.write("      $('a.close, #mask').live('click', function() {\r\n");
      out.write("         $('#mask , .login-popup').fadeOut(300, function() {\r\n");
      out.write("            $('#mask').remove();\r\n");
      out.write("         });\r\n");
      out.write("         return false;\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("   <header>\r\n");
      out.write("      <div class=\"top-menu\">\r\n");
      out.write("         <ul>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <li><a href=\"#\">마이페이지</a></li>\r\n");
      out.write("         </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("         <a href=\"../main/main\"><img src=\"../img/main_logo.png\"\r\n");
      out.write("            style=\"width: 180px; height: 100px;\"></a>\r\n");
      out.write("      </div>\r\n");
      out.write("   </header>\r\n");
      out.write("\r\n");
      out.write("   <!--  <div class=\"row-wrap\">   \r\n");
      out.write("      <div id=\"navbar\" class=\"navbar-collapse collapse set\"> -->\r\n");
      out.write("   <nav class=\"row\">\r\n");
      out.write("      <ul class=\"main-menu\">\r\n");
      out.write("         <li class=\"col-s-3\"><a href=\"../store/storeMain\">서점안내</a>\r\n");
      out.write("            <ul class=\"sub-menu col-s-3\">\r\n");
      out.write("               <li><a href=\"#\">지역별</a>\r\n");
      out.write("                  <ul class=\"sub-sub-menu1 col-s-12\">\r\n");
      out.write("                     <li><a href=\"../store/seoul\">서울</a></li>\r\n");
      out.write("                     <li><a href=\"#\">인천/경기</a></li>\r\n");
      out.write("                     <li><a href=\"#\">충청/강원</a></li>\r\n");
      out.write("                     <li><a href=\"#\">전북/전남</a></li>\r\n");
      out.write("                     <li><a href=\"#\">경북/경남</a></li>\r\n");
      out.write("                     <li><a href=\"#\">제주</a></li>\r\n");
      out.write("                  </ul></li>\r\n");
      out.write("               <li><a href=\"#\">테마별</a>\r\n");
      out.write("                  <ul class=\"sub-sub-menu2 col-s-12\">\r\n");
      out.write("                     <li><a href=\"../store/silent\">조용한</a></li>\r\n");
      out.write("                     <li><a href=\"#\">사진찍기 좋은</a></li>\r\n");
      out.write("                     <li><a href=\"#\">친구와 함께</a></li>\r\n");
      out.write("                     <li><a href=\"#\">예술적인</a></li>\r\n");
      out.write("                  </ul></li>\r\n");
      out.write("            </ul></li>\r\n");
      out.write("         <li class=\"col-s-3\"><a href=\"../gallery/gallery\">갤러리</a></li>\r\n");
      out.write("         <li class=\"col-s-3\"><a href=\"../community/commuList\">커뮤니티</a></li>\r\n");
      out.write("         <li class=\"col-s-3\"><a href=\"../event/eventMain\">이벤트</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </nav>\r\n");
      out.write("   <!--</div>\r\n");
      out.write("   </div>-->\r\n");
      out.write("\r\n");
      out.write("   <div class=\"banner\">\r\n");
      out.write("      <img src=\"../img/banner_1.png\">\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"search\">\r\n");
      out.write("      <input type=\"text\" id=\"search-bar\" placeholder=\"서점 명을 입력하세요.\">\r\n");
      out.write("      <input type=\"image\" id=\"search-btn\" src=\"../img/search.svg\">\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("   <div id=\"login-box\" class=\"login-popup\">\r\n");
      out.write("      <a href=\"#\" class=\"close\"><img class=\"btn_close\"\r\n");
      out.write("         src=\"../img/close_pop.png\" /></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <form id=\"form1\" name=\"form1\" method=\"post\" class=\"signin\" action = \"../main/login_input\">\r\n");
      out.write("         <fieldset>\r\n");
      out.write("\r\n");
      out.write("            <span><h3>Login</h3></span><br/> \r\n");
      out.write("            <label class=\"username\">\r\n");
      out.write("               <input id=\"username\" name=\"email\" value=\"\" type=\"text\"\r\n");
      out.write("               autocomplete=\"on\" placeholder=\"이메일\"><br />\r\n");
      out.write("            </label> \r\n");
      out.write("            <label class=\"password\"> <input id=\"password\"\r\n");
      out.write("               name=\"password\" value=\"\" type=\"password\" placeholder=\"비밀번호\">\r\n");
      out.write("            </label><br /> <br />\r\n");
      out.write("            \r\n");
      out.write("            <br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-warning\">로그인</button>\r\n");
      out.write("            <a href = \"signUp\" id= \"underline\"><button class=\"btn btn-warning\" type=\"button\">회원가입</button></a>\r\n");
      out.write("\r\n");
      out.write("         </fieldset>\r\n");
      out.write("      </form><br />\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <div id = \"message\"></div>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" -->");
      out.write("\r\n");
      out.write("\t<!-- navi end -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- main start -->\t\r\n");
      out.write("\t<div class=\"mar\">\r\n");
      out.write("\t\t<h2>갤러리 ></h2>\r\n");
      out.write("\t\t<div class=\"rig\">\r\n");
      out.write("\t\t\t<h3>인기순</h3>\r\n");
      out.write("\t\t\t<h3>|</h3>\r\n");
      out.write("\t\t\t<h3>최신순</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"gal\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../img/gray.png\" alt=\"\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"gallery-pageNum\">\r\n");
      out.write("\t\t\t<p>1</p>\r\n");
      out.write("\t\t\t<p>2</p>\r\n");
      out.write("\t\t\t<p>3</p>\r\n");
      out.write("\t\t\t<p>4</p>\r\n");
      out.write("\t\t\t<p>5</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- main end -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t\tSSIDO 1조의 프로젝트 웹페이지입니다.<br> <br> <a\r\n");
      out.write("\t\t\thref=\"https://cafe.naver.com/ssido\"><img src=\"../img/navercafe.jpg\"></a>\r\n");
      out.write("\t\t<a href=\"https://www.facebook.com/ssidoIT\"><img src=\"../img/facebook.png\"></a>\r\n");
      out.write("\t\t<br> contact us : ssido@gmail.com<br> ssidoⓒ2018\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("\t<!-- footer end -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("               ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("               ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /jsp/common/navi.jsp(57,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty mb}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  <li class=\"other-menu\"><a href=\"../main/logout\">로그아웃</a></li>\r\n");
          out.write("               ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  <li class=\"other-menu\"><a href=\"../login_input\"\r\n");
          out.write("                     class=\"login-window\">로그인</a></li>\r\n");
          out.write("               ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
