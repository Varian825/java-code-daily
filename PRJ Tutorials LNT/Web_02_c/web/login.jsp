<%-- 
    Document   : login
    Created on : Mar 19, 2026, 3:50:38 PM
    Author     : anvan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MainController" method="post">
            Username: <input type="text" name="txtUsername"> <br/>
            Password: <input type="text" name="txtPassword"> <br/>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
