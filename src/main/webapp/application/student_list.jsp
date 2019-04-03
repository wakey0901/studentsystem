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
    <table border="1px" cellspacing="0px">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>班级</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${sysStudentList}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>
                <c:if test="${student.sex==1}">
                    男
                </c:if>
                <c:if test="${student.sex==0}">
                    女
                </c:if>
            </td>
            <td>${student.classId}</td>
            <td><a href="student/toUpdate?id=${student.id}">编辑</a>|<a href="student/delete?id=${student.id}">删除</a></td>
        </tr>
        </c:forEach>
    </table>
    <a href="student/add">添加学生</a>
</body>
</html>
