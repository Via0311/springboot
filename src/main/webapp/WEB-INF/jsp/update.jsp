<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 张天然
  Date: 2018/9/17
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form >

<table>

  <input type="hidden" name="tid" value="${entities.tid}">

    <tr>
        <td>票品名称：</td>
        <td><input name="tname" value="${entities.tname}"></td>
    </tr>
    <tr>
        <td>票价：</td>
        <td><input name="tprice" value="${entities.tprice}"></td>
    </tr>
    <tr>
        <td>折扣：</td>
        <td><input name="tdiscount" value="${entities.tdiscount}"></td>
    </tr>
    <tr>
        <td>场馆：</td>
        <td>
            <select name="vid" id="venue" >
            </select>
        </td>
    </tr>
    <tr>
        <td>支付方式：</td>
        <td id="cb">

        </td>
    </tr>
    <tr>
        <td>宣传图：</td>
        <td ></td>
    </tr>
    <tr>
        <td>上下架状态：</td>
        <td>
            <c:choose>
                <c:when test="${'0' eq entities.tstatus}">
                    <input type="radio" name="tstatus" value="0" checked="checked">下架
                    <input type="radio" name="tstatus" value="1">上架
                </c:when>
                <c:when test="${'1' eq entities.tstatus}">
                    <input type="radio" name="tstatus" value="0" >下架
                    <input type="radio" name="tstatus" value="1" checked="checked">上架
                </c:when>
                <c:otherwise>
                    <input type="radio" name="tstatus" value="0" >下架
                    <input type="radio" name="tstatus" value="1" checked="checked">上架
                </c:otherwise>
            </c:choose>

        </td>
    </tr>
</table>
    <input type="button" onclick="edit()" value="提交">
</form>

<script type="text/javascript"
        src="<%=request.getContextPath() %>/css/js/jquery-1.8.2.min.js">
</script>
<script type="text/javascript">

    $(function(){
             $.post("/venue",{},function (data) {
                    var ss=${entities.vid};
                    for (var i = 0; i < data.length; i++) {
                        $("#venue").append("<option "+"<c:if test="ss==data[i].vid?'selected':''"></c:if>"+" value='"+data[i].vid+"'>"+data[i].vname+"</option>");
                    }
            },"json")

            $.post("/paytype",{},function (data) {
                if (data != null) {
                    for (var i = 0; i < data.length; i++) {
                        $("#cb").append("<input type='checkbox' name='ids' value='"+data[i].ptid+"'>"+data[i].ptname+"");
                    }
                }},"json")
        })

        function edit(){
            alert("sffds")
            $.post("/edit",$("form").serialize(),function (data) {
                if (data>0) {
                    alert("成功")
                    location.href="list";
                }},"json")
        }
</script>
</body>
</html>
