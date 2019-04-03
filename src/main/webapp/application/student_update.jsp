<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<base href="<%=request.getContextPath()+"/"%>">
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="student/update">
        <table border="1px" cellspacing="0px">
            <tr>
                <td>姓名</td>
                <td>
                    <input type="text" name="name" value="${sysStudent.name}"/>
                    <input type="hidden" name="id" value="${sysStudent.id}"/>
                </td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="name" value="${sysStudent.age}"/></td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <select class="select" name="sex" id="sex" size="1">
                        <c:choose>
                            <c:when test="${sysStudent.sex==1}">
                                <option value="0">女</option>
                                <option value="1" selected="selected">男</option>
                            </c:when>
                            <c:otherwise>
                                <option value="0" selected="selected">女</option>
                                <option value="1">男</option>
                            </c:otherwise>
                        </c:choose>
                    </select>
                </td>
            </tr>
            <tr>
                <td>班级</td>
                <td><input type="text" name="name" value="${sysStudent.classId}"/></td>
            </tr>
        </table>
        <input type="submit" value="修改">
    </form>
</body>
</html>
