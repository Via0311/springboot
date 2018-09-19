<%--
  Created by IntelliJ IDEA.
  User: 张天然
  Date: 2018/8/31
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<button onclick="preAdd()">添加</button>

<form action="list" method="post">
    <input type="text" name="name" value="${vo.name}">
    <input type="submit" value="查询">
</form>

<table>

    <tr>
        <td>票品名称</td>
        <td>场馆</td>
        <td>票价（元）</td>
        <td>折扣%</td>
        <td>支付方式</td>
        <td>宣传图片</td>
        <td>创建时间</td>
        <td>修改时间</td>
        <td>状态</td>
        <td>操作</td>
    </tr>

<c:forEach items="${entities}" var="e" >
    <tr>
        <td>${e.tname}</td>
        <td>${e.vname}</td>
        <td>${e.tprice}</td>
        <td>${e.tdiscount}</td>
        <td>${e.ptnames}</td>
        <td><img src="${e.tpicture}" width="45px" height="21px"></td>
        <td>${e.tcreatetime}</td>
        <td>${e.tupdatetime}</td>
        <td>
            <c:if test="${e.tstatus==0}">下架</c:if>
            <c:if test="${e.tstatus==1}">上架</c:if>
        </td>
        <td>

            <c:if test="${e.tstatus==0}"><button onclick="putaway(${e.tid})">上架</button></c:if>
            <c:if test="${e.tstatus==1}"><button onclick="soldout(${e.tid})">下架</button></c:if>

            <button onclick="preUpd(${e.tid})">修改</button>
        </td>
    </tr>


</c:forEach>


    <tr>

        <td colspan="12">
            <a href="list?page=1&name=${vo.name}">首页</a>
            <a href="list?page=${page-1<1?1:page-1}&name=${vo.name}">上一页</a>
            <a href="list?page=${page+1>pages?pages:page+1}&name=${vo.name}">下一页</a>
            <a href="list?page=${pages}&name=${vo.name}">尾页</a>

            当前页${page}/总页数${pages}
        </td>
    </tr>
</table>



<script type="text/javascript"
        src="<%=request.getContextPath() %>/css/js/jquery-1.8.2.min.js">
</script>
<script type="text/javascript">

    function putaway(tid) {
        alert("sdfd");
        $.post("/putaway",{"tid":tid},function (data) {
            if(data>0){
                alert("上架成功")
                location.href="list";
            }
        },"json");
    }

    function soldout(tid) {
        alert("xiajia")
        $.post("soldout",{"tid":tid},function (data) {
            if(data>0){
                alert("下架成功")
                location.href="list";
            }
        },"json")
    }

    function  preAdd() {
        location.href="preAdd"
    }

    function preUpd(tid){
        location.href="preUpd?tid="+tid;
    }
</script>
</body>
</html>
