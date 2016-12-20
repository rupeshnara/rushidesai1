<%@ page import="bank.BaseAccount" %><%--
  Created by IntelliJ IDEA.
  User: desair4
  Date: 12/19/2016
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account Results</title>
</head>
<body>
<%
    BaseAccount account = (BaseAccount) request.getAttribute("accountResult");
%>

Account Number : <%= account.getAccountNumber() %><br/>
Current Balance : <%= account.getInitialBalance() %><br/>

</body>
</html>
