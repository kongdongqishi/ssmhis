/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-07-24 08:58:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class drug_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DocType html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-table/dist/bootstrap-table.min.css\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-table/dist/bootstrap-table.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-table/dist/locale/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 10px\">\r\n");
      out.write("<div id=\"tools\">\r\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"mod()\">新增</button>\r\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"deletebatch()\">删除</button>\r\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"checkall()\">全选</button>\r\n");
      out.write("    <button class=\"btn btn-primary\" onclick=\"nocheckall()\">反选</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">药品信息管理</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"editForm\" role=\"form\" class=\"form-horizontal\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" name=\"id\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2\">药品名称</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2\">备注信息</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"remark\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2\">单价</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"cost\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2\">库存</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"inventory\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"control-label col-sm-2\">所属部门</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"DepartmentId\" class=\"form-control\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" >关闭</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" onclick=\"save()\" >保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"insertModal\" tabindex=\"-1\" aria-hidden=\"true\">\r\n");
      out.write("<div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"></button>\r\n");
      out.write("            <h4 class=\"modal-title\" id=\"insertModalLabel\">新增药品信息</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("            <form id=\"insertForm\" role=\"form\" class=\"form-horizontal\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-label col-sm-2\">药品编号</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"id\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-label col-sm-2\">药品名称</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"name\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-label col-sm-2\">备注信息</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"remark\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-label col-sm-2\">单价</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"cost\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-label col-sm-2\">库存</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"inventory\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"control-label col-sm-2\">所属部门</label>\r\n");
      out.write("                    <div class=\"col-sm-10\">\r\n");
      out.write("                        <input type=\"text\" name=\"DepartmentId\" class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" >关闭</button>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\" onclick=\"insertsave()\" >保存</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(\".table\").bootstrapTable({\r\n");
      out.write("            url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Drug/pageList\",\r\n");
      out.write("            method:'GET',\r\n");
      out.write("            pagination:true,\r\n");
      out.write("            sidePagination: \"server\",\r\n");
      out.write("            pageNumber:1,\r\n");
      out.write("            pageSize:4,\r\n");
      out.write("            queryParamsType: \"undefined\",\r\n");
      out.write("            queryParams:getParams,\r\n");
      out.write("            // 显示刷新\r\n");
      out.write("            showRefresh: true,\r\n");
      out.write("            showColumns:true,\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            columns:[\r\n");
      out.write("                {\r\n");
      out.write("                    field:'id',\r\n");
      out.write("                    title:\"药品编码\",\r\n");
      out.write("                    formatter:function (value, row, index){\r\n");
      out.write("                        return '<input type=\"checkbox\" class=\"id-chk\" value=\"'+value+'\"/>'+value\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    field:'name',\r\n");
      out.write("                    title:\"药品名称\"\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    field:'remark',\r\n");
      out.write("                    title:\"备注信息\"\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    field:'cost',\r\n");
      out.write("                    title:\"单价\"\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    field:'inventory',\r\n");
      out.write("                    title:\"库存\"\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    field:'departmentId',\r\n");
      out.write("                    title:\"所属部门\"\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    field:'id',\r\n");
      out.write("                    title:\"操作列\",\r\n");
      out.write("                    formatter:function (value,row,index){\r\n");
      out.write("                        return '<button class=\"btn btn-primary\" onclick=\"modify('+value+')\">修改</button>'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            ]\r\n");
      out.write("        }\r\n");
      out.write("    )\r\n");
      out.write("    function  search(){\r\n");
      out.write("        $(\".table\").bootstrapTable(\"refresh\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function getParams(params){\r\n");
      out.write("        params[\"name\"]=$(\"#name\").val();\r\n");
      out.write("        params[\"remark\"]=$(\"#remark\").val();\r\n");
      out.write("        return params;\r\n");
      out.write("    }\r\n");
      out.write("    function modify(id){\r\n");
      out.write("        if(id!=-1){\r\n");
      out.write("            $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Drug/byId\",{id:id},function(retData){\r\n");
      out.write("                $(\"#editForm\").find(\"input[name='id']\").val(retData.id);\r\n");
      out.write("                $(\"#editForm\").find(\"input[name='name']\").val(retData.name);\r\n");
      out.write("                $(\"#editForm\").find(\"input[name='remark']\").val(retData.remark);\r\n");
      out.write("                $(\"#editForm\").find(\"input[name='cost']\").val(retData.cost);\r\n");
      out.write("                $(\"#editForm\").find(\"input[name='inventory']\").val(retData.inventory);\r\n");
      out.write("                $(\"#editForm\").find(\"input[name='DepartmentId']\").val(retData.departmentId);\r\n");
      out.write("                $(\"#myModal\").modal(\"show\");\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function mod(){\r\n");
      out.write("        $(\"#insertForm\").find(\"input[name='id']\").val(\"\");\r\n");
      out.write("        $(\"#insertForm\").find(\"input[name='name']\").val(\"\");\r\n");
      out.write("        $(\"#insertForm\").find(\"input[name='remark']\").val(\"\");\r\n");
      out.write("        $(\"#insertForm\").find(\"input[name='cost']\").val(\"\");\r\n");
      out.write("        $(\"#insertForm\").find(\"input[name='inventory']\").val(\"\");\r\n");
      out.write("        $(\"#insertForm\").find(\"input[name='DepartmentId']\").val(\"\");\r\n");
      out.write("        $(\"#insertModal\").modal(\"show\");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 更新的保存方法\r\n");
      out.write("    function save(){\r\n");
      out.write("        var data={\r\n");
      out.write("            id: $(\"#editForm\").find(\"input[name='id']\").val(),\r\n");
      out.write("            name:$(\"#editForm\").find(\"input[name='name']\").val(),\r\n");
      out.write("            remark:$(\"#editForm\").find(\"input[name='remark']\").val(),\r\n");
      out.write("            cost:$(\"#editForm\").find(\"input[name='cost']\").val(),\r\n");
      out.write("            inventory:$(\"#editForm\").find(\"input[name='inventory']\").val(),\r\n");
      out.write("            DepartmentId:$(\"#editForm\").find(\"input[name='DepartmentId']\").val(),\r\n");
      out.write("        };\r\n");
      out.write("        $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Drug/update\",data,function (retData){\r\n");
      out.write("            if(retData.status){\r\n");
      out.write("                alert(retData.message);\r\n");
      out.write("                $(\"#myModal\").modal(\"hide\");\r\n");
      out.write("                search();\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                alert(retData.message);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    function insertsave(){\r\n");
      out.write("        var data={\r\n");
      out.write("            id: $(\"#insertForm\").find(\"input[name='id']\").val(),\r\n");
      out.write("            name:$(\"#insertForm\").find(\"input[name='name']\").val(),\r\n");
      out.write("            remark:$(\"#insertForm\").find(\"input[name='remark']\").val(),\r\n");
      out.write("            cost:$(\"#insertForm\").find(\"input[name='cost']\").val(),\r\n");
      out.write("            inventory:$(\"#insertForm\").find(\"input[name='inventory']\").val(),\r\n");
      out.write("            DepartmentId:$(\"#insertForm\").find(\"input[name='DepartmentId']\").val(),\r\n");
      out.write("        };\r\n");
      out.write("        $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Drug/insert\",data,function (retData){\r\n");
      out.write("            if(retData.status){\r\n");
      out.write("                alert(retData.message);\r\n");
      out.write("                $(\"#insertModal\").modal(\"hide\");\r\n");
      out.write("                search();\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                alert(retData.message);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function deletebatch(){\r\n");
      out.write("        // 遍历复选框中的每个选项，用都好隔开区分每个ids\r\n");
      out.write("        var ids=\"\";\r\n");
      out.write("        $(\".id-chk\").each(function (ele){\r\n");
      out.write("            if(this.checked){\r\n");
      out.write("                if(ids!=\"\")\r\n");
      out.write("                    ids+=\",\";\r\n");
      out.write("                ids+=this.value;\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("        // alert(ids);\r\n");
      out.write("        if(ids==\"\")\r\n");
      out.write("        {\r\n");
      out.write("            alert(\"请选择要删除的记录\");\r\n");
      out.write("            return ;\r\n");
      out.write("        }\r\n");
      out.write("        $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Drug/delbatch\",{ids:ids},function (relData){\r\n");
      out.write("            if(relData.status){\r\n");
      out.write("                alert(relData.message);\r\n");
      out.write("                search();\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("            {\r\n");
      out.write("                alert(relData.message);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function checkall(){\r\n");
      out.write("        var ids=\"\";\r\n");
      out.write("        $(\".id-chk\").each(function(ele){\r\n");
      out.write("            this.checked=true;\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function nocheckall(){\r\n");
      out.write("        var ids=\"\";\r\n");
      out.write("        $(\".id-chk\").each(function(ele){\r\n");
      out.write("            this.checked=false;\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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