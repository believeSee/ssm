<%--
  Created by IntelliJ IDEA.
  User: 96562
  Date: 2020/3/12
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>allStudent</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <style>
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>

    <div class="container-fluid" style="margin-top: 50px;">
        <div class="row-fluid">
            <div class="span12">
                <blockquote>
                    <p>
                        所有学生
                    </p>
                </blockquote>
            </div>
        </div>
        <a type="button" class="btn btn-success" href="${pageContext.request.contextPath}/studentController/toInsertOneStudent">添加学生</a>

        <form action="/studentController/searchByName" class="form-inline" style="display: inline-block; float: left;">
            <input class="form-control" name="name" type="text" />
            <button type="submit" class="btn btn-default btn-sm active">查找</button>
        </form>


        <div class="row-fluid">
            <div class="span12">
                <table class="table table-striped table-condensed table-hover">
                    <thead>
                        <tr>
                            <th>姓名</th>
                            <th>年龄</th>
                            <th>性别</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="student" items="${studentList}" >
                        <tr>
                            <td>${student.name}</td>
                            <td>${student.age}</td>
                            <td>${student.sex}</td>
                            <td>
                                <a href="/studentController/toUpdatePage?id=${student.id}">更改</a>
                                &nbsp;|&nbsp;
                                <a href="/studentController/deleteStudent?id=${student.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
