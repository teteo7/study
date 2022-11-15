<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>사용자 목록</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    </head>

    <body class="container">
        <h1>사용자 목록</h1>
        <div class="" style="width: 100%; align: center;">

            <div class="table-responsive justify-content-center" style="border: 1px solid black;">
                      <table class="table table-bordered">
                        <thead>
                          <tr>
                            <th class="col-xs-1">이메일</th>
                            <th class="col-xs-6">이름</th>
                            <th class="col-xs-2">나이</th>
                            <th class="col-xs-1">성별</th>
                          </tr>
                        </thead>

                        <tbody>
                        <c:choose>
                            <c:when test="${not empty list}">
                              <c:forEach items="${list}" var="entry" varStatus="idx">
                                <tr>
                                  <td><c:out value="${entry.email}"/></td>
                                  <td><c:out value="${entry.name}"/></td>
                                  <td><c:out value="${entry.age}"/></td>
                                  <td><c:out value="${entry.gender}"/></td>
                                </tr>
                              </c:forEach>
                            </c:when>
                            <c:otherwise>
                              <tr>
                                <td colspan="7">조회된 자료가 없습니다.</td>
                              </tr>
                            </c:otherwise>
                        </c:choose>
                        </tbody>
                      </table>

                    </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    </body>
</html>