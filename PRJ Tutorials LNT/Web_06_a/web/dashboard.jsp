<%-- 
    Document   : a.jsp
    Created on : 08-01-2026, 11:15:32
    Author     : tungi
--%>

<%@page import="model.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserDTO u = (UserDTO)session.getAttribute("user");
            if (u!=null){       
        %>
                <h1>Welcome, <%=u.getFullName()%> </h1>
                <a href="search.jsp">Search</a> <br/>
                <a href="MainController?action=logout&">Logout</a>
        <%  } else {
                response.sendRedirect("login.jsp");
            }
        %>
        
        
    </body>
</html>
