<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/28
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
<style>
    tr td{
        border: 1px solid black;
        width: 150px;
        height: 30px;
        text-align: center;
    }
</style>

<body>
     <table border="0" cellpadding="0" cellspacing="0" class="table table-bordered table-striped">
              <tr>
                  <td>学号</td>
                  <td>姓名</td>
                  <td>性别</td>
                  <td>电话</td>
                  <td>地址</td>
                  <td>生日</td>
                  <td>班级</td>
                  <td>专业</td>
              </tr>
         <c:forEach var="list" items="${list}">
             <tr>
                 <td>${list.sno}</td>
                 <td>${list.sname}</td>
                 <td>${list.ssex}</td>
                 <td>${list.sphone}</td>
                 <td>${list.saddress}</td>
                 <td>${list.sbirthday}</td>
                 <td>${list.studentClass.classname}</td>
                 <td>${list.studentClass.speciality}</td>
             </tr>
         </c:forEach>
         <tr>
             <td colspan="8"><ul class="pagination">${info}</ul></td>
         </tr>
     </table>
</body>
</html>
