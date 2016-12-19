<%@ page import="child.SavingsAccount" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: desair4
  Date: 12/17/2016
  Time: 3:05 PM
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

<%--Declaration--%>
<%!
    private javax.servlet.jsp.JspWriter out;
%>

<%--Scriplets--%>
<%
    //Scriplets
    //System.out.println("Hello");
    LocalDateTime date = (LocalDateTime) request.getAttribute("currentTimestamp");
    Map<Integer, SavingsAccount> list = (Map<Integer, SavingsAccount>) request.getAttribute("savingsAccountList");
%>

<h3>Current time is : <%= date %>
</h3>

<%--Expressions--%>
<%= request.getRemoteHost()%><br/>
<%= request.getAttribute("currentTimestamp")%>

<table border=1>
    <%
        //        for (int i = 0; i < 5; i++) {
        int i = 0;
        for (Integer accountNumber : list.keySet()) {
    %>
    <tr>
        <%--<td>Number</td>--%>
        <td>AccountNumber <%= i %>
        </td>
        <%--<td><%= i + 1 %>--%>
        <%--<td><%= list.get(accountNumber).getAccountNumber() %>--%>
        <td><%= accountNumber %>
        </td>
    </tr>
    <%
            i++;
        }
    %>
</table>

<br/>

<%
    SavingsAccount account = (SavingsAccount) request.getAttribute("account");
    if (account != null) {
        out.print(account.toString());
    }
%>

<br/>

<%
    if ((Boolean) request.getAttribute("isHello")) {
%>
<p>Hello, world</p>
<%
} else {
%>
<p>Goodbye, world</p>
<%
    }
%>

</body>
</html>