<%-- 
    Document   : ageCalculator
    Created on : Sep 21, 2017, 1:57:41 PM
    Author     : 578291
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form action="agecalculator" method="post">
                <input type="text" name="age">
                <input type="submit" name="submit">
            </form>
            <p>
                ${yourage}
            </p>
        </div>
    </body>
</html>
