<%--
  Created by IntelliJ IDEA.
  User: Grand Circus Student
  Date: 8/18/2017
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WELCOME!</title>
</head>
<body>
<h1><b>Order Form</b></h1>
<br/>
${salutation}<br>

<br/>

<form action="response" method="post">

    <b>What is the stock number of the item you want to order ?</b><br>

    <input name="ItemNumber" type="text" />
    <input type="submit" value="Place Order" />
    </form>
</body>
</html>
