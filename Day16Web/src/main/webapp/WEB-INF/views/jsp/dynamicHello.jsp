<%--
  Created by IntelliJ IDEA.
  User: desair4
  Date: 12/16/2016
  Time: 7:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%--Directives--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Dynamic Jsp</title>
</head>
<body>
Ssup !!
<%
    //Scriplets
    System.out.println("Hello");
%>
<%--<c:set var="date" value="${param.currentTimestamp}"/>--%>
<%--<h3>Current time is : ${date}</h3>--%>
<%--<h3>Current time is : ${date}</h3>--%>
<%--<h3>Current time is : <% ${currentTimestamp} %>/></h3>--%>
</body>
</html>