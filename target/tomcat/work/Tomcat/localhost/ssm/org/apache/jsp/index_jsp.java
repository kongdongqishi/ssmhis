/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-07-23 11:45:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <!-- 页面meta -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>后台管理系统</title>\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\" name=\"viewport\">\n");
      out.write("    <!-- 页面meta /-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/plugins/adminLTE/css/AdminLTE.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/plugins/adminLTE/css/skins/_all-skins.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/style.css\">\n");
      out.write("\n");
      out.write("    <script src=\"static/plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"static/plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"static/plugins/adminLTE/js/app.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        function SetIFrameHeight(){\n");
      out.write("            var iframeid=document.getElementById(\"iframe\"); //iframe id\n");
      out.write("            if (document.getElementById){\n");
      out.write("                iframeid.height =document.documentElement.clientHeight;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- 页面头部 -->\n");
      out.write("    <header class=\"main-header\">\n");
      out.write("        <!-- Logo -->\n");
      out.write("\n");
      out.write("        <a href=\"index.jsp\" class=\"logo\">\n");
      out.write("            <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("            <span class=\"logo-mini\"><b>品优购</b></span>\n");
      out.write("            <!-- logo for regular state and mobile devices -->\n");
      out.write("            <span class=\"logo-lg\"><b>品优购</b>商家后台</span>\n");
      out.write("        </a>\n");
      out.write("        <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("        <nav class=\"navbar navbar-static-top\">\n");
      out.write("            <!-- Sidebar toggle button-->\n");
      out.write("            <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <div class=\"navbar-custom-menu\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("                    <li class=\"dropdown messages-menu\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <i class=\"fa fa-envelope-o\"></i>\n");
      out.write("                            <span class=\"label label-success\">4</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li class=\"header\">你有4个邮件</li>\n");
      out.write("                            <li>\n");
      out.write("                                <!-- inner menu: contains the actual data -->\n");
      out.write("                                <ul class=\"menu\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <!-- start message -->\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <img src=\"static/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <h4>\n");
      out.write("                                                系统消息\n");
      out.write("                                                <small><i class=\"fa fa-clock-o\"></i> 5 分钟前</small>\n");
      out.write("                                            </h4>\n");
      out.write("                                            <p>欢迎登录系统?</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- end message -->\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <img src=\"static/img/user3-128x128.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <h4>\n");
      out.write("                                                团队消息\n");
      out.write("                                                <small><i class=\"fa fa-clock-o\"></i> 2 小时前</small>\n");
      out.write("                                            </h4>\n");
      out.write("                                            <p>你有新的任务了</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <img src=\"static/img/user4-128x128.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <h4>\n");
      out.write("                                                Developers\n");
      out.write("                                                <small><i class=\"fa fa-clock-o\"></i> Today</small>\n");
      out.write("                                            </h4>\n");
      out.write("                                            <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <img src=\"static/img/user3-128x128.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <h4>\n");
      out.write("                                                Sales Department\n");
      out.write("                                                <small><i class=\"fa fa-clock-o\"></i> Yesterday</small>\n");
      out.write("                                            </h4>\n");
      out.write("                                            <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <div class=\"pull-left\">\n");
      out.write("                                                <img src=\"static/img/user4-128x128.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <h4>\n");
      out.write("                                                Reviewers\n");
      out.write("                                                <small><i class=\"fa fa-clock-o\"></i> 2 days</small>\n");
      out.write("                                            </h4>\n");
      out.write("                                            <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- Notifications: style can be found in dropdown.less -->\n");
      out.write("                    <li class=\"dropdown notifications-menu\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                            <span class=\"label label-warning\">10</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li class=\"header\">你有10个新消息</li>\n");
      out.write("                            <li>\n");
      out.write("                                <!-- inner menu: contains the actual data -->\n");
      out.write("                                <ul class=\"menu\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-warning text-yellow\"></i> Very long description here that may not fit into the page and may cause design problems\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-users text-red\"></i> 5 new members joined\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-shopping-cart text-green\"></i> 25 sales made\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <i class=\"fa fa-user text-red\"></i> You changed your username\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer\"><a href=\"#\">View all</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- Tasks: style can be found in dropdown.less -->\n");
      out.write("                    <li class=\"dropdown tasks-menu\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <i class=\"fa fa-flag-o\"></i>\n");
      out.write("                            <span class=\"label label-danger\">9</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li class=\"header\">你有9个新任务</li>\n");
      out.write("                            <li>\n");
      out.write("                                <!-- inner menu: contains the actual data -->\n");
      out.write("                                <ul class=\"menu\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <!-- Task item -->\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <h3>\n");
      out.write("                                                Design some buttons\n");
      out.write("                                                <small class=\"pull-right\">20%</small>\n");
      out.write("                                            </h3>\n");
      out.write("                                            <div class=\"progress xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                    <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- end task item -->\n");
      out.write("                                    <li>\n");
      out.write("                                        <!-- Task item -->\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <h3>\n");
      out.write("                                                Create a nice theme\n");
      out.write("                                                <small class=\"pull-right\">40%</small>\n");
      out.write("                                            </h3>\n");
      out.write("                                            <div class=\"progress xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-green\" style=\"width: 40%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                    <span class=\"sr-only\">40% Complete</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- end task item -->\n");
      out.write("                                    <li>\n");
      out.write("                                        <!-- Task item -->\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <h3>\n");
      out.write("                                                Some task I need to do\n");
      out.write("                                                <small class=\"pull-right\">60%</small>\n");
      out.write("                                            </h3>\n");
      out.write("                                            <div class=\"progress xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-red\" style=\"width: 60%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                    <span class=\"sr-only\">60% Complete</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- end task item -->\n");
      out.write("                                    <li>\n");
      out.write("                                        <!-- Task item -->\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <h3>\n");
      out.write("                                                Make beautiful transitions\n");
      out.write("                                                <small class=\"pull-right\">80%</small>\n");
      out.write("                                            </h3>\n");
      out.write("                                            <div class=\"progress xs\">\n");
      out.write("                                                <div class=\"progress-bar progress-bar-yellow\" style=\"width: 80%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                    <span class=\"sr-only\">80% Complete</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- end task item -->\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"footer\">\n");
      out.write("                                <a href=\"#\">View all tasks</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                    <li class=\"dropdown user user-menu\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <img src=\"static/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                            <span class=\"userName-css\">chendahai</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <!-- User image -->\n");
      out.write("                            <li class=\"user-header\">\n");
      out.write("                                <img src=\"static/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                                <p>\n");
      out.write("                                    <span class=\"userName-css\">chendahai</span>\n");
      out.write("                                    <small>最后登录 11:20AM</small>\n");
      out.write("                                </p>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <!-- Menu Footer-->\n");
      out.write("                            <li class=\"user-footer\">\n");
      out.write("                                <div class=\"pull-left\">\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-default btn-flat\">修改密码</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"pull-right\">\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-default btn-flat\">注销</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <!-- 页面头部 /-->\n");
      out.write("\n");
      out.write("    <!-- 导航侧栏 -->\n");
      out.write("    <aside class=\"main-sidebar\">\n");
      out.write("        <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("        <section class=\"sidebar\">\n");
      out.write("            <!-- Sidebar user panel -->\n");
      out.write("            <div class=\"user-panel\">\n");
      out.write("                <div class=\"pull-left image\">\n");
      out.write("                    <img src=\"static/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pull-left info\">\n");
      out.write("                    <p class=\"userName-css\"> chendahai</p>\n");
      out.write("                    <a href=\"#\"><i class=\"userName-css\"></i> 在线</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"sidebar-menu\"  >\n");
      out.write("                <li class=\"header\">基本信息维护</li>\n");
      out.write("                <li id=\"admin-index\"><a href=\"login.jsp\"><i class=\"glyphicon glyphicon-star\"></i> <span>首页</span></a></li>\n");
      out.write("\n");
      out.write("                <!-- 菜单 -->\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-folder\"></i>\n");
      out.write("                        <span class=\"glyphicon  glyphicon-heart\">科室管理</span>\n");
      out.write("                        <span class=\"pull-right-container\">\n");
      out.write("\t\t\t\t       \t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t   \t\t \t</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("                        <li id=\"admin-list\">\n");
      out.write("                            <a href=\"views/user/list.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"glyphicon  glyphicon-film\"></i> 用户管理\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"admin-update\">\n");
      out.write("                            <a href=\"views/user/update.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"fa fa-circle-o\"></i> 修改用户\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-folder\"></i>\n");
      out.write("                        <span class=\"glyphicon  glyphicon-heart\">用户管理</span>\n");
      out.write("                        <span class=\"pull-right-container\">\n");
      out.write("\t\t\t\t       \t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t   \t\t \t</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("                        <li id=\"admin-list\">\n");
      out.write("                            <a href=\"views/user/list.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"glyphicon  glyphicon-film\"></i> 用户管理\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"admin-update\">\n");
      out.write("                            <a href=\"views/user/update.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"fa fa-circle-o\"></i> 修改用户\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-folder\"></i>\n");
      out.write("                        <span class=\"glyphicon  glyphicon-heart\">挂号级别管理</span>\n");
      out.write("                        <span class=\"pull-right-container\">\n");
      out.write("\t\t\t\t       \t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t   \t\t \t</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("                        <li id=\"admin-list\">\n");
      out.write("                            <a href=\"views/user/list.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"glyphicon  glyphicon-film\"></i> 用户管理\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"admin-update\">\n");
      out.write("                            <a href=\"views/user/update.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"fa fa-circle-o\"></i> 修改用户\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-folder\"></i>\n");
      out.write("                        <span class=\"glyphicon  glyphicon-heart\">结算级别管理</span>\n");
      out.write("                        <span class=\"pull-right-container\">\n");
      out.write("\t\t\t\t       \t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t   \t\t \t</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("                        <li id=\"admin-list\">\n");
      out.write("                            <a href=\"views/user/list.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"glyphicon  glyphicon-film\"></i> 用户管理\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"admin-update\">\n");
      out.write("                            <a href=\"views/user/update.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"fa fa-circle-o\"></i> 修改用户\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"views/user/ill.jsp\" target=\"iframe\">\n");
      out.write("                        <i class=\"fa fa-folder\"></i>\n");
      out.write("                        <span class=\"glyphicon  glyphicon-heart\">诊断目录管理</span>\n");
      out.write("                        <span class=\"pull-right-container\">\n");
      out.write("\t\t\t\t       \t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t   \t\t \t</span>\n");
      out.write("                    </a>\n");
      out.write("                   ");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-folder\"></i>\n");
      out.write("                        <span class=\"glyphicon  glyphicon-heart\">收费项目管理</span>\n");
      out.write("                        <span class=\"pull-right-container\">\n");
      out.write("\t\t\t\t       \t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t   \t\t \t</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("                        <li id=\"admin-drug\">\n");
      out.write("                            <a href=\"views/user/drug.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"glyphicon  glyphicon-film\"></i> 药品项目\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"admin-nodrug\">\n");
      out.write("                            <a href=\"views/user/nodrug.jsp\" target=\"iframe\">\n");
      out.write("                                <i class=\"fa fa-circle-o\"></i> 非药品项目\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"treeview\">\n");
      out.write("                    <a href=\"views/user/schd.jsp\" target=\"iframe\">\n");
      out.write("                        <i class=\"fa fa-folder\"></i>\n");
      out.write("                        <span class=\"glyphicon  glyphicon-heart\">医生排班管理</span>\n");
      out.write("                        <span class=\"pull-right-container\">\n");
      out.write("\t\t\t\t       \t\t\t<i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t   \t\t \t</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("                <!-- 菜单 /-->\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("        <!-- /.sidebar -->\n");
      out.write("    </aside>\n");
      out.write("    <!-- 导航侧栏 /-->\n");
      out.write("\n");
      out.write("    <!-- 内容区域 -->\n");
      out.write("    <div class=\"content-wrapper\">\n");
      out.write("        <iframe width=\"100%\" id=\"iframe\" name=\"iframe\"\tonload=\"SetIFrameHeight()\"\n");
      out.write("                frameborder=\"0\" src=\"home.jsp\"></iframe>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- 内容区域 /-->\n");
      out.write("\n");
      out.write("    <!-- 底部导航 -->\n");
      out.write("    <footer class=\"main-footer\">\n");
      out.write("        <div class=\"pull-right hidden-xs\">\n");
      out.write("            <b>Version</b> 1.0.8\n");
      out.write("        </div>\n");
      out.write("        <strong>Copyright &copy; 2014-2017 <a href=\"http://www.xxx.cn\">研究院研发部</a>.</strong> All rights reserved.\n");
      out.write("    </footer>\n");
      out.write("    <!-- 底部导航 /-->\n");
      out.write("    <script>\n");
      out.write("        $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/logininfo\",function (retData){\n");
      out.write("            if(retData.status){\n");
      out.write("                $(\".userName-css\").html(retData.data.userName)\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                alert(\"未授权\");\n");
      out.write("                location.href=\"login.jsp\";\n");
      out.write("            }\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
