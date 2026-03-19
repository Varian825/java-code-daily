<%-- 
    Document   : search
    Created on : Mar 19, 2026, 10:52:42 PM
    Author     : anvan
--%>

<%@page import="model.UniversityDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="dashboard.jsp"/>
        
        <%--<%@include file="dashboard.jsp" %>--%> 
        <!-- cai th nay no se dem src code qua day roi moi bien dich chung
        de gay bug neu 2 bien trung nhau
            cai jsp:include la bie dich rieng r moi chay code day nen se lau hon khi bien dich nhung k bugs
        -->
        
        <%
            if ((UserDTO) session.getAttribute("user") != null) {
                String keywords = request.getAttribute("keywords") + "";
                keywords = keywords.equals("null") ? "" : keywords;
                ArrayList<UniversityDTO> list = new ArrayList<UniversityDTO>();
                if (request.getAttribute("list") != null) {
                    list = (ArrayList<UniversityDTO>) request.getAttribute("list");
                }
        %>
        <form action="MainController" method="post">
            <input type="hidden" name="action" value="search">
            Input name: <input type="text" name="keywords" value="<%=keywords%>">
            <input type="submit" value="search">
        </form>
        <hr/>
        <table border = "1">
            <thead>
            <th>Id</th>
            <th>Name</th>
            <th>Short Name</th>
            <th>City</th>
            <th>Region</th>
            <th>Type</th>
            <th>Founded Year</th>
            <th>Students</th>
            <th>Faculties</th>
            <th></th>
        </thead>
        <%
            if (list.size() == 0) {
        %>
        No data matching the search criteria found!
        <%
        } else {
            for (UniversityDTO u : list) {

        %>
        <tr>
            <td><%=u.getId()%></td>
            <td><%=u.getName()%></td>
            <td><%=u.getShortName()%></td>
            <td><%=u.getCity()%></td>
            <td><%=u.getRegion()%></td>
            <td><%=u.getType()%></td>
            <td><%=u.getFoundedYear()%></td>
            <td><%=u.getTotalStudents()%></td>
            <td><%=u.getTotalFaculties()%></td>
            <td>
                <input type="submit" value="update" style="display: <%=u.isIsDraft() ? "block" : "none"%>">

            </td>
        </tr>
        <%                }
            }
        %>
    </table>
    <%  } else {
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>
