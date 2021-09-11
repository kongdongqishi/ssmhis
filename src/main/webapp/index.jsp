<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DocType html>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/jquery-3.4.1.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-table/dist/bootstrap-table.min.css">
    <script src="${pageContext.request.contextPath}/static/bootstrap-table/dist/bootstrap-table.min.js"></script>

    <script src="${pageContext.request.contextPath}/static/bootstrap-table/dist/locale/bootstrap-table-zh-CN.js"></script>

</head>
<body style="margin: 10px">
<div id="tools">
    <button class="btn btn-primary" onclick="modify(-1)">添加</button>
</div>

<div class="modal fade" id="myModal" tabindex="-1" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title" id="myModalLabel">新增商品信息</h4>
            </div>
            <div class="modal-body">
                <form id="editForm" role="form" class="form-horizontal">
                    <%--                        保存记录修改的ID--%>
                    <input type="hidden" name="id">
                    <div class="form-group">
                        <label class="control-label col-sm-2">商品名称</label>
                        <div class="col-sm-10">
                            <input type="text" name="pname" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">价格</label>
                        <div class="col-sm-10">
                            <input type="password" name="price" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">品牌</label>
                        <div class="col-sm-10">
                            <input type="text" name="brand" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">型号</label>
                        <div class="col-sm-10">
                            <input type="text" name="sn" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-sm-2">产地</label>
                        <div class="col-sm-10">
                            <input type="text" name="adress" class="form-control">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" >关闭</button>
                <button type="button" class="btn btn-primary" onclick="save()" >保存</button>
            </div>
        </div>
    </div>
</div>
<table class="table">

</table>

<script>
    $(".table").bootstrapTable({
            url:"${pageContext.request.contextPath}/product/pageList",
            method:'GET',
            pagination:true,
            sidePagination: "server",
            pageNumber:1,
            pageSize:3,
            /* queryParamsType: "undefined",
             queryParams:getParams,*/
            // 显示刷新
            showRefresh: true,
            showColumns:true,


            columns:[
                {
                    field:'pname',
                    title:"商品名称"
                },
                {
                    field:'price',
                    title:"价格"
                },
                {
                    field:'brand',
                    title:"品牌"
                },
                {
                    field:'sn',
                    title:"型号"
                },
                {
                    field:'address',
                    title:"商品产地"
                },
                {
                    field:'pid',
                    title:"操作列"
                }
            ]
        }
    )
    function  search(){
        $(".table").bootstrapTable("refresh");
    }
    function modify(pid){
        if(pid!=-1){
        }
        else{
            $("#editForm").find("input[name='pid']").val("");
            $("#editForm").find("input[name='pname']").val("");
            $("#editForm").find("input[name='brand']").val("");
            $("#editForm").find("input[name='sn']").val("");
            $("#editForm").find("input[name='address']").val("");
            $("#myModal").modal("show");
        }

    }

    // 更新的保存方法
    function save(){
        var data={
            pid:$("#editForm").find("input[name='pid']").val(retData.pid);
            pname:$("#editForm").find("input[name='pname']").val(retData.pname);
            brand:$("#editForm").find("input[name='brand']").val(retData.brand);
            sn:$("#editForm").find("input[name='sn']").val(retData.sn);
            address:$("#editForm").find("input[name='address']").val(retData.address);
        };
        data.id=0;
        $.post("${pageContext.request.contextPath}/product/insert",data,function (retData){
            if(retData.status){
                alert(retData.message);
                $("#myModal").modal("hide");
                search();
            }
            else{
                alert(retData.message);
            }
        })
    }
</script>
</body>
</html>
